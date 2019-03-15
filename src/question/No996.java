package question;

import java.util.ArrayList;
import java.util.Arrays;

public class No996 {
    int result = 0;
    public int numSquarefulPerms(int[] A) {
        Arrays.sort(A);
        help(A, 0, new boolean[A.length], new ArrayList<>());
        return result;
    }

    private void help(int[] nums, int depth, boolean[] used, ArrayList<Integer> curr){
        if (depth==nums.length){
            result++;
            return;
        }
        for (int i=0;i<nums.length;++i){
            if (used[i]){
                continue;
            }
            if (i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            if (curr.size()!=0 && !isSquare(curr.get(curr.size()-1)+nums[i])){
                continue;
            }
            curr.add(nums[i]);
            used[i] = true;
            help(nums, depth+1,used,curr);
            used[i] = false;
            curr.remove(curr.size()-1);
        }
    }

    private boolean isSquare(long a){
        if (a==0){
            return true;
        }
        int i=1;
        while (a>0){
            a-=i;
            if (a==0){
                return true;
            }
            i+=2;
        }
        return false;
    }
}

package question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class No373 {
    /*
    You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
    Define a pair (u,v) which consists of one element from the first array and one element from the second array.
    Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
     */
    //非常暴力的解法，206ms
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>();
        for (int i=0;i<Math.min(nums1.length,k);++i){
            for (int j=0;j<Math.min(nums2.length,k);++j){
                result.add(new int[]{nums1[i],nums2[j]});
            }
        }
        result = result.stream().sorted(Comparator.comparingInt(x -> x[0] + x[1])).collect(Collectors.toList());
        if (result.size() > k){
            result = result.subList(0,k);
        }
        return result;
    }
}

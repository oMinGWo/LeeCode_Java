package question;

import java.util.ArrayList;
import java.util.List;

public class No401 {
    /**
     * @reference https://www.jianshu.com/p/03c422ccd93d
     * @param num
     * @return
     */
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        int[] hours = {8,4,2,1};
        int[] minutes = {32,16,8,4,2,1};
        for (int i=0;i<num;++i){
            List<Integer> h = generate(hours,i);
            List<Integer> m = generate(minutes,num-i);
            for (int hour:h){
                if (hour>11){
                    continue;
                }
                for (int minute:m){
                    if (minute>59){
                        continue;
                    }
                    String s = hour + ":" + (minute<10?"0":"") + minute;
                    result.add(s);
                }
            }
        }
        return result;
    }
    private List<Integer> generate(int[] nums,int count){
        List<Integer> result = new ArrayList<>();
        robot(nums,count,0,0,result);
        return result;
    }
    private void robot(int[] nums,int count,int pos,int out,List<Integer> result){
        if (count == 0){
            result.add(out);
            return;
        }
        for (int i=pos;i<nums.length;++i){
            robot(nums,count-1,i+1,out+nums[i],result);
        }
    }
}

package question;

import java.util.Arrays;

public class No475 {
    public int findRadius(int[] houses, int[] heaters) {
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int i:houses){
            if (i > max){
                max = i;
            }
            if (i < min){
                i = min;
            }
        }
        int length = max - min + 1;
        Arrays.sort(heaters);
        int sum = 0;
        int count = 0;
        for (int i=heaters.length-1;i>=0;--i){
            sum += heaters[i] * 2;
            count++;
            if (sum >= length) {
                break;
            }
        }
        return count;
    }
}

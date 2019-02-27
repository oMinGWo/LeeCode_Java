package question;

import java.util.Stack;

public class No084 {
    //尝试使用单调栈解决
    //一直困在的地方是，记得在数组的最后多加一个0用于比较，不然最后一个数字不会被算进去计算面积
    public int largestRectangleArea2(int[] heights) {
        int[] hh = new int[heights.length + 1];
        System.arraycopy(heights, 0, hh, 0, heights.length);
        hh[heights.length] = 0;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<hh.length;++i){
            while (stack.size()>0 && hh[stack.peek()] >= hh[i]){
                int h = hh[stack.peek()];
                stack.pop();
                int len = stack.size()>0 ? i - stack.peek() -1 : i;
                result = Math.max(result, h * len);
            }
            stack.push(i);
        }
        return result;
    }
    //暴力解法A了 94/96个用例，n^2的还是太暴力了
    public int largestRectangleArea(int[] heights) {
        if (heights==null || heights.length==0){
            return 0;
        }
        int max = heights[0];
        for (int i=0;i<heights.length;++i) {
            for (int j=i;j<heights.length;++j){
                int area = findMin(heights,i,j) * (j - i + 1);
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }
    private int findMin(int a[],int start, int end){
        int min = a[start];
        for (int i=start;i<=end;++i){
            if (a[i]<min){
                min = a[i];
            }
        }
        return min;
    }
}

package question;

public class No556 {
    public int nextGreaterElement(int n) {
        String s = n + "";
        char[] chars = s.toCharArray();
        int index = -1;
        for (int i=chars.length-2;i>=0;--i){
            if (chars[i] < chars[i+1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return -1;
        }
        StringBuilder sub = new StringBuilder(s.substring(index+1));
        sub.reverse();
        String s1 = s.substring(0,index);
        char[] s2 = sub.toString().toCharArray();
        char ss = s.charAt(index);
        int max_index = 0;
        char max = ss;
        //这里应该是找到后面的序列 第一个 比ss大的数字，而不是后面的序列最大的数字
        for (int i=0;i<s2.length;++i) {
            if (s2[i] > max){
                max = s2[i];
                max_index = i;
                break;
            }
        }
        s2[max_index] = ss;
        long val =  Long.parseLong(s1 + max + String.valueOf(s2));
        return val <= Integer.MAX_VALUE ? (int)val : -1;
    }
}

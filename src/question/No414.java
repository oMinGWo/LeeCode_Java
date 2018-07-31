package question;

public class No414 {
    //TODO
    public int thirdMax(int[] nums) {
        Integer a = null;
        Integer b = null;
        Integer c = null;
        for (Integer n:nums){
            if (n.equals(a) || n.equals(b) || n.equals(c)){
                continue;
            }
            if (a == null || n > a){
                c = b;
                b = a;
                a = n;
            }else if(b == null || n > b){
                c = b;
                b = n;
            }else if(c == null || n > c){
                c = n;
            }
        }
        return c == null?a:c;
    }
}

package question;

public class No069 {
    public int mySqrt(int x) {
        String a = Math.sqrt(x) + "";
        return Integer.parseInt(a.substring(0,a.indexOf('.')));
    }
}

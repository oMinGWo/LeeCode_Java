package question;

/**
 * Created by HenryLee on 2017/5/4.
 */
public class No521 {
    public int findLUSlength(String a, String b) {

        return a.equals(b)?-1:Math.max(a.length(),b.length());
    }
}

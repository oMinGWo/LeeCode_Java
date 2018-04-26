package question;

public class No771 {
    public int numJewelsInStones(String J, String S) {
        char[] ss = S.toCharArray();
        int re = 0;
        for(char s:ss){
            if (J.indexOf(s) != -1) {
                re++;
            }
        }
        return re;
    }
}

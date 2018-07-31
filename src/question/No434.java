package question;

public class No434 {
    public int countSegments(String s) {
        String[] ss = s.split(" ");
        int result = 0;
        for (String a:ss){
            if (!a.equals("")){
                result ++;
            }
        }
        return result;
    }
}

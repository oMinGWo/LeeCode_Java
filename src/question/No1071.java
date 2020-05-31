package question;

public class No1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        return str1.substring(0, help(str1.length(), str2.length()));
    }

    private int help(int a, int b){
        return 0 == b ? a : help(b, a % b);
    }
}

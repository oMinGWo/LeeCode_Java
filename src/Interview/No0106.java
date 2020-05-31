package Interview;

public class No0106 {
    public static void main(String args[]){
        No0106 n = new No0106();
        System.out.println(n.compressString("aabcccccaaa"));
    }

    public String compressString(String S) {
        if (S == null || S.length() == 0){
            return S;
        }
        char[] cs = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 1;
        char x = cs[i];
        while (i < S.length() && j <= S.length()){
            if (j == S.length()){
                sb.append(x);
                sb.append(j-i);
                break;
            }
            if (cs[i] == cs[j]){
                j++;
            }else{
                sb.append(x);
                sb.append(j-i);
                i = j;
                j = i + 1;
                x = cs[i];
            }
        }
        return sb.length() < S.length() ? sb.toString() : S;
    }
}

package question;

public class No443 {
    public int compress(char[] chars) {
        if (chars == null || chars.length < 1){
            return 0;
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < chars.length){
            char raw = chars[i];
            int length = 1;
            int j = i+1;
            for (;j<chars.length;++j){
                if (chars[j]==chars[i]){
                    length++;
                }else {
                    break;
                }
            }
            i = j;
            sb.append(raw);
            sb.append(length==1?"":length);
        }
        for (int k=0;k<sb.length();++k){
            chars[k] = sb.charAt(k);
        }
        return sb.length();
    }
}

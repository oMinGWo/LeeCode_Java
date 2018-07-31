package question;

public class No415 {
    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()){
            StringBuilder num2Builder = new StringBuilder(num2);
            for (int i = 0; i<num1.length()- num2.length(); ++i){
                num2Builder.insert(0, "0");
            }
            num2 = num2Builder.toString();
        }else if (num1.length() < num2.length()){
            StringBuilder num1Builder = new StringBuilder(num1);
            for (int i = 0; i<num2.length()- num1.length(); ++i){
                num1Builder.insert(0, "0");
            }
            num1 = num1Builder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        int ex = 0;
        for (int i=num1.length()-1;i>=0;--i){
            int temp = ex + num1.charAt(i) + num2.charAt(i) - '0' * 2;
            ex = temp / 10;
            int re = temp % 10;
            stringBuilder.insert(0,re);
        }
        if (ex == 1){
            stringBuilder.insert(0,1);
        }
        return stringBuilder.toString();
    }
}

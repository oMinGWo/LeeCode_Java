package question;

import java.util.Stack;

public class No682 {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<ops.length;++i){
            if(!"C".equals(ops[i]) && !"D".equals(ops[i]) && !"+".equals(ops[i])){
                s.push(Integer.parseInt(ops[i]));
            }else{
                if("C".equals(ops[i])){
                    s.pop();
                }else if("D".equals(ops[i])){
                    int peek = s.peek();
                    s.push(peek * 2);
                }else if("+".equals(ops[i])){
                    int x = s.pop();
                    int y = s.pop();
                    s.push(y);
                    s.push(x);
                    s.push(x+y);
                }
            }
        }
        int re=0;
        while(!s.isEmpty()){
            re += s.pop();
        }
        return re;
    }
}

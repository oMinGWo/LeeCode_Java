package question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No151 {
    public String reverseWords(String s) {
        if(s.length()==0){
            return "";
        }
        Stack<String> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;++i){
            char c=chars[i];
            if(c==' '){
                if(queue.isEmpty()) {
                    continue;
                }else {
                    StringBuilder sb=new StringBuilder();
                    while (!queue.isEmpty()){
                        sb.append(queue.poll());
                    }
                    stack.push(sb.toString());
                }
            }else {
                queue.offer(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!queue.isEmpty()){
            sb.append(queue.poll());
        }
        stack.push(sb.toString());
        sb=new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
            if (stack.size()!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

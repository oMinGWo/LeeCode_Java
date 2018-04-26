package extraClass;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	 /** initialize your data structure here. */
    public MinStack() {
    	s1=new Stack<Integer>();
    	s2=new Stack<Integer>();
    }
    
    public void push(int x) {
    	if(s2.isEmpty()||x<=s2.peek())
    		s2.push(x);
    	s1.push(x);
    }
    
	public void pop() {
		//���������equals�������á�==��
		if(s1.peek().equals(s2.peek()))
			s2.pop();
		s1.pop();
    }
    
    public int top() {
    	return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

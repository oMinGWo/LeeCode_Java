package extraClass;

import java.util.*;

public class MyStack {
	//TODO
	Queue<Integer> q1=new LinkedList();
	Queue<Integer> q2=new LinkedList();
	// Push element x onto stack.
    public void push(int x) {
        if(q2.isEmpty() )q1.offer(x);
        else q2.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(!q1.isEmpty()){
        	while(q1.size()!=1){
        		int t=q1.poll();
        		q2.offer(t);
        	}
        	q1.poll();
        }else{
        	while(q2.size()!=1){
        		int t=q2.poll();
        		q1.offer(t);
        	}
        	q2.poll();
        }
    }

    // Get the top element.
    public int top() {
    	if(!q1.isEmpty()){
        	while(q1.size()!=1){
        		int t=q1.poll();
        		q2.offer(t);
        	}
        	int t=q1.poll();
        	q2.offer(t);
        	return t;
        }else{
        	while(q2.size()!=1){
        		int t=q2.poll();
        		q1.offer(t);
        	}
        	int t=q2.poll();
        	q1.offer(t);
        	return t;
        }
    }

    // Return whether the stack is empty.
    public boolean empty() {
    	return q1.isEmpty()&&q2.isEmpty();
    }
}

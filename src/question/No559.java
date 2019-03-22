package question;

import extraClass.Node;

public class No559 {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int max=0;
        for(Node n:root.children){
            int t=maxDepth(n);
            if(t>max){
                max=t;
            }
        }
        return max+1;
    }
}

package question;

import java.util.ArrayList;
import java.util.List;

public class No077 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        help(n,1,k,new ArrayList<>());
        return result;
    }

    private void help(int n,int index,int k,List<Integer> list) {
        if (list.size() == k) {
            List<Integer> a = new ArrayList<>();
            a.addAll(list);
            result.add(a);
            return;
        }
        for (int i=index;i<=n;++i){
            //这里应该add i，而不是add index，蠢逼
            list.add(i);
            help(n,i+1,k,list);
            list.remove(list.size()-1);
        }
    }
}

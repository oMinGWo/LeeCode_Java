package question;

import extraClass.TreeNode;

import java.util.*;

public class No987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer, List>> treeMap = new TreeMap<>();
        dfs(root,0,0,treeMap);
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        List<List<Integer>> result = new ArrayList<>();
        while (iterator.hasNext()){
            List<Integer> each_x = new ArrayList<>();
            int key_x = iterator.next();
            TreeMap yyy = treeMap.get(key_x);
            Iterator<Integer> iterator2 = yyy.descendingKeySet().iterator();
            while(iterator2.hasNext()){
                int key_y = iterator2.next();
                List values = (List) yyy.get(key_y);
                Collections.sort(values);
                for (int i=0;i<values.size();++i){
                    each_x.add((Integer) values.get(i));
                }
            }
            result.add(each_x);
        }
        return result;
    }
    private void dfs(TreeNode t, int x, int y, TreeMap<Integer,TreeMap<Integer, List>> treeMap){
        if (t==null){
            return;
        }
        TreeMap<Integer,List> z1 = treeMap.get(x);
        if (z1==null){
            z1 = new TreeMap<>();
            List<Integer> list = new ArrayList();
            list.add(t.val);
            z1.put(y, list);
        }else {
            List<Integer> list = z1.get(y);
            if (list == null){
                list = new ArrayList<>();
            }
            list.add(t.val);
            z1.put(y,list);
        }
        treeMap.put(x,z1);
        dfs(t.left,x-1,y-1,treeMap);
        dfs(t.right,x+1,y-1,treeMap);
    }
}

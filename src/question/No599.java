package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class No599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> re = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list1.length;++i){
            map.put(list1[i],i);
        }
        for (int i=0;i<list2.length;++i){
            if (map.containsKey(list2[i])){
                int index1 = map.get(list2[i]);
                int sum = index1 + i;
                if (sum < min){
                    re.clear();
                    re.add(list2[i]);
                }else if (sum == min){
                    re.add(list2[i]);
                }
            }
        }
        String[] result = new String[re.size()];
        for (int i=0;i<re.size();++i){
            result[i] = re.get(i);
        }
        return result;
    }
}

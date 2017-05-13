package question;

import java.util.*;

//link:http://blog.csdn.net/yeqiuzs/article/details/51312538		
public class No347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,FEntity> map = new HashMap<Integer,FEntity>();
		for(int t:nums){
            FEntity f;
            if(map.containsKey(t)){
                f = map.get(t);
                f.frequent++;
            }else{
                f = new FEntity(t, 1);
            }
            map.put(t, f);
        }
        //对hashmap的value 按照频率进行排序
        List<FEntity> values = new ArrayList<FEntity>();
        Set<Integer> keys = map.keySet();
        for(Integer key:keys){
            values.add(map.get(key));
        }
        Collections.sort(values);
        //统计频率最高的k个数
        for(int i=0;i<k;i++){
            res.add(values.get(values.size()-1-i).num);
        }
        return res;
    }
}
class FEntity implements Comparable<FEntity> {
    int num, frequent;

    public FEntity(int num, int frequent) {
        this.num = num;
        this.frequent = frequent;
    }

    public int compareTo(FEntity arg0) {
        if (frequent > arg0.frequent)
            return 1;
        else if (frequent == arg0.frequent)
            return 0;
        else
            return -1;
    }
}

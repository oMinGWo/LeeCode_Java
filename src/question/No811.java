package question;

import java.util.*;

public class No811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new TreeMap<>();
        for (String domain:cpdomains){
            int count = Integer.parseInt(domain.split(" ")[0]);
            String dd = domain.split(" ")[1];
            List<String> subDomains = getSubDomain(dd);
            for(String sm:subDomains){
                if (map.containsKey(sm)){
                    int old_count = map.get(sm);
                    map.put(sm,count+old_count);
                }else{
                    map.put(sm,count);
                }
            }
        }
        return getResult(map);
    }
    private List<String> getSubDomain(String domain){
        List<String> re = new ArrayList<>();
        while(domain.indexOf('.') !=-1 ){
            re.add(domain);
            domain = domain.substring(domain.indexOf('.')+1);
        }
        re.add(domain);
        return re;
    }
    private List<String> getResult(Map<String,Integer> r){
        List<String> re = new ArrayList<>();
        for (String x:r.keySet()){
            int y = r.get(x);
            re.add(y + " " +x);
        }
        return re;
    }
}

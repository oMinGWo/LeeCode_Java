package question;

import java.util.HashMap;
import java.util.Map;

public class No447 {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for (int[] point : points) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int[] point1 : points) {
                int a = point[0] - point1[0];
                int b = point[1] - point1[1];
                int r = a * a + b * b;
                if (map.containsKey(r)) {
                    map.put(r, map.get(r) + 1);
                } else {
                    map.put(r, 1);
                }
            }
            for (int x : map.keySet()) {
                result += map.get(x) * (map.get(x) - 1);
            }
        }
        return result;
    }
}

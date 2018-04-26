package question;

import extraClass.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No690 {
    Map<Integer, Employee> map = new HashMap<>();
    int result=0;
    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee:employees) {
            map.put(employee.id, employee);
        }
        return get(id);
    }

    private int get(int id){
        Employee employee = map.get(id);
        if (employee==null) {
            return 0;
        }
        List<Integer> sub = employee.subordinates;
        int re = employee.importance;
        for (int i:sub){
            re+=get(i);
        }
        return re;
    }
}

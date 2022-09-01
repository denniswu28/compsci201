import java.util.HashMap;
import java.util.Map;

public class Totality {
    public int sum(int[] a, String stype){
        int len = a.length;
        int number_sum = 0;
        Map<String, Integer> step = new HashMap<String, Integer>();
        Map<String, Integer> start = new HashMap<String, Integer>();

        step.put("odd", 2);
        step.put("even", 2);
        step.put("all", 1);

        start.put("odd", 1);
        start.put("even", 0);
        start.put("all", 0);

        for(int i = start.get(stype); i < len; i+=step.get(stype)){
            number_sum += a[i];
        }


        return number_sum;
    }
}

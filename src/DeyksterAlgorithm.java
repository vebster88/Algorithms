import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class DeyksterAlgorithm {
static Map<String, HashMap<String, Integer>> deykster = new HashMap<>();
static Map<String, Integer> costs = new HashMap<>();
static Map<String, String> parents = new HashMap<>();
static List<String> processed = new ArrayList<>();

    public static void main(String[] args) {
        Map<String, Integer> start = new HashMap<>();
        start.put("a", 6);
        start.put("b", 2);

        Map<String, Integer> A = new HashMap<>();
        A.put("fin", 1);

        Map<String, Integer> B = new HashMap<>();
        B.put("a", 3);
        B.put("fin", 5);

        Integer infinity = MAX_VALUE;

        deykster.put("start", (HashMap) start);
        deykster.put("a", (HashMap) A);
        deykster.put("b", (HashMap) B);
        deykster.put("FIN", null);

        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("in", null);

        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", infinity);

        System.out.println(find_lowest_cost_node(costs));
    }

    public static String find_lowest_cost_node(Map<String, Integer> costs) {
        Integer lowest = MAX_VALUE;
        String low = "";
        String curr = "";
        Integer current = 0;
        for (Map.Entry<String, Integer> cost : costs.entrySet()
             ) {
            current = cost.getValue();
            curr = cost.getKey();
            if (lowest == MAX_VALUE) {
                lowest = current;
                low = cost.getKey();
            } else {

                if (lowest < current) {
                    lowest = current;
                    low = cost.getKey();
                }
            }
        }
        System.out.println(lowest);
        return low;
    }

}

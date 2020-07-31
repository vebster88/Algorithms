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
        String node = "";

        deykster.put("start", (HashMap) start);
        deykster.put("a", (HashMap) A);
        deykster.put("b", (HashMap) B);
        deykster.put("fin", null);

        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        costs.put("a", 6);
//        costs.put("a1", 16);
//        processed.add("a4");
//        processed.add("a3");
//        costs.put("a2", 65);
//        costs.put("a3", 1);
//        costs.put("a4", -6);
        costs.put("b", 2);
        costs.put("fin", infinity);

        node = find_lowest_cost_node(costs);
        while (!node.equals("fin")) {
            int cost = costs.get(node);
            Map<String, Integer> neighbors = deykster.get(node);
            for (Map.Entry<String, Integer> neigh: neighbors.entrySet()
                 ) {
                int new_cost = cost + neigh.getValue();
                if (costs.get(neigh.getKey())>new_cost){
                    costs.put(neigh.getKey(), new_cost);
                    parents.put(neigh.getKey(), node);
                }
            }
        }
    }

    public static String find_lowest_cost_node(Map<String, Integer> costs) {
        Integer lowest = MAX_VALUE;
        String low = "None";
        String curr = "";
        Integer current = 0;
        for (Map.Entry<String, Integer> cost : costs.entrySet()
             ) {
            current = cost.getValue();
            curr = cost.getKey();
//          if (lowest == MAX_VALUE) {
//                lowest = current;
//                low = cost.getKey();
//          } else {

                if ((lowest > current)&&(!processed.contains(curr))) {
                    lowest = current;
                    low = cost.getKey();
                }
//          }
        }
        System.out.println(lowest);
        return low;
    }

    public static boolean isProcessed(String string) {
        for (String node: processed
             ) {
            if (string.equals(node)) {
                return true;
            }
        }
        return false;
    }

}

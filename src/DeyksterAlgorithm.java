import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class DeyksterAlgorithm {
static Map<String, HashMap<String, Integer>> deykster = new HashMap<>();
static Map<String, Integer> costs = new HashMap<>();
static Map<String, String> parents = new HashMap<>();
static List<String> processed = new ArrayList<>();

    public static void main(String[] args) {
        Map<String, Integer> start = new HashMap<>();
        start.put("a", 5);
        start.put("b", 2);

        Map<String, Integer> A = new HashMap<>();
        A.put("c", 4);
        A.put("d", 2);

        Map<String, Integer> B = new HashMap<>();
        B.put("a", 8);
        B.put("d", 7);

        Map<String, Integer> C = new HashMap<>();
        C.put("fin", 3);
        C.put("d", 6);

        Map<String, Integer> D = new HashMap<>();
        D.put("fin", 1);

        Integer infinity = MAX_VALUE;
        String node = "";

        deykster.put("start", (HashMap) start);
        deykster.put("a", (HashMap) A);
        deykster.put("b", (HashMap) B);
        deykster.put("c", (HashMap) C);
        deykster.put("d", (HashMap) D);
        deykster.put("fin", null);

        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("c", null);
        parents.put("d", null);
        parents.put("fin", null);

        costs.put("a", 5);
        costs.put("b", 2);
        costs.put("c", infinity);
        costs.put("d", infinity);
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
            processed.add(node);
            node = find_lowest_cost_node(costs);
        }
        System.out.println("Наименьшая скорость достижения конца пути - " + costs.get(node));
        System.out.println("Звено родитель - " + parents.get(node));
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

                if ((lowest > current)&&(!isProcessed(curr))) {
                    lowest = current;
                    low = cost.getKey();
                }
        }

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

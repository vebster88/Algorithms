import java.util.*;
import java.util.stream.Stream;

public class ZhadniyAlgorithm {

    static Set<String> states_needed = new HashSet<String>(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
    static HashMap<String, Set> stations = new HashMap<String, Set>();
    static Set<String> final_stations = new HashSet<>();

    public static void main(String[] args) {
        Set<String> kone = new HashSet<>(Arrays.asList("id", "nv", "ut"));
        Set<String> ktwo = new HashSet<>(Arrays.asList("wa", "id", "mt"));
        Set<String> kthree = new HashSet<>(Arrays.asList("or", "nv", "ca"));
        Set<String> kfour = new HashSet<>(Arrays.asList("nv", "ut"));
        Set<String> kfive = new HashSet<>(Arrays.asList("az", "ca"));


        stations.put("kone", kone);
        stations.put("ktwo", ktwo);
        stations.put("kthree", kthree);
        stations.put("kfour", kfour);
        stations.put("kfive", kfive);
        System.out.println(best(stations));
    }
    static Set<String> best(Map<String, Set> maps) {

    while (states_needed.size()!=0) {
        String best_station = null;
        Set<String> covered;
        Set<String> states_covered = new HashSet<>();
        for (Map.Entry<String, Set> stations : maps.entrySet()) {
            covered = new HashSet<String>(states_needed);
            covered.retainAll(stations.getValue());
            if (covered.size() > states_covered.size()) {
                best_station = stations.getKey();
                states_covered = covered;
            }
        }
        states_needed.removeAll(states_covered);
        final_stations.add(best_station);
    }
        return final_stations;
    }

}

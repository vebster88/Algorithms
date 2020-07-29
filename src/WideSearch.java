import java.util.*;

public class WideSearch {

    public static void main(String[] args) {
        HashMap<String, String[]> widesearch = new HashMap<>();
        Set<String> names = new HashSet<>(Arrays.asList("me", "bob", "alice", "bob", "claire", "anuj", "peggy", "thom", "jonny"));


        String[] you = {"alice", "bob", "claire"};
        String[] bob = {"anuj", "peggy"};
        String[] alice = {"peggy"};
        String[] claire = {"thom", "jonny"};
        String[] anuj = {};
        String[] peggy = {};
        String[] thom = {};
        String[] jonny = {};

        widesearch.put("me", you);
        widesearch.put("alice", alice);
        widesearch.put("bob", bob);
        widesearch.put("claire", claire);
        widesearch.put("anuj", anuj);
        widesearch.put("peggy", peggy);
        widesearch.put("thom", thom);
        widesearch.put("jonny", jonny);

        searching("peggy", search_queue("me", widesearch));

    }
    public static LinkedList<String> search_queue(String human, Map<String, String[]> map) {
        LinkedList<String> deque = new LinkedList<>();
        String[] arr = map.get(human);
        for (String p: arr) {
            deque.addLast(p);
        }

        return deque;
    }

    public static String searching(String name, LinkedList<String> deque) {
        String result = "";
        while (!deque.isEmpty()) {
            result = deque.getFirst();
            deque.removeFirst();
            if (result == name) {
                return name;
            }
        }
     return "There were not" + name;
    }

}

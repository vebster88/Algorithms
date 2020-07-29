import java.util.*;

public class WideSearch {
    static String person = "jonny";
    static LinkedList<String> deque = new LinkedList<>();
    static ArrayList<String> searched = new ArrayList<>();

    public static void main(String[] args) {

        HashMap<String, String[]> widesearch = new HashMap<>();
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
        System.out.println(search_queue("me", widesearch));

    }
    public static String search_queue(String human, Map<String, String[]> map) {

        String result = "";
        String[] arr = map.get(human);
        for (String p: arr) {
            deque.addLast(p);}
        while (!deque.isEmpty()) {
            result = deque.getFirst();
            deque.removeFirst();
            if (!isSearched(result)) {
                if (result == person) {
                    return "The person is " + result;
                } else {
                    searched.add(result);
                    return search_queue(result, map); }
            } else continue;
        }
        return "There are not " + person;
    }

    public static boolean isSearched(String name) {
        boolean check = false;
        for (String names: searched
             ) {
            if (names == name) {
                check = true;
            }
        }
        return check;
    }

}

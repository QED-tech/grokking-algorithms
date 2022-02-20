package Chapter_6;

import java.util.*;

public class BFS {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();

        ArrayList<String> myFriendsList = new ArrayList<>();
        myFriendsList.add("alice");
        myFriendsList.add("bob");
        myFriendsList.add("claire");

        ArrayList<String> bobFriendsList = new ArrayList<>();
        bobFriendsList.add("anuj");
        bobFriendsList.add("peggy");

        ArrayList<String> aliceFriendsList = new ArrayList<>();
        aliceFriendsList.add("peggy");

        ArrayList<String> claireFiendsList = new ArrayList<>();
        claireFiendsList.add("thom");
        claireFiendsList.add("jonny");

        graph.put("you", myFriendsList);
        graph.put("bob", bobFriendsList);
        graph.put("alice", aliceFriendsList);
        graph.put("claire", claireFiendsList);
        graph.put("anuj", new ArrayList<>());
        graph.put("peggy", new ArrayList<>());
        graph.put("thom", new ArrayList<>());
        graph.put("jonny", new ArrayList<>());

        findMangoSeller(graph, "you");
    }

    private static void findMangoSeller(HashMap<String, ArrayList<String>> graph, String name) {
        ArrayList<String> searchedList = new ArrayList<>();
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.addAll(graph.get(name));

        do {
            String person = queue.poll();

            if (person == null) {
                System.out.println("queue is empty");
                break;
            }

            if (searchedList.contains(person)) {
                continue;
            }

            if (isMangoSeller(person)) {
                System.out.printf("%s is a mango seller%n", person);
                break;
            }

            searchedList.add(person);
            queue.addAll(graph.get(person));

        } while (!queue.isEmpty());
    }

    private static boolean isMangoSeller(String person) {
        return person.substring(person.length() - 1).equals("m");
    }
}

package Chapter_7;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dijkstra {

    public static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();

        HashMap<String, Integer> connectionsPointA = new HashMap<>();
        connectionsPointA.put("B", 3);
        connectionsPointA.put("C", 6);
        connectionsPointA.put("D", 1);

        HashMap<String, Integer> connectionsPointB = new HashMap<>();
        connectionsPointB.put("E", 8);

        HashMap<String, Integer> connectionsPointC = new HashMap<>();
        connectionsPointC.put("E", 4);

        HashMap<String, Integer> ConnectionsPointD = new HashMap<>();
        ConnectionsPointD.put("E", 12);
        ConnectionsPointD.put("C", 4);

        HashMap<String, Integer> connectionsPointE = new HashMap<>();

        graph.put("A", connectionsPointA);
        graph.put("B", connectionsPointB);
        graph.put("C", connectionsPointC);
        graph.put("E", connectionsPointE);
        graph.put("D", ConnectionsPointD);

        HashMap<String, Integer> costs = new HashMap<>();
        costs.put("A", 0);
        costs.put("B", MAX);
        costs.put("C", MAX);
        costs.put("E", MAX);
        costs.put("D", MAX);

        dijkstra(graph, costs);
        System.out.println();
    }

    private static void dijkstra(HashMap<String, HashMap<String, Integer>> graph, HashMap<String, Integer> costs) {
        ArrayList<String> processed = new ArrayList<>();
        String lowerCostUnprocessedNode = findLowestCostNode(costs, processed);

        //TODO implemented this cycle
        while (lowerCostUnprocessedNode != null) {
            int cost = costs.get(lowerCostUnprocessedNode);
            var connectionsPoints = graph.get(lowerCostUnprocessedNode)
                    .keySet()
                    .iterator();

            do {
                String connectionsPoint = connectionsPoints.next();


            }
            while (connectionsPoints.hasNext());

            break;
        }
    }

    private static @Nullable String findLowestCostNode(HashMap<String, Integer> costs, ArrayList<String> processed) {
        int minimumValue = 0;
        String minimumCostNode = "";

        for (Map.Entry<String, Integer> entry : costs.entrySet()) {
            if (processed.contains(entry.getKey())) {
                continue;
            }

            if (entry.getValue() <= minimumValue) {
                minimumCostNode = entry.getKey();
            }

        }

        return minimumCostNode.equals("") ? null : minimumCostNode;
    }

}

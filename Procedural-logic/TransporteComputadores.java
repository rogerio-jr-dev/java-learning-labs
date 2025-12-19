import java.util.*;

public class TransporteComputadores {

    public int totalDeliveryCost(int n, int[][] connections, int[] locations) {

     
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : connections) {
            int x = edge[0];
            int y = edge[1];
            int cost = edge[2];

            graph.get(x).add(new int[]{y, cost});
            graph.get(y).add(new int[]{x, cost});
        }

      
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0}); 

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int city = cur[0];
            int cost = cur[1];

            if (cost > dist[city]) continue;  

            for (int[] edge : graph.get(city)) {
                int next = edge[0];
                int weight = edge[1];
                int newCost = cost + weight;

                if (newCost < dist[next]) {
                    dist[next] = newCost;
                    pq.offer(new int[]{next, newCost});
                }
            }
        }

       
        int total = 0;
        for (int loc : locations) {
            total += dist[loc];
        }

        return total;
    }
 
    public static void main(String[] args) {
        TransporteComputadores t = new TransporteComputadores();

        int[][] connections = {
            {0, 1, 1},
            {0, 2, 2},
            {0, 3, 3},
            {1, 4, 3},
            {2, 4, 2},
            {3, 4, 3},
            {4, 5, 4}
        };

        System.out.println(t.totalDeliveryCost(
            6, connections, new int[]{1,2,3,4,5}
        )); // Esperado exercicio 1: 18

        System.out.println(t.totalDeliveryCost(
            6, connections, new int[]{2,4,5,5}
        )); // Esperado exericio 2: 22
    }
}

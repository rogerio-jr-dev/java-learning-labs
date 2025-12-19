import java.util.Arrays;

public class Agualoo {

    static void agualoo(int n, int m, int[] diameters, int[] heights) {

       
        Arrays.sort(diameters);
        Arrays.sort(heights);

        int custo = 0;
        int idxKnight = 0;

        for (int i = 0; i < n; i++) {
            int head = diameters[i];

            
            while (idxKnight < m && heights[idxKnight] < head) {
                idxKnight++;
            }
 
            if (idxKnight == m) {
                System.out.println("Agualoo esta condenada!");
                return;
            }
 
            custo += heights[idxKnight];
            idxKnight++;
        }

       
        System.out.println(custo);
    }
 
    public static void main(String[] args) {

        // Entrada 1
        agualoo(
                2, 3,
                new int[]{5, 4},
                new int[]{7, 8, 4}
        );  

        // Entrada 2
        agualoo(
                2, 1,
                new int[]{5, 5},
                new int[]{10}
        );  

        // Entrada 3
        agualoo(
                2, 4,
                new int[]{7, 2},
                new int[]{4, 3, 1, 2}
        );  

        // Entrada 4
        agualoo(
                2, 4,
                new int[]{7, 2},
                new int[]{2, 1, 8, 5}
        );  

        // Entrada 5
        agualoo(
                2, 10,
                new int[]{1234567, 2345},
                new int[]{12345610, 1, 123, 23564, 123456, 123, 2, 3, 2, 1}
        );  
    }
}

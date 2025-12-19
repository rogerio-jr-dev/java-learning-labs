import java.util.Arrays;

public class Armazem {

    public int maxWarehouseValue(int C, int N, int[] prices, int[] volume) {

 
        int[] dp = new int[C + 1];

        for (int i = 0; i < N; i++) {
            int vol = volume[i];
            int val = prices[i];

            // de trás pra frente para evitar reuso do item
            for (int c = C; c >= vol; c--) {
                dp[c] = Math.max(dp[c], dp[c - vol] + val);
            }
        }

        return dp[C]; 
    }


    // Testes básicos (opcional)
    public static void main(String[] args) {

        Armazem a = new Armazem();

        // Entrada 1
        System.out.println(a.maxWarehouseValue(10, 4,
                new int[]{5, 12, 8, 1},
                new int[]{4, 8, 5, 3}
        )); 
        // Entrada 2
        System.out.println(a.maxWarehouseValue(10, 4,
                new int[]{5, 15, 8, 1},
                new int[]{4, 8, 5, 3}
        ));  

        // Entrada 3
        System.out.println(a.maxWarehouseValue(4, 3,
                new int[]{1, 2, 3},
                new int[]{4, 5, 1}
        )); 

        // Entrada 4
        System.out.println(a.maxWarehouseValue(3, 3,
                new int[]{1, 2, 3},
                new int[]{4, 5, 6}
        )); 

        // Entrada 5
        System.out.println(a.maxWarehouseValue(0, 3,
                new int[]{20, 30, 40},
                new int[]{10, 20, 30}
        ));  

        // Entrada 6
        System.out.println(a.maxWarehouseValue(100, 0,
                new int[]{},
                new int[]{}
        ));  
    }
}

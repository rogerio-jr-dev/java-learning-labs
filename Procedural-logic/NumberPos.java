import java.util.Scanner;

public class NumberPos {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
         System.out.print("Quantos numeros voce vai digitar? ");
         int n = sc.nextInt();

         int[] vet = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o %dº numero: ", i+1);

                vet[i] = sc.nextInt();
                while(vet[i] == 0){
                    System.out.print("Numero invalido, digite outro numero:");
                    vet[i] = sc.nextInt();
                } 
            }

        int countPos = 0; 
        int countNeg = 0; 

          for (int i = 0; i < n; i++) {
            if (vet[i] > 0) 
               countPos++;
            else 
             countNeg++;
        }
        int[] pos = new int[countPos];
        int[] neg = new int[countNeg];

        int p = 0; 
        int g = 0; 
        for (int i = 0; i < n; i++) {
            if (vet[i] > 0){
                pos[p] = vet[i];
                p++;
            } else {
                neg[g] = vet[i];
                g++; 
            }
            
        }
        
        System.out.println("NUMEROS POSITIVOS:");
            for (int i = 0; i < countPos; i++) {
                    System.out.println(pos[i]);
            }
        
            System.out.println("NUMEROS NEGATIVOS:");
            for (int i = 0; i < countNeg; i++) {
            System.out.println(neg[i]);
            
            }

        if (countNeg == 0) {
            System.out.println("Nao ha numeros negativos.");
            System.out.println("Percentual de numeros positivos: 100.0%");
        } else{
            double percent = (countPos / (double)n)* 100.0;
            System.out.printf("Percentual de numeros positivos: %.1f%%\n", percent); 
        }
         
        sc.close();
    }
}

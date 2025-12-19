import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1021 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int valorCentavos = (int) Math.round(valor * 100);


        int[] vetNotas = {10000, 5000, 2000, 1000, 500, 200};
        int[] vetMoedas = {100, 50, 25, 10, 5, 1};

        int[] qteNotas = new int[vetNotas.length];
        int[] qteMoedas = new int[vetMoedas.length];

        for (int i = 0; i < vetNotas.length; i++) {
            qteNotas[i] = valorCentavos / vetNotas[i];
            valorCentavos %= vetNotas[i];
        }


        for (int i = 0; i < vetMoedas.length; i++) {
            qteMoedas[i] = valorCentavos / vetMoedas[i];
            valorCentavos %= vetMoedas[i];
        }


        System.out.println("NOTAS:");
        for (int i = 0; i < vetNotas.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f%n",
                    qteNotas[i], vetNotas[i] / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < vetMoedas.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f%n",
                    qteMoedas[i], vetMoedas[i] / 100.0);
        }

        sc.close();
    }
}

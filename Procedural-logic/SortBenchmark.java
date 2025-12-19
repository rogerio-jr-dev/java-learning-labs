import java.nio.file.*;
import java.util.*;

public class SortBenchmark {

    public static void main(String[] args) {

        // Lê o arquivo input.json (conteúdo enviado pelo desafio)
        List<String> lista = lerArquivo("input.json");

      
        String[] baseArray = lista.toArray(new String[0]);

    
        String[] arrInsertion = baseArray.clone();
        String[] arrBubble = baseArray.clone();
        String[] arrQuick = baseArray.clone();

        // Benchmark - insertion sort
        long t1 = System.currentTimeMillis();
        insertionSort(arrInsertion);
        long t2 = System.currentTimeMillis();
        long tempoInsertion = t2 - t1;

        // Benchmark - bubble sort
        long t3 = System.currentTimeMillis();
        bubbleSort(arrBubble);
        long t4 = System.currentTimeMillis();
        long tempoBubble = t4 - t3;

        // Benchmark - quick sort
        long t5 = System.currentTimeMillis();
        quickSort(arrQuick, 0, arrQuick.length - 1);
        long t6 = System.currentTimeMillis();
        long tempoQuick = t6 - t5;

         
        System.out.println("Insertion sort: " + tempoInsertion + "ms");
        System.out.println("Bubble sort: " + tempoBubble + "ms");
        System.out.println("Quick sort: " + tempoQuick + "ms");
    }


    // ----------- LEITURA MANUAL DO JSON SIMPLES -------------
    private static List<String> lerArquivo(String path) {
        try {
            String conteudo = Files.readString(Paths.get(path)).trim();

            conteudo = conteudo.replace("[", "")
                               .replace("]", "")
                               .replace("\"", "")
                               .trim();

            String[] partes = conteudo.split(",");

            return Arrays.asList(partes);

        } catch (Exception e) {
            System.out.println("Erro lendo arquivo: " + e.getMessage());
            return new ArrayList<>();
        }
    }


    // ---------------- INSERTION SORT ----------------
    private static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // ---------------- BUBBLE SORT ----------------
    private static void bubbleSort(String[] arr) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    // ---------------- QUICK SORT ----------------
    private static void quickSort(String[] arr, int ini, int fim) {
        if (ini < fim) {
            int p = particiona(arr, ini, fim);
            quickSort(arr, ini, p - 1);
            quickSort(arr, p + 1, fim);
        }
    }

    private static int particiona(String[] arr, int ini, int fim) {
        String pivo = arr[fim];
        int i = ini - 1;

        for (int j = ini; j < fim; j++) {
            if (arr[j].compareTo(pivo) <= 0) {
                i++;
                troca(arr, i, j);
            }
        }
        troca(arr, i + 1, fim);
        return i + 1;
    }

    private static void troca(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

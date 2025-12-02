import java.util.List;
import java.util.Arrays;

public class VendasDepart {

    public static double[] totalSales(List<String> sales, String department) {
        return totalSalesRecursive(sales, department, 0);
    }
 
    private static double[] totalSalesRecursive(List<String> sales, String department, int index) {
 
        if (index == sales.size()) {
            return new double[]{0, 0.0};
        }
 
        String linha = sales.get(index);
        String[] partes = linha.split(",");

        double preco = Double.parseDouble(partes[2]);
        String dept = partes[3];

     
        double[] resultadoRestante = totalSalesRecursive(sales, department, index + 1);

        double quantidade = resultadoRestante[0];
        double soma = resultadoRestante[1];

         
        if (dept.equalsIgnoreCase(department)) {
            quantidade += 1;
            soma += preco;
        }

        return new double[]{quantidade, soma};
    }

    public static void main(String[] args) {

        List<String> sales = Arrays.asList(
            "8349,14/09/2024,899.9,ESPORTE",
            "4837,17/09/2024,530.0,VESTUARIO",
            "15281,21/09/2024,1253.99,ESPORTE",
            "15344,27/09/2024,1000.9,VESTUARIO",
            "18317,04/10/2024,250.4,VESTUARIO",
            "18972,11/10/2024,385.5,JARDINAGEM"
        );

        String department = "VESTUARIO";

        double[] resposta = totalSales(sales, department);

        System.out.println((int)resposta[0] + " VENDAS");
        System.out.printf("TOTAL = $ %.2f\n", resposta[1]);
    }
}

// Desafio de recursividade DevSuperior 
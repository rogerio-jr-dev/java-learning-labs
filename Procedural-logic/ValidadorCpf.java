/*
Dado o CPF de uma pessoa, o qual pode conter pontos ou traços como separadores, retorne o CPF contendo somente dígitos.

Exemplo 1:
Entrada
Saída
87409217293
87409217293

Exemplo 2:
Entrada
Saída
874092172-93
87409217293


Exemplo 3:
Entrada
Saída
874.092.172-93
87409217293 
*/

public class ValidadorCpf {

    public static String validadorCpfManual(String str) {
		
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String validadorCpfRegex(String cpf){
         return cpf.replaceAll("\\D","");
    }

    public static void main(String[] args) {
        System.out.println("***********Jeito manual***************");
        System.out.println(validadorCpfManual("87409217293"));
        System.out.println(validadorCpfManual("874.092.172-93"));
        System.out.println(validadorCpfManual("874092172-93"));
        System.out.println("***********Usando Regex***************");
        System.out.println(validadorCpfRegex("87409217293"));
        System.out.println(validadorCpfRegex("874.092.172-93"));
        System.out.println(validadorCpfRegex("874092172-93"));
    }
}

import java.util.List;

public class ValidadorEmailBr {

    public static String[] ValidarEmail(String email) {
        String str = email; 
        String[] vet = str.split("@");
        String name = vet[0]; 
        String dominio = vet[1]; 
        return new String[]{name, dominio};
    }
    public static void main(String[] args) {
            
        String[] parts = ValidarEmail("rogerio75@outlook.com.br");  

        String nome =  parts[0]; 
        String dominio =  parts[1]; 
        String resp = dominio.contains(".br")? "Sim" : "Nao"; 
        System.out.println("Usuario: " + nome);
        System.out.println("Dominio: " + dominio);
        System.out.println("Brasileiro: " + resp); 
    }
}
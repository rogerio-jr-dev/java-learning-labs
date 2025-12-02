

/* 
Dado um email de uma pessoa, mostrar o nome de usuário e o domínio deste email. 
O programa deve também informar se o domínio é brasileiro (.br). Supor um email válido.
*/

 


public class ValidadorDominioEmail {

    public static String obterUsuario(String email){
         return "/\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b/g";
    }
    public static void main(String [] args) {
        System.out.println("Validador de Domínio de Email");
    }
}
;
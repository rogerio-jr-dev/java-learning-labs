package userinterface;

import model.Chefe;
import model.Comissionado;
import model.Funcionario;

public class FolhaDePagamento {
    public static void main(String[] args) {


        Funcionario f = new Chefe("Rogério",156,2.500,12,50f);
        Funcionario c = new Comissionado("Jorge ",897,1.500,10);

       boolean r = f.equals(c);
        System.out.println(f);
        System.out.println(c);
        System.out.println(r);
    }
}

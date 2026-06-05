package userinterface;

import model.*;

public class FolhaDePagamento {
    public static void main(String[] args) {


        Funcionario f1 = new Chefe("Rogério - chefe",156,5000.0,15.0,500.0);
        Funcionario f2 = new Comissionado("Jorge - vendedor",897,4000.0,35.0);
        Funcionario f3 = new Horista("Maria - designer",209,150,80 );
        Funcionario f4 = new Empreiteiro("Matheus - pedreiro", 568, 5872.35);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}

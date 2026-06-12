package App;


import Enuns.Sexo;
import Model.Cliente;
import Model.ClienteComum;
import Model.ClienteVip;
import Model.Corporativo;

public class Main {
    public static void main(String[] args) {

    Cliente c1 = new ClienteComum("TKC001","Junior - ", Sexo.Masculino);
    Cliente c2 = new ClienteVip("TKC003","Joao - ", Sexo.Masculino);
    Cliente c3 = new Corporativo("TKC004","Cleber - ", Sexo.Masculino, "Pollos Hermanos");

    c2.calcularIngresso();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
package App;


import Enuns.Sexo;
import Model.Cliente;
import Model.ClienteComum;
import Model.ClienteVip;
import Model.ClienteCorporativo;

import static Util.GeradorTicket.gerarIdCliente;
import static Util.GeradorTicket.gerarTicket;

public class Main {
    public static void main(String[] args) {

    Cliente c1 = new ClienteComum(gerarIdCliente(),gerarTicket(),"Junior - ", Sexo.Masculino);
    Cliente c2 = new ClienteVip(gerarIdCliente(),gerarTicket(),"Joao - ", Sexo.Masculino);
    Cliente c3 = new ClienteCorporativo(gerarIdCliente(),gerarTicket(),"Cleber - ", Sexo.Masculino, "Pollos Hermanos");

    c2.calcularIngresso();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
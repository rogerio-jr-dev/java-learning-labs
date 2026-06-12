package Model;

import Enuns.Sexo;

public class ClienteAniversariante extends Cliente{
    public ClienteAniversariante(String ticket, String nome, Sexo sexo) {
        super(ticket, nome, sexo);
    }

    @Override
    public double calcularIngresso() {
        return 0.0;
    }
}

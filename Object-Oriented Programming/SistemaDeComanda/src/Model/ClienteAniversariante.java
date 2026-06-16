package Model;

import Enuns.Sexo;

public class ClienteAniversariante extends Cliente{

    public ClienteAniversariante(String id, String ticket, String nome, Sexo sexo) {
        super(id, ticket, nome, sexo);
    }

    @Override
    public double calcularIngresso() {
        return 0.0;
    }
}

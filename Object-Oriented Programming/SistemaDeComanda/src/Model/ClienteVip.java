package Model;

import Enuns.Sexo;

public class ClienteVip extends Cliente{

    public ClienteVip(String id, String ticket, String nome, Sexo sexo) {
        super(id, ticket, nome, sexo);
    }

    @Override
    public double calcularIngresso() {
        double valorIngresso = getSexo() == Sexo.Masculino ? 10.0 : 8.0;
            return valorIngresso - (valorIngresso * 0.20);
    }
}

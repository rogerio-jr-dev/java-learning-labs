package Model;

import Enuns.Sexo;

import static Util.ResgatarBar.INGRESSO_HOMEM;
import static Util.ResgatarBar.INGRESSO_MULHER;

public class ClienteVip extends Cliente{

    public ClienteVip(String id, String ticket, String nome, Sexo sexo) {
        super(id, ticket, nome, sexo);
    }

    @Override
    public double calcularIngresso() {
        double valorIngresso = getSexo() == Sexo.Masculino ? INGRESSO_HOMEM :  INGRESSO_MULHER;
            return valorIngresso - (valorIngresso * 0.20);
    }
}

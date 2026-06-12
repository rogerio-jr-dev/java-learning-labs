package Model;

import Enuns.Sexo;

import static Util.ResgatarBar.INGRESSO_HOMEM;
import static Util.ResgatarBar.INGRESSO_MULHER;

public class ClienteComum extends Cliente{
    public ClienteComum(String ticket, String nome, Sexo sexo) {
        super(ticket, nome, sexo);
    }

    @Override
    public double calcularIngresso() {
        return getSexo() == Sexo.Masculino ? INGRESSO_HOMEM : INGRESSO_MULHER;
    }
}

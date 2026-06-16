package Model;

import Enuns.Sexo;

import static Util.ResgatarBar.INGRESSO_HOMEM;
import static Util.ResgatarBar.INGRESSO_MULHER;

public class ClienteCorporativo extends Cliente{
    private String empresa;

    public ClienteCorporativo(String id, String ticket, String nome, Sexo sexo, String empresa) {
        super(id, ticket, nome, sexo);
        this.empresa = empresa;
    }

    @Override
    public double calcularIngresso() {
        double ingresso =  getSexo() == Sexo.Masculino ? INGRESSO_HOMEM : INGRESSO_MULHER;
        return ingresso * 0.5;
    }
}

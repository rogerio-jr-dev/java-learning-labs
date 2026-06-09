package Model;

import Enuns.Sexo;

public class ClienteComum extends Cliente{


    public ClienteComum(String id, String ticket, String nome, Sexo sexo) {
        super(id, ticket, nome, sexo);
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getTicket() {
        return "";
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public Sexo getSexo() {
        return null;
    }

    @Override
    public double calcularIngresso() {
        return 0;
    }
}

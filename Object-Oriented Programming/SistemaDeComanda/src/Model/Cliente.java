package Model;

import Enuns.Sexo;

public abstract class Cliente {
    private String id;
    private String ticket;
    private String nome;
    private Sexo sexo;

    public Cliente(String id, String ticket, String nome, Sexo sexo) {
        this.id = id;
        this.ticket = ticket;
        this.nome = nome;
        this.sexo = sexo;
    }
    public String getId() {
        return id;
    }
    public String getTicket() {
        return ticket;
    }
    public String getNome() {
        return nome;
    }
    public Sexo getSexo() {
        return sexo;
    }

    public abstract double calcularIngresso();


}

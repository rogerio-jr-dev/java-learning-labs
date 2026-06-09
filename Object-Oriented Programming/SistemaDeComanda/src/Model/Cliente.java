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

    public abstract String getId();
    public abstract String getTicket();
    public abstract String getNome();
    public abstract Sexo getSexo();
    public abstract double calcularIngresso();


}

package Model;

import Enuns.Sexo;

public abstract class Cliente {
    private String ticket;
    private String nome;
    private Sexo sexo;

    private static int id = 0;

    public Cliente(String ticket, String nome, Sexo sexo) {
        this.ticket = ticket;
        this.nome = nome;
        this.sexo = sexo;
    }
    public int getId() {
        return id;
    }
    public String getTicket() {
        return ticket;
    }
    public String getNome() {
        id++;
        return nome;
    }
    public Sexo getSexo() {
        return sexo;
    }

    public abstract double calcularIngresso();

    @Override
    public String toString() {
        return "Id: "+ id + " - Nome: " + getNome() + " Valor do ingresso: "+ calcularIngresso() +" R$";
    }

}

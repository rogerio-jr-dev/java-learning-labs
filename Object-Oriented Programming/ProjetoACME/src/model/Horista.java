package model;

public class Horista extends Funcionario{
    private double valorHora;
    private int numeroHoras;

    public Horista(String nome, int numeroRegistro, double valorHora, int numeroHoras) {
        super(nome, numeroRegistro);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double calcularSalario(){
     return numeroHoras*valorHora;
    }
    @Override
    public String toString(){
        return "O salario do Horista é de: " + calcularSalario();
    }
}

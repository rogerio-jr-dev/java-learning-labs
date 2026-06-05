package model;

public class Empreiteiro extends Funcionario{
    private double valorEmpreita;

    public Empreiteiro(String nome, int numeroRegistro, double valorEmpreita) {
        super(nome, numeroRegistro);
        this.valorEmpreita = valorEmpreita;
    }

    public double getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(double valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public double calcularSalario() {
        return valorEmpreita;
    }
    @Override
    public String toString(){
        return "O salario do empreiteiro é de: " + calcularSalario();

    }
}

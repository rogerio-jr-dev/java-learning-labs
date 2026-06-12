package Model;

public abstract class ItemConsumo {
    private String nome;
    private int qte;
    private double precoUnitario;

    public ItemConsumo(String nome, int qte, double precoUnitario) {
        this.nome = nome;
        this.qte = qte;
        this.precoUnitario = precoUnitario;
    }

    public abstract double calcularSubtotal();

    public String getNome(){
        return nome;
    }
    public int getQte(){
        return qte;
    }
    public double getPrecoUnitario(){
        return precoUnitario;
    }
}

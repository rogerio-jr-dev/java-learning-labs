package Model;

public class Refrigerante extends  ItemConsumo{
    public Refrigerante(String nome, int qte, double precoUnitario) {
        super(nome, qte, precoUnitario);
    }

    @Override
    public double calcularSubtotal() {
        return getQte() * getPrecoUnitario();
    }
}

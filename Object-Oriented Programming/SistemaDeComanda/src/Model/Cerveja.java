package Model;

public class Cerveja extends ItemConsumo{
    public Cerveja(String nome, int qte, double precoUnitario) {
        super(nome, qte, precoUnitario);
    }

    @Override
    public double calcularSubtotal() {
        return getQte() * getPrecoUnitario();
    }
}

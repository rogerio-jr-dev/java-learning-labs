package Model;

public class Espetinho extends ItemConsumo{
    public Espetinho(String nome, int qte, double precoUnitario) {
        super(nome, qte, precoUnitario);
    }

    @Override
    public double calcularSubtotal() {
        return getQte() * getPrecoUnitario();
    }
}

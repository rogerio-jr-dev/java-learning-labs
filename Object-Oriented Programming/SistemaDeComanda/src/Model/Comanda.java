package Model;

import Enuns.StatusComanda;
import Model.Cliente;
import java.time.LocalDateTime;
import java.util.List;

import static Util.ResgatarBar.COUVERT;


public class Comanda {
    private String numero;
    private LocalDateTime dataFechamento;
    private StatusComanda status;
    private Cliente cliente;
    private List<ItemConsumo> itens;

    public List<ItemConsumo> getItens() {
        return itens;
    }
    public void adicionarItem(ItemConsumo item){
        itens.add(item);
    }
    public void removerItem(ItemConsumo item){
        itens.removeIf(p -> p.getNome().equals(item.getNome()));
    }
    public double calcularConsumoTotal(){
        double total = 0.0;
        for (ItemConsumo item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }
    public double calcularCouvert(){
        if (calcularConsumoTotal() > 30){
            return 0.0;
        }
        return COUVERT;
    }

}

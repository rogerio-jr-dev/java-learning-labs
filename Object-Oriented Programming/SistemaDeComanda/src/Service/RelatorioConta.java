package Service;

import Model.Comanda;

public class RelatorioConta {
    public void Imprimir(Comanda comanda){
        System.out.println("=================================\n" +
                "        BAR PREMIUM\n" +
                "=================================\n" +
                "\n" +
                "Cliente: João Silva\n" +
                "ID: CLI-0001\n" +
                "Ticket: TCK-1001\n" +
                "\n" +
                "Tipo: VIP\n" +
                "\n" +
                "Itens Consumidos\n" +
                "\n" +
                "7x Cerveja\n" +
                "1x Refrigerante\n" +
                "2x Espetinho\n" +
                "\n" +
                "Consumo: R$ 52,00\n" +
                "Couvert: Isento\n" +
                "Ingresso: R$ 8,00\n" +
                "\n" +
                "TOTAL: R$ 60,00\n" +
                "\n" +
                "=================================");
    }
}

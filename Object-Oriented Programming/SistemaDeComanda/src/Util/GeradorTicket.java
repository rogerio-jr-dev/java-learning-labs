package Util;

public final class GeradorTicket {

    private static int sequenciaCliente = 0;
    private static int sequenciaTicket = 1000;

    private GeradorTicket(){};

    public static String gerarIdCliente(){
        sequenciaCliente++;
        return String.format("CLI-%04d", sequenciaCliente);
    }

    public static String gerarTicket(){
        sequenciaTicket++;
        return String.format("TCK-%04d",sequenciaTicket);
    }
}

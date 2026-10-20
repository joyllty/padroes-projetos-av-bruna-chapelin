public class main {
    public static void main(String[] args) {

        Criador criadorAereo = new CriadorAereo();
        Criador criadorRodoviario = new CriadorRodoviario();
        Criador criadorFerroviario = new CriadorFerroviario();

        criadorAereo.emitirPassagem("Bruna", 1500);
        criadorRodoviario.emitirPassagem("Maria", 1700);
        criadorFerroviario.emitirPassagem("Pedro", 1600);
    }
}

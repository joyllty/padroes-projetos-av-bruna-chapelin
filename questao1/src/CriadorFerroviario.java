public class CriadorFerroviario extends Criador{

    @Override 
    public Produto fabrica(String nomePassageiro, double tarifa){
        return new Ferroviario(nomePassageiro, tarifa);
    }
}

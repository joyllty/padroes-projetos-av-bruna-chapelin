public class CriadorRodoviario extends Criador{
    
    @Override 
    public Produto fabrica(String nomePassageiro, double tarifa){
        return new Rodoviario(nomePassageiro, tarifa);
    }
}

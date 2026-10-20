public class CriadorAereo extends Criador{
    
    @Override 
    public Produto fabrica(String nomePassageiro, double tarifa){
        return new Aereo(nomePassageiro, tarifa);
    }
}

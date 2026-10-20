public abstract class Criador {
    
    public abstract Produto fabrica(String nomePassageiro, double tarifa);

    public void emitirPassagem(String nomePassageiro, double tarifa){
        Produto modal = fabrica(nomePassageiro, tarifa);

        modal.calcularTaxaEmbarque();
        modal.imprimirResumo();

    }
}

public abstract class Produto {
    protected String nomePassageiro;
    protected double taxaEmbarque;
    protected double tarifa;


    public Produto(String nomePassageiro, double tarifa){
        this.nomePassageiro = nomePassageiro;
        this.tarifa = tarifa;
    }

    public abstract void calcularTaxaEmbarque();
    public abstract String getLinhaModal();
    public abstract String listarDocumentos();

    public void imprimirResumo(){
        System.out.println("Modal: " + getLinhaModal());
        System.out.println("Nome passageiro: " + nomePassageiro);
        System.out.println("Taxa de Embarque: " + taxaEmbarque);
        System.out.println("Documentos: " + listarDocumentos());

    }
}
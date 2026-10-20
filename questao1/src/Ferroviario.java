public class Ferroviario extends Produto{
    
    public Ferroviario(String nomePassageiro, double tarifa){
        super(nomePassageiro, tarifa);
    }

    @Override 
    public void calcularTaxaEmbarque(){
        taxaEmbarque = tarifa * 0.05;
    }

    @Override 
    public String getLinhaModal(){
        return "Ferroviário";
    }
    @Override 
    public String listarDocumentos(){
        return "documento de identidade com foto e comprovante de reserva";
    }

}

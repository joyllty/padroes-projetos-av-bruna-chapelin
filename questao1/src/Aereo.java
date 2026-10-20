public class Aereo extends Produto {

    public Aereo(String nomePassageiro, double tarifa){
        super(nomePassageiro, tarifa);
    }

    @Override
    public void calcularTaxaEmbarque(){
        taxaEmbarque = tarifa * 0.08;
    }

    @Override
    public String getLinhaModal(){
        return "Aéreo";
    }

    @Override
    public String listarDocumentos(){
        return "documento de identidade com foto e bilhete eletronico (e-ticket)";
    }


}
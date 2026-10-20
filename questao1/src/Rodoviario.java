public class Rodoviario extends Produto {

    public Rodoviario(String nomePassageiro, double tarifa){
        super(nomePassageiro, tarifa);
    }

    public void calcularTaxaEmbarque(){
        taxaEmbarque = tarifa * 0.03;
    }

    public String getLinhaModal(){
        return "Rodoviário";
    }

    public String listarDocumentos(){
        return "documento de identidade com foto";
    }
}

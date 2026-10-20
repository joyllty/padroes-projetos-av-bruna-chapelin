public class Boleta extends Documento{
    
    @Override 
    public String gerarDocumento(){
        imposto = 19;
        
        return "\n>> IVA de " + imposto + "%";
    }
}

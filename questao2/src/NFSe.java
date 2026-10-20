public class NFSe extends Documento{

    @Override
    public String gerarDocumento(){
        imposto = 5;

        return "\n>> ISS de " + imposto + "%";
    }
}

public class ComprovanteChile extends Comprovante{
    
    @Override
    public String gerarComprovante(){
        identificacao = "RUT";

        return "\n>> Idenficação do aluno por " + identificacao;
        
    }


}

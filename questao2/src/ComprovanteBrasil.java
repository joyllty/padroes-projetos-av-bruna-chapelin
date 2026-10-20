public class ComprovanteBrasil extends Comprovante{
    
    @Override
    public String gerarComprovante(){
        identificacao = "CPF";

        return "\n>> Idenficação do aluno por " + identificacao;
        
    }

}

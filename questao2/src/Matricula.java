public class Matricula {

    private absFabrica fabrica;
    
    public Matricula (absFabrica fabrica){
        this.fabrica = fabrica;
    }

    public String realizarMatricula(){
        Documento documento = fabrica.criarDocumento();
        Pagamento pagamento = fabrica.criarPagamento();
        Comprovante comprovante = fabrica.criarComprovante();

        return "===== Documento Fiscal ====== " + documento.gerarDocumento() + 
        "\n===== Pagamento =====" + pagamento.gerarPagamento() +
        "\n===== Comprovante de Matrícula ======" + comprovante.gerarComprovante();

    }
}
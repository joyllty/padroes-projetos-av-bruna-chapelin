public class PagamentoBrasil extends Pagamento{

    @Override
    public String gerarPagamento(){
        tipoPagamento = "PIX";

        return "\n>> Pagamento: " + tipoPagamento;        
    }

}

public class PagamentoChile extends Pagamento{
    
    @Override
    public String gerarPagamento(){
        tipoPagamento = "Webpay";
        return "\n Pagamento: " + tipoPagamento;        

    }
    
}

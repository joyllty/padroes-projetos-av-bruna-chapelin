public class FabricaChile implements absFabrica{

    @Override
    public Documento criarDocumento(){
        return new Boleta();
    }

    @Override 
    public Pagamento criarPagamento(){
        return new PagamentoChile();
    }

    @Override 
    public Comprovante criarComprovante(){
        return new ComprovanteChile();
    }

}

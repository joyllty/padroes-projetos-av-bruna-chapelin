public class FabricaBrasil implements absFabrica{


    @Override
    public Documento criarDocumento(){
        return new NFSe();
    }

    @Override 
    public Pagamento criarPagamento(){
        return new PagamentoBrasil();
    }

    @Override 
    public Comprovante criarComprovante(){
        return new ComprovanteBrasil();
    }

}

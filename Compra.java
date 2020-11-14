public class Compra implements MudancaDeCategoria{
    private int id;
    private ClienteComum comprador;
    private Produto[] produtos;
    private double valorCompra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteComum getComprador() {
        return comprador;
    }

    public void setComprador(ClienteComum comprador) {
        this.comprador = comprador;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Compra(int id, ClienteComum cliente, Produto[] produto){
        this.id=id;
        this.comprador=cliente;
        this.produtos=produto;
        double valor=0;

        for (int i = 0; i != produto.length; i++) {
            valor = valor + produto[i].getValor();
            double nEstoque=produto[i].getEstoque()-1;
            produto[i].atualizaEstoque((int) nEstoque);
        }
        this.valorCompra=valor;
        this.verificaCategoria(this.converterValorEmPontos());
    }

    public void listaCompras(){
        System.out.println("id: "+this.getId());
        System.out.println("Comprador: "+this.getComprador());
        System.out.println("Valor gasto: "+this.getValorCompra());
        System.out.println("Lista: "+this.getProdutos());
    }


    @Override
    public double converterValorEmPontos() {
        double pontos = (this.getValorCompra()/2);
        comprador.setSaldoPontos(pontos);
        return pontos;
    }

    @Override
    public boolean verificaCategoria(double pontos) {
        boolean sentinela;
        if (pontos>=5){
            ClienteEspecial ce1 = new ClienteEspecial(this.converterValorEmPontos(),this.getValorCompra(),this.comprador); //transformando cliente comum em cliente especial
            System.out.println("Parabéns sr(a) "+ce1.getDono().getNome()+", você se tornou um cliente especial com um total de "+ce1.getSaldoPontos()+" pontos e "+ce1.getValorEmCompras()+"R$" );
            sentinela = true;
    
        }else{
            System.out.println("Você ainda não atingiu os pontos necessarios pra se tornar um cliente especial faltam "+(5-pontos)+" pontos para você ascender");
            sentinela = false;
        }
        return sentinela;
    }
}
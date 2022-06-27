package pacote;

public class Main {
    public static void main(String[] args) {
        /* como utilizar o programa, crie listas baseados nos produtos,
        a declaração segue a seguinte ordem, id-nome-estoque-preço*/
        //------------------Declaração dos produtos------------------------
        Produto p1 =  new Produto(1,"Bola",10,1);
        Produto p2 =  new Produto(2,"Regua",20,2);
        Produto p3 =  new Produto(3,"Caneta",30,3);
        Produto p4 =  new Produto(4,"Compasso",40,4);
        Produto p5 =  new Produto(5,"Lapis",50,5);
        /*Declaração dos clientes segue a ordem de id-nome-email-senha, o resto dos atributos é zerado automaticamente*/
        //------------------Declaração dos Clientes------------------------
        ClienteComum c1 = new ClienteComum(1,"Fulano","teste@a.com","aa");
        ClienteComum c2 = new ClienteComum(2,"Ciclano","teste@a.com","aa");
        ClienteComum c3 = new ClienteComum(3,"Beltrano","teste@a.com","aa");
        //------------------Compras-----------------------------------------
        /*Para fazer compras crie um array com o nome dos objetos que representam cada produto e depois  instancie um
        * objeto Compra na seguinte ordem -id-Objeto comprador-lista de compras*/
        Produto[] lista = {p5,p5};
        Compra co1 = new Compra(1,c1,lista);
        Produto[] lista2 = {p1};
        Compra co2 = new Compra(1,c2,lista2);
    }
}
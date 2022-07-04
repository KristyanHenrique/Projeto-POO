package pacote;

import java.util.ArrayList;

public class Produto {
    /*private ArrayList<Produto> listaProduto = new ArrayList<Produto>();*/
    private int id;
    private double estoque;
    private int valor;
    private String nome;


    public Produto(int id,String nome, int estoque, int valor){
        this.id=id;
        this.estoque=estoque;
        this.valor=valor;
        this.nome=nome;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    /*public void setLista(produto produto,ArrayList listaProduto){
        ListaProduto.add(produto);
        System.out.println(ListaProduto);
    }*/

    public void atualizaEstoque(int nEstoque){
        this.setEstoque(nEstoque);
    }
}

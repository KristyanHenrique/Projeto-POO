public final class ClienteComum extends Pessoa{
    private double saldoPontos;
    private double valorEmCompras;

    public ClienteComum(int id, String nome, String email, String senha){
        this.setId(id);
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.saldoPontos=0;
        this.valorEmCompras=0;

    }

    public double getSaldoPontos() {
        return saldoPontos;
    }

    public void setSaldoPontos(double saldoPontos) {
        this.saldoPontos = saldoPontos;
    }

    public double getValorEmCompras() {
        return valorEmCompras;
    }

    public void setValorEmCompras(double valorEmCompras) {
        this.valorEmCompras = valorEmCompras;
    }

}

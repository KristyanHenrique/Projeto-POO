public final class ClienteEspecial extends Pessoa{
    private double saldoPontos;
    private double valorEmCompras;
    private Pessoa dono;

    public ClienteEspecial(double saldo, double valor, Pessoa dono1){
        this.setDono(dono1);
        this.setSaldoPontos(saldo);
        this.setValorEmCompras(valor);
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

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

}

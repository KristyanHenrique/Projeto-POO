package pacote;

public interface MudancaDeCategoria {
    double valorMinimo = 5;
    double converterValorEmPontos();
    boolean verificaCategoria(double pontos);
}
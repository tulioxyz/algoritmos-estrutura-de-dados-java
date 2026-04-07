package teste;

import algoritimos.busca.BuscaBinaria;

public class TesteTempoBusca {
    public static void main(String[] args) {
        int tamanho = 100000000;
        int[] vetor = GeradorDeVetor.gerarVetorCrescente(tamanho);

        long tempoInicial = System.nanoTime();
        //int i = BuscaSimples.busca(vetor, 50000000);
        //int i = BuscaBinaria.buscaBinaria(vetor,999999999);
        int i = BuscaBinaria.auxRecursiva(vetor, 1);
        long tempoFinal = System.nanoTime();
        gerarRelatorio("busca",tamanho,tempoInicial,tempoFinal);
    }
    public static void gerarRelatorio(String descricao, int tamanho,long tempoInicial, long TempoFinal){
        System.out.println(descricao);
        System.out.println("Tamanho "+tamanho);
        System.out.println("Tempo:"+((TempoFinal-tempoInicial)/1000000)+" ms ["+(TempoFinal-tempoInicial)+"]");
    }
}

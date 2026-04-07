package teste;

public class GeradorDeVetor {
    public static int[] gerarVetorCrescente(int tamanho){
        int [] vetor = new int [tamanho];
        for(int i=0; i<vetor.length; i++){
            vetor[i] = i;
        }
        return vetor;
    }



}

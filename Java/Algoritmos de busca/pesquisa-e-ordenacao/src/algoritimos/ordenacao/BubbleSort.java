package algoritimos.ordenacao;

public class BubbleSort {
    public static void ordenar(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(vetor[j] > vetor[j+1]){
                    int temp = vetor[i];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
}

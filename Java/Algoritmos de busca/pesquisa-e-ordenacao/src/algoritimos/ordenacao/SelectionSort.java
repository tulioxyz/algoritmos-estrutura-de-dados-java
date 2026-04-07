package algoritimos.ordenacao;

public class SelectionSort {
    public static void ordenar(int[] vetor){
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            int temp = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = temp;
        }
    }
}

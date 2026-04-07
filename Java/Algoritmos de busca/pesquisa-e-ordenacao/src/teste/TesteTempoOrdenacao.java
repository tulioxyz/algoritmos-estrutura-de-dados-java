package teste;

import algoritimos.ordenacao.BubbleSort;
import algoritimos.ordenacao.InsertionSort;
import algoritimos.ordenacao.SelectionSort;
import utils.ArrayGenerator;

public class TesteTempoOrdenacao {
    public static void main(String[] args) {
        int[] vetor = ArrayGenerator.generateDescending(300000); // ou generateSortedArray, generateReverseSortedArray
        long start = System.nanoTime();
        InsertionSort.ordenar(vetor);
        long end = System.nanoTime();
        double durationMs = (end - start) / 1_000_000; // converte para milissegundos
        System.out.println("Tempo de execução: " + durationMs + " ms");
    }
}

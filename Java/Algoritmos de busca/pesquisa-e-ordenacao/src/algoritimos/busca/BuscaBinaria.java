package algoritimos.busca;

public class BuscaBinaria {
    public static int buscaBinaria (int [] vetor, int valor){
        int esquerda = 0;
        int direita = vetor.length-1;

        while(esquerda<=direita){
            int meio = (esquerda+direita)/2;

            if (vetor[meio] == valor){
                return 1;
            }
            if (vetor[meio] < valor){
                esquerda = meio + 1;
            }
            if (vetor[meio] > valor){
                direita = meio - 1;
            }
        }
        return -1;
    }

    public static int auxRecursiva(int [] vetor, int valor){
        int esquerda = 0;
        int direita = vetor.length-1;

        return buscaRecursiva(vetor, valor, esquerda, direita);
    }

    private static int buscaRecursiva(int [] vetor, int valor, int esquerda, int direita){
        if(esquerda > direita){
            return -1;
        }

        int meio = (esquerda+direita)/2;

        if (vetor[meio] == valor){
            return 1;
        }
        if(vetor[meio] < valor){
            esquerda = meio + 1;
        }
        if(vetor[meio] > valor){
            direita = meio - 1;
        }

        return buscaRecursiva(vetor, valor, esquerda, direita);
    }



}

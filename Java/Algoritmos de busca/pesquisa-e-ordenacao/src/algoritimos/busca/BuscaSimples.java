package algoritimos.busca;

public class BuscaSimples {
    public static int busca(int [] vetor, int valor){
        for(int i=0; i<=(vetor.length - 1); i++){
            if(vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }
}

package lista;

public class Lista<T> {

    private No<T> primeiro;

    // Método para inserir um valor no início da lista
    public void inserirNoInicio(T valor){
        No<T> novoNo = new No<>(valor);
        novoNo.proximo = this.primeiro;
        this.primeiro = novoNo;
    }

    // Método para inserir um valor no final da lista
    public void inserirNoFim(T valor){
        No<T> novoNo = new No<>(valor);
        if(this.primeiro == null){// 1 4 5  7
            this.primeiro = novoNo;
        } else {
            No<T> atual = this.primeiro;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Método para inserir um valor numa posição específica
    public void inserirNaPosicao(int indice, T valor){

    }

    public void removerNoInicio(){

    }

    // Método para remover o último valor da lista
    public void removerDoFim(){

    }

    // Método para remover um valor de uma posição específica
    public void removerNaPosicao(int indice){

    }

    // Método para imprimir os valores da lista
    public void imprimir(){
        for(No<T> atual = this.primeiro; atual != null; atual = atual.proximo){
            System.out.println(atual.valor);
        }

//        No<T> atual = this.primeiro;
//        while (atual != null) {
//            System.out.println(atual.valor);
//            atual = atual.proximo;
//        }
    }

    // Método para obter a quantidade de elementos na lista
    public int quantidade(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Método para verificar se a lista está vazia
    public boolean estaVazio(){
        return this.primeiro == null;
    }

    // Método para limpar a lista, removendo todos os elementos
    public void limpar(){

    }

    // Método para buscar um elemento por índice
    T buscarPorIndice(int indice){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Método para buscar um elemento por valor e retornar o seu índice
    public int buscarPorValor(T valor){
        throw new UnsupportedOperationException("Not supported yet.");
    }


    // 0. Cria uma lista a partir de um vetor
    public Lista fromArray(Object[] array) {
        Lista lista = new Lista();
        for(int i=0; i<array.length; i++){
            lista.inserirNoFim(array[i]);
        }
        return lista;
    }

    // 1. Concatena a lista atual com outra lista, retornando uma nova lista
    public Lista<T> concatenar(Lista<T> outraLista) {
        Lista listaTemp = new Lista();
        No<T> atual = this.primeiro;

        while(atual != null){
            listaTemp.inserirNoFim(atual.valor);


            atual = atual.proximo;

        }
        return listaTemp;
    }

    // 2. Remove os n primeiros elementos da lista
    public boolean removerNPrimeiros(int n) {
        // TODO: Implementar a lógica de remoção
        return false;
    }

    // 4. Fazer uma função que cópia uma lista L1 em outra lista L2.
    public Lista<T> copiar() {
        // TODO: Implementar a lógica de cópia
        return null;
    }

    // 5. Fazer uma função para inverter uma lista L1 colocando o resultado em L2.
    public Lista<T> inverter() {
        // TODO: Implementar a lógica de inversão
        return null;
    }

    // 6. Fazer uma função para inverter uma lista L1 alterando o seu próprio estado.
    public void autoInverter() {
        // TODO: Implementar a lógica de auto-inversão
    }

    // 7. Escreva uma função que verifica se duas listas dadas são iguais.
    public boolean saoIguais(Lista<T> outraLista) {
        // TODO: Implementar a lógica de comparação
        return false;
    }

    // 8. Crie uma função que remova todos os elementos duplicados de uma lista.
    public void removerDuplicados() {
        // TODO: Implementar a lógica de remoção de duplicados
    }

    // 9. Implemente uma função que rotacione a lista para a esquerda por um número k de posições.
    public void rotacionar(int k) {
        // TODO: Implementar a lógica de rotação
    }

    // 10. Escreva uma função que retorne uma nova lista contendo os elementos de um índice `inicio` até um índice `fim`.
    public Lista<T> sublista(int inicio, int fim) {
        // TODO: Implementar a lógica de sublista
        return null;
    }

    // 11. Crie uma função que intercale os elementos de duas listas.
    public Lista<T> intercalar(Lista<T> outraLista) {
        // TODO: Implementar a lógica de intercalação
        return null;
    }
}

package arvore;

public class ArvoreBinariaDeBusca {
    No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }


    //questao01
    //inserir
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }
        return no;
    }

    //remover
    public void remover(int valor) {
        raiz = removerRec(this.raiz, valor);
    }

    private No removerRec(No no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor < no.valor) {
            no.esquerda = removerRec(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = removerRec(no.direita, valor);
        } else {
            if (no.esquerda == null && no.direita == null) {
                return null;
            }

            if (no.esquerda == null) {
                return no.direita;
            }

            if (no.direita == null) {
                return no.esquerda;
            }

            int menor = menorSub(no.direita);
            no.valor = menor;
            no.direita = removerRec(no.direita, menor);
        }

        return no;
    }

    private int menorSub(No no) {
        if (no.esquerda == null) {
            return no.valor;
        }
        return menorSub(no.esquerda);
    }

    //busca
    public boolean buscaRecAux(int valor) {
        return buscaRec(raiz, valor);
    }

    private boolean buscaRec(No no, int valor) {
        if (no == null) {
            return false;
        }
        if (valor == no.valor) {
            return true;
        }
        if (valor < no.valor) {
            return buscaRec(no.esquerda, valor);
        } else {
            return buscaRec(no.direita, valor);
        }
    }

    //questao02
    public void imprimirInOrdem() {
        emOrdem(this.raiz);
    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }

    //questao03
    public int altura() {
        return alturaRec(this.raiz);
    }

    private int alturaRec(No no) {
        if (no == null) {
            return -1;
        }

        int esquerda = alturaRec(no.esquerda);
        int direita = alturaRec(no.direita);

        return 1 + (esquerda > direita ? esquerda : direita);
    }

    //questao04
    public boolean isBalanceada() {
        return balanceadaRec(this.raiz);
    }

    private boolean balanceadaRec(No no) {
        if (no == null) {
            return true;
        }

        int esquerda = alturaRec(no.esquerda);
        int direita = alturaRec(no.direita);

        int diferenca = esquerda - direita;
        if (diferenca < 0) {
            diferenca = -diferenca;
        }

        if (diferenca > 1) {
            return false;
        }

        return balanceadaRec(no.esquerda) && balanceadaRec(no.direita);
    }

    //questao05
    public int menorValor() {
        return acharMenor(this.raiz, this.raiz.valor);
    }

    private int acharMenor(No no, int menor) {
        if (no == null) {
            return menor;
        }
        if (no.valor < menor) {
            menor = no.valor;
            return acharMenor(no.esquerda, menor);
        } else {
            return acharMenor(no.esquerda, menor);
        }
    }

    public int maiorValor() {
        return acharMaior(this.raiz, this.raiz.valor);
    }

    private int acharMaior(No no, int maior) {
        if (no == null) {
            return maior;
        }
        if (no.valor > maior) {
            maior = no.valor;
            return acharMaior(no.direita, maior);
        } else {
            return acharMaior(no.direita, maior);
        }
    }

    //questao06
    public void imprimirEmNiveis() {
        imprimirNivelRec(this.raiz, 0, altura());
    }

    private void imprimirNivelRec(No no, int nivelAtual, int nivelMaximo) {
        if (nivelAtual > nivelMaximo) {
            return;
        }

        imprimirNivel(no, nivelAtual);
        System.out.println("\n");
        imprimirNivelRec(no, nivelAtual + 1, nivelMaximo);
    }

    private void imprimirNivel(No no, int nivel) {
        if (no == null) {
            return;
        }

        if (nivel == 0) {
            System.out.print(no.valor + " ");
        } else {
            imprimirNivel(no.esquerda, nivel - 1);
            imprimirNivel(no.direita, nivel - 1);
        }
    }

    //questao07
    public int contarNos() {
        return contadorNos(this.raiz, 0);
    }

    private int contadorNos(No no, int contagem) {
        if (no == null) {
            return contagem;
        }
        contagem++;
        contagem = contadorNos(no.esquerda, contagem);
        contagem = contadorNos(no.direita, contagem);

        return contagem;
    }

    //questao08
    public int contarFolhas() {
        return contarFolhasRec(this.raiz);
    }

    private int contarFolhasRec(No no) {
        if (no == null) {
            return 0;
        }

        if (no.esquerda == null && no.direita == null) {
            return 1;
        }

        return contarFolhasRec(no.esquerda) + contarFolhasRec(no.direita);
    }

    //questao09
    public void removerPares() {
        removerParesRec(this.raiz);
    }

    private void removerParesRec(No no) {
        if (no == null) {
            return;
        }

        removerParesRec(no.esquerda);
        removerParesRec(no.direita);

        if (no.valor % 2 == 0) {
            remover(no.valor);
        }
    }

    //questao10
    public boolean verificarNegativos() {
        No no = raiz;
        while (no != null) {
            if (no.valor < 0) {
                return true;
            }
            no = no.esquerda;
        }
        return false;
    }

    //questao11
    public boolean busca(int valor) {
        No no = raiz;
        while (no != null) {
            if (valor == no.valor) {
                return true;
            }
            if (valor < no.valor) {
                no = no.esquerda;
            } else {
                no = no.direita;
            }
        }
        return false;
    }

    //questao12
    public int somarValoresRecAux() {
        return somaRec(this.raiz, 0);
    }

    private int somaRec(No no, int soma) {
        if (no == null) {
            return soma;
        }
        soma += no.valor;
        soma = somaRec(no.esquerda, soma);
        soma = somaRec(no.direita, soma);

        return soma;
    }

    //questao 13
    public double mediaValores() {
        return somarValoresRecAux() / contarNos();
    }

    //questao 14
    public void caminhoValor(int valor) {
        caminhoValorRec(raiz, valor);
    }

    private void caminhoValorRec(No no, int valor) {
        if (no == null) {
            return;
        }
        if (valor == no.valor) {
            System.out.print(no.valor + " ");
            return;
        }
        if (valor < no.valor) {
            System.out.print(no.valor + " -> ");
            caminhoValorRec(no.esquerda, valor);
        } else {
            System.out.print(no.valor + " ->  ");
            caminhoValorRec(no.direita, valor);
        }
    }

}

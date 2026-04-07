package questao01;

import arvore.ArvoreBinariaDeBusca;

public class Principal {

    public static void main(String[] args) {

        //questao 01
        System.out.println("\nquestao 01");

        //inserir
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();
        arvore.inserir(30);
        arvore.inserir(24);
        arvore.inserir(2);
        arvore.inserir(-3);
        arvore.inserir(4);
        arvore.inserir(40);
        arvore.inserir(37);
        arvore.inserir(42);
        arvore.inserir(41);
        arvore.inserir(1);
        arvore.inserir(-1);
        arvore.inserir(-2);
        arvore.inserir(-7);
        arvore.inserir(44);
        arvore.inserir(35);

        //remover
        arvore.remover(-3);

        //busca
        int num = -3;
        System.out.println(num + " esta na arvore?");
        System.out.println(arvore.buscaRecAux(num));
        System.out.println("-----------------------------");

        //questao 02
        System.out.println("\nquestão 02");
        arvore.imprimirInOrdem();
        System.out.println("\n-----------------------------");

        //questao 03
        System.out.println("\nquestão 03");
        System.out.println("Altura: " + arvore.altura());
        System.out.println("\n-----------------------------");

        //questao 04
        System.out.println("\nquestão 04");
        System.out.println("É balanceada? : " + arvore.isBalanceada());
        System.out.println("\n-----------------------------");

        //questao 05
        System.out.println("\nquestão 05");
        System.out.println("Menor: " + arvore.menorValor());
        System.out.println("Maior: " + arvore.maiorValor());
        System.out.println("-----------------------------");

        //questao 06
        System.out.println("\nquestão 06");
        arvore.imprimirEmNiveis();
        System.out.println("-----------------------------");

        //questao 07
        System.out.println("\nquestão 07");
        System.out.println("Existem " + arvore.contarNos() + " nós");
        System.out.println("-----------------------------");

        //questao 08
        System.out.println("\nquestão 08");
        System.out.println("Existem " + arvore.contarFolhas() + " folhas");
        System.out.println("-----------------------------");

        //questao 09
        System.out.println("\nquestão 09");
        arvore.imprimirInOrdem();
        arvore.removerPares();
        System.out.println("\nremove pares:");
        arvore.imprimirInOrdem();
        System.out.println("\n-----------------------------");

        //questao 10
        System.out.println("\nquestão 10");
        System.out.println("Tem negativos? " + arvore.verificarNegativos());
        System.out.println("-----------------------------");

        //questao 11
        System.out.println("\nquestão 11");
        num = 5;
        System.out.println(num + " esta na arvore?");
        System.out.println(arvore.busca(num));
        System.out.println("-----------------------------");

        //questao 12
        System.out.println("\nquestão 12");
        System.out.println("Soma: " + arvore.somarValoresRecAux());
        System.out.println("-----------------------------");

        //questao 13
        System.out.println("\nquestão 13");
        System.out.println("Media: " + arvore.mediaValores());
        System.out.println("-----------------------------");

        //questao 14
        System.out.println("\nquestão 14");
        num = 1;
        arvore.caminhoValor(num);
        System.out.println("-----------------------------");
    }
}
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rOSCD9R9)
# Atividade Prática: Listas com Alocação Dinâmica

## Objetivo

Esta atividade visa praticar os algoritimos de ordenação e busca, além de analisar o desempenho de cada um deles em diferentes cenários.

- As questões 3, 6 e 7 devem ser respondias de forma manuscrita e entregues ao professor.

## Questões
01. Inplemente os seguintes algoritmos de busca em Java:
   - Busca Linear
   - Busca Binária (Iterativa)
   - Busca Binária (Recursiva)

02. Para cada algoritmo implementado na questão 01 crie e execute funções para medir o tempo de execução com as seguintes combinações:
    Formato de Entrada:
    - Lista com números em ordem crescente.

    Tamanho da Entrada:
    - 10.000 elementos
    - 1.000.000 elementos
    - 1.000.000.000 elementos
    
    Elemento a ser buscado:
    - O elemento a ser buscado deve ser o último elemento da lista.
    - O elemento a ser buscado deve ser um elemento que não está na lista (por exemplo, se a lista vai de 1 a N, busque por N+1).
    - O elemento a ser buscado deve ser o elemento do meio da lista.
    - O elemento a ser buscado deve ser o primeiro elemento da lista.

    Ex:
    - Busca Linear - 10.000 elementos - Último elemento
    - Busca Linear - 10.000 elementos - Elemento não presente
    - Busca Linear - 10.000 elementos - Elemento do meio
    - Busca Linear - 10.000 elementos - Primeiro elemento
    - Busca Linear - 1.000.000.000 elementos - Último elemento
    - ...
    - Busca Binária (Recursiva) - 5.000.000 elementos - Primeiro elemento

Apresente os resultados obtidos uma tabela, apresentando o tempo de execução em milissegundos (ms). Considere que para medir o tempo de execução você pode utilizar `System.currentTimeMillis()` antes e depois da chamada do método de busca.

03. Analise os resultados obtidos nas questões anteriores e responda:
    - Quail algorítimo de busca teve o melhor desempenho para cada tipo de entrada?
    - Com base nos seus estudos, qual tipo de entrada favorece algoritimo de busca linear
  
  
04. Implemente cada um dos seguintes algoritmos de ordenação em Java:
   - Bubble Sort
   - Selection Sort
   - Insertion Sort
   - Merge Sort
   - Quick Sort

05. Para cada algoritmo implementado na questão 01 crie e execute funções para medir o tempo de execução com as seguintes combinações:
    Formato de Entrada:
    - Lista com números em ordem aleatória.
    - Lista com números em ordem crescente.
    - Lista com números em ordem decrescente.

    Tamanho da Entrada:
    - 10.000 elementos
    - 1.000.000 elementos
    - 1.000.000.000 elementos

    Ex:

    - Bubble Sort - Aleatória - 10.000 elementos
    - Bubble Sort - Aleatória - 1.000.000 elementos
    - Bubble Sort - Aleatória - 1.000.000.000 elementos
    - Bubble Sort - Crescente - 10.000 elementos
    - ...
    - Quick Sort - Decrescente - 50.000 elementos

Apresente os resultados obtidos uma tabela, como no exemplo abaixo, apresentando o tempo de execução em milissegundos (ms). 
O código para medir o tempo de execução pode ser semelhante ao seguinte:
```java
import utils.ArrayGenerator;

int[] vetor = ArrayGenerator.generateRandomArray(10000); // ou generateSortedArray, generateReverseSortedArray
long start = System.nanoTime();
algoritimo.ordenar(vetor);
long end = System.nanoTime();
double durationMs = (end - start) / 1_000_000; // converte para milissegundos
System.out.println("Tempo de execução: " + durationMs + " ms");

```

    | Algoritmo   | Tipo de entrada | 10.000 | 1.000.000  | 1.000.000.000 | 
    | ----------- | --------------- | ----- | ------ | ------ |
    | Bubble Sort | Aleatória       | 3 ms  | 80 ms  | 320 ms |
    | Bubble Sort | Crescente       | 1 ms  | 4 ms   | 7 ms   | 
    | Bubble Sort | Decrescente     | 6 ms  | 210 ms | 820 ms | 
    | Merge Sort  | Aleatória       | ...   | ...    | ...    | 
    | ...         | ...             | ...   | ...    | ...    |

06. Analise os resultados obtidos nas questões anteriores e responda:
    - Quais algoritmos apresentaram melhor desempenho para cada tipo de entrada?
    - Quais algoritmos apresentaram pior desempenho para cada tipo de entrada?
    - Algum algoritmo teve um desempenho significativamente diferente dependendo do tipo de entrada? Explique o motivo.
    - Com base nos resultados, qual algoritmo você recomendaria para ordenar listas em geral?

7. Faça uma pesquisa e responda:
   - O que é complexidade de espaço em algoritmos?
   - Qual a complexidade de tempo e espaço de cada um dos algoritmos de busca e ordenação implementados?



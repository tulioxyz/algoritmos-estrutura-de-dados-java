# Respostas atividade
## Questões
02.
| 10.000 elementos     | Busca simples | Busca binaria | Busca binaria recursiva |
    |----------------------|---------------|---------------|-------------------------| 
| Ultimo elemento      | 3 ms          | 2 ms          | 1 ms                    | 
| Elemento inexistente | 3 ms          | 2 ms          | 0 ms                    | 
| Elemento do meio     | 1 ms          | 0 ms          | 1 ms                    | 
| Primeiro elemento    | 0 ms          | 4 ms          | 0 ms                    | 


| 1.000.000 elementos  | Busca simples | Busca binaria | Busca binaria recursiva |
    |----------------------|---------------|---------------|-------------------------| 
| Ultimo elemento      | 20 ms         | 2 ms          | 3 ms                    | 
| Elemento inexistente | 23 ms         | 3 ms          | 1 ms                    | 
| Elemento do meio     | 15 ms         | 0 ms          | 1 ms                    | 
| Primeiro elemento    | 1 ms          | 4 ms          | 1 ms                    | 

| 100.000.000 elementos | Busca simples | Busca binaria | Busca binaria recursiva |
    |-----------------------|---------------|---------------|-------------------------| 
| Ultimo elemento       | 160 ms        | 1 ms          | 1 ms                    | 
| Elemento inexistente  | 180 ms        | 1 ms          | 1 ms                    | 
| Elemento do meio      | 90 ms         | 1 ms          | 1 ms                    | 
| Primeiro elemento     | 0 ms          | 1 ms          | 1 ms                    | 

3. a) **Qual algorítimo de busca teve o melhor desempenho para cada tipo de entrada?**

   | | 10.000                          | 1.000.000                        | 100.000.000             |
   |-|---------------------------------|----------------------------------|-------------------------|
   | Ultimo elemento | Busca binaria recursiva         | Busca binaria                    | Busca binaria/recursiva |
   | Elemento inexistente | Busca binaria recursiva         | Busca binaria recursiva          | Busca binaria/recursiva |
   | Elemento do meio | Busca binaria                   | Busca binaria                    | Busca binaria/recursiva |
   | Primeiro elemento | Busca simples/binaria recursiva | Busca simples/binaria recursiva  | Busca simples           |

b) **Com base nos seus estudos, qual tipo de entrada favorece algoritimo de busca linear?** Quando a 
entrada é o primeiro elemento do vetor.

5. 

| Algoritmo      | Tipo de entrada | 10.000 | 100.000   | 300.000   | 
|----------------|-----------------|--------|-----------|-----------|
| Bubble Sort    | Aleatória       | 160 ms | 11.425 ms | 83.708 ms |
| Bubble Sort    | Crescente       | 80 ms  | 3.633 ms  | 19.914 ms | 
| Bubble Sort    | Decrescente     | 200 ms | 12.124 ms | 97.798 ms | 
| Selection Sort | Aleatória       | 244 ms | 9.807 ms  | 79.182 ms | 
| Selection Sort | Crescente       | 99 ms  | 2.895 ms  | 16.004 ms |
| Selection Sort | Decrescente     | 147 ms | 9.644 ms  | 80.870 ms |
| Insertion Sort | Aleatória       | 109 ms | 5.787 ms  | 41.597 ms |
| Insertion Sort | Crescente       | 2 ms   | 15 ms     | 32 ms     |
| Insertion Sort | Decrescente     | 182 ms | 11.063 ms | 84.279 ms |

6. **Analise os resultados obtidos nas questões anteriores e responda:**

a) **Quais algoritmos apresentaram melhor desempenho para cada tipo de entrada?**

| Tipo de entrada | 10.000 | 100.000   | 300.000   |
|-----------------|--------|-----------|-----------|
| Aleatória       | Insertion Sort | Insertion Sort | Insertion Sort |
| Crescente       | Insertion Sort  | Insertion Sort  | Insertion Sort |
| Decrescente     | Selection Sort | Selection Sort | Selection Sort |

b) **Quais algoritmos apresentaram pior desempenho para cada tipo de entrada?**

| Tipo de entrada | 10.000 | 100.000   | 300.000   |
|-----------------|--------|-----------|-----------|
| Aleatória       | Selection Sort  | Bubble Sort | Bubble Sort |
| Crescente       | Selection Sort  | Bubble Sort  | Bubble Sort |
| Decrescente     | Bubble Sort | Bubble Sort | Bubble Sort |

c) **Algum algoritmo teve um desempenho significativamente diferente dependendo do 
tipo de entrada? Explique o motivo.** Sim, o insertion sort teve valores impressionantes
quando o vetor era crescente, trouxe valores baixos enquanto os valores estavam lá em cima.

d) **Com base nos resultados, qual algoritmo você recomendaria para ordenar listas em geral?**
O insertion sort, pois apresentou bons resultados.

7. Faça uma pesquisa e responda:

a) **O que é complexidade de espaço em algoritmos?** A complexidade de espaço em algoritmos 
mede a quantidade de memória que um algoritmo usa para ser executado, em relação ao 
tamanho da entrada. É um dos dois principais fatores de análise de eficiência, ao lado 
da complexidade de tempo. A análise é geralmente expressa usando a notação Big O, que 
descreve o crescimento da memória necessária à medida que o tamanho da entrada (\(n\)) 
aumenta. 

b) **Qual a complexidade de tempo e espaço de cada um dos algoritmos de busca e 
ordenação implementados?**

| Algoritmo | Melhor Caso | Caso Médio | Pior Caso | 
|-------------|--------------|--------------|-------------|
| Busca Simples | O(1) | O(n) | O(n) | 
| Busca Binári | O(1) | O(log n) | O(log n) |  
| Busca Binária Recursiva | O(1) | O(log n) | O(log n) |
| Bubble Sort | O(n) | O(n²) | O(n²) | 
| Selection Sort | O(n²) | O(n²) | O(n²) | 
| Insertion Sort | O(n) | O(n²) | O(n²) |










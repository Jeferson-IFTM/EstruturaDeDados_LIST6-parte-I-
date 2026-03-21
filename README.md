# TAD Lista Sequencial em Java (MyArrayList)

Este projeto apresenta a implementação de um **Tipo Abstrato de Dados (TAD) Lista Sequencial** utilizando a linguagem Java. O objetivo principal é demonstrar a manipulação de arrays nativos, controle de capacidade dinâmica e a lógica de **deslocamento (shift)** de elementos na memória.

## 📌 Sobre a Atividade
A atividade consiste em desenvolver a classe `MyArrayList` que simula o comportamento de uma lista dinâmica (como o `ArrayList` do Java), garantindo que os elementos permaneçam organizados sequencialmente.

### Operações Implementadas:
* **Inserção:** `addFirst`, `addLast`, `insertAt` (com lógica de shift para a direita).
* **Remoção:** `removeFirst`, `removeLast`, `removeAt`, `remove` (com lógica de shift para a esquerda).
* **Busca e Acesso:** `find`, `get`.
* **Atualização:** `set`.
* **Utilitários:** `display` (exibição do estado da lista) e controle automático de capacidade.

---

## ⚙️ Detalhes da Implementação

### Lógica de Deslocamento (Shift)
Diferente de listas encadeadas, a lista sequencial exige que, ao inserir um elemento em uma posição intermediária, todos os sucessores sejam "empurrados" para a direita. Da mesma forma, ao remover, os elementos à direita devem ser "puxados" para a esquerda para evitar buracos no array.

### Complexidade de Tempo
| Operação | Complexidade |
| :--- | :--- |
| Acesso (get/set) | $O(1)$ |
| Inserção/Remoção no Final | $O(1)$ amortizado |
| Inserção/Remoção no Início | $O(n)$ |


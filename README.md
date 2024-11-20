# Lista Duplamente Encadeada com Inserção Ordenada e Sublista de Pares

## Descrição

Este projeto implementa uma lista duplamente encadeada em Java com dois métodos principais:
1. **Inserção ordenada de elementos do tipo `Integer`**: O método garante que os elementos sejam inseridos de forma ordenada, evitando duplicatas.
2. **Criação de uma sublista contendo apenas elementos pares**: O método percorre a lista original e cria uma nova lista com apenas os valores pares encontrados.

Além disso, o projeto inclui uma classe de teste que demonstra a inserção de elementos na lista e imprime os resultados, mostrando tanto a lista ordenada quanto a sublista de pares.

## Estruturas de Dados

### Lista Duplamente Encadeada (`ListaDuplamenteEncadeada.java`)

- **Estrutura**: Implementa uma lista duplamente encadeada que suporta elementos do tipo `Integer`.
- **Métodos**:
  - `insereOrdenado(Integer valor)`: Insere um valor na lista de forma ordenada. Se o valor já existir, não será adicionado.
  - `retornaListaPares()`: Retorna uma nova lista contendo apenas os valores pares da lista original.
  - `imprimirLista()`: Imprime todos os elementos da lista de forma encadeada.

### Classe de Teste (`App.java`)

- **Função**: Cria uma instância de `ListaDuplamenteEncadeada`, insere alguns valores e imprime a lista ordenada. Em seguida, chama o método `retornaListaPares()` para obter e imprimir a sublista de elementos pares.

## Como Executar

1. **Clone o repositório** ou baixe os arquivos.
2. **Abra o terminal** na pasta onde os arquivos estão localizados.
3. **Compile os arquivos Java**:
   ```bash
   javac ListaDuplamenteEncadeada.java App.java
   ```
4. **Execute o programa**:
   ```bash
   java App
   ```
5. **Verifique a saída**, que mostrará a lista ordenada seguida da sublista de pares.

## Exemplo de Saída

```text
Inserindo 5: true
Inserindo 3: true
Inserindo 7: true
Inserindo 10: true
Inserindo 6: true
Inserindo 2: true
Lista ordenada após inserções:
2 -> 3 -> 5 -> 6 -> 7 -> 10
Sublista de elementos pares:
2 -> 6 -> 10
```

## Checklist do que foi pedido e implementado

| Tarefa                                                              | Status     |
|--------------------------------------------------------------------|------------|
| Implementar inserção ordenada de elementos do tipo `Integer`.       | ✔️         |
| Impedir a inserção de valores duplicados.                           | ✔️         |
| Implementar método para retornar sublista contendo elementos pares. | ✔️         |
| Criar classe de teste que insira valores e imprima os resultados.    | ✔️         |
| Imprimir lista ordenada.                                            | ✔️         |
| Imprimir sublista de elementos pares.                               | ✔️         |

# WordHistogram

Este projeto Java implementa um histograma de palavras simples.

## Descrição
O programa analisa uma string de texto, conta a frequência de cada palavra e permite consultar a contagem de uma palavra específica.

## Estrutura do Projeto
- `Main.java`: Classe principal para execução do programa.
- `WordHistogram.java`: Classe responsável pela análise e contagem das palavras.
- `MyIterator.java`: (Opcional) Implementação de um iterador personalizado, se necessário.

## Como Executar
1. Compile os arquivos Java:
   ```sh
   javac src/*.java
   ```
2. Execute o programa principal:
   ```sh
   java -cp src Main
   ```

## Exemplo de Uso
O programa analisa a string:
```
olá, meu nome é raquel Raquel
```
E imprime a contagem da palavra "raquel" (ignorando maiúsculas/minúsculas).

# Atividade 06 - Matrizes

Cinco exercícios de Java básico, com uma classe por questão.

## IntelliJ IDEA

1. Extraia o ZIP e abra a pasta Atividade06 em **File > Open**.
2. Selecione um JDK (17 ou 21, por exemplo) em **File > Project Structure > Project**.
3. Abra uma classe Exercicio01 a Exercicio05 e execute pelo triângulo verde ao lado de main.
4. Digite **um número inteiro por linha**, pressionando Enter após cada valor.

A pasta src deve estar marcada como Sources Root. Caso não esteja, use o botão direito nela e selecione **Mark Directory as > Sources Root**.

## Organização

| Arquivo | Exercício |
| --- | --- |
| Exercicio01.java | Ler e mostrar uma matriz 3x3 |
| Exercicio02.java | Somar todos os elementos de uma matriz 3x3 |
| Exercicio03.java | Encontrar o maior valor de uma matriz 3x3 |
| Exercicio04.java | Contar os pares em uma matriz 2x3 |
| Exercicio05.java | Mostrar a diagonal principal de uma matriz 3x3 |

Os exercícios usam dois for aninhados na leitura e Integer.parseInt(IO.readln(...)), conforme o enunciado. A diagonal usa m[i][i].

IO.java é apenas uma classe auxiliar de leitura para permitir executar o projeto em JDKs anteriores ao Java 25. Não é uma sexta questão. Mantenha esse arquivo junto aos exercícios; a lógica de cada questão está em seu próprio main.

## Exemplos para conferir

- Exercício 1: valores 1 a 9 formam as linhas 1 2 3 / 4 5 6 / 7 8 9.
- Exercício 2: valores 1 a 9 resultam em Soma: 45.
- Exercício 3: 4, 7, 1, 9, 2, 6, 3, 8, 5 resultam em Maior valor: 9.
- Exercício 4: 4, 7, 10, 3, 8, 5 resultam em Quantidade de pares: 3.
- Exercício 5: valores 1 a 9 resultam em Diagonal principal: 1 5 9.

Forneça entradas inteiras válidas. A soma usa int, conforme solicitado, e pressupõe que o total caiba nesse tipo.

## Entrega

Use um repositório exclusivo para a Lista 06. Envie o código e este README ao GitHub e cole o endereço real do repositório na atividade do Moodle. Não entregue apenas o ZIP. Confira que o professor tem acesso ao repositório e confirme o envio no Moodle.

Material preparado com assistência de IA. A atividade restringe uso excessivo de IA: execute, revise e compreenda as soluções antes de entregar.

# Paradigmas de Programação: Imperativo vs Declarativo

## Introdução

Existem diferentes maneiras de pensar (e programar). Os dois principais paradigmas são o **imperativo** e o **declarativo**. Enquanto o imperativo é quando você fala "faça isto, depois aquilo" (o **como**), o declarativo é quando você diz "eu quero isto" e deixa o computador descobrir o caminho (o **quê**). Neste texto, vamos comparar esses dois estilos usando exemplos reais em Java e Prolog.

## O Paradigma Imperativo: "Me Mostre Como"

O paradigma imperativo é aquele que a maioria dos programmadores conhece desde o início. Você diz exatamente o que fazer, passo a passo. É como dar uma receita de bolo: "pegue a farinha, adicione ovo, mexa bem...".

Características principais:

- **Sequência importa**: Você faz uma coisa, depois outra, em ordem.
- **Variáveis mudam**: Você cria uma variável, depois muda seu valor várias vezes.
- **Você controla tudo**: Você escreve loops `for`, `if`, `while` - você está no comando.

Linguagens com Java, Python e C são imperativas.

## O Paradigma Declarativo: "Aqui está o Objetivo"

O paradigma declarativo é diferente. Você descreve o problema, não a solução. É como dizer "eu preciso de um bolo" em vez de descrever cada passo da receita. O sistema descobre como fazer.

Características principais:

- **Foco nas relações**: Você define fatos e regras.
- **Dados não mudam**: Você criapois estruturas novas, não modifica as antigas.
- **O computador controla**: O sistema descobre o caminho automaticamente.

Prolog é o melhor exemplo. SQL também usa ideias declarativas.

## Comparação Rápida

| Aspecto | Imperativo | Declarativo |
|--------|-----------|------------|
| Pergunta | Como? | O quê? |
| Controle | Você controla tudo | O sistema controla |
| Variáveis | Vivem mudando | Praticamente imutáveis |
| Velocidade | Geralmente mais rápido | Pode ser mais lento |
| Bom para | Processos sequenciais | Lógica e busca |

## Exemplo Prático: Calculando Fatorial

### Java (Imperativo)

```java
public class Fatorial {
    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
```

**O que acontece:**
1. Você cria uma variável `resultado = 1` para armazenar o resultado.
2. Um loop vai de 2 até n, multiplicando `resultado` a cada volta.
3. Quando termina, você tem seu fatorial.

É bem direto: comece em 1, multiplique 2, depois 3, depois 4, depois 5... Feito!

### Prolog (Declarativo)

```prolog
fatorial(0, 1) :- !.
fatorial(N, F) :-
    N > 0,
    N1 is N - 1,
    fatorial(N1, F1),
    F is N * F1.

?- fatorial(5, X).
% X = 120
```

**O que significa:**
1. Primeira regra: "o fatorial de 0 é 1" (ponto base).
2. Segunda regra: "o fatorial de N é N vezes o fatorial de N-1".

Você apenas diz *o quê* é fatorial. Quando pergunta `fatorial(5, X)`, Prolog usa suas regras para calcular: 5 × (4 × (3 × (2 × (1 × 1)))) = 120.

## Qual Usar e Quando?

**Use Imperativo quando:**
- Você sabe exatamente os passos (como processar dados, ler arquivo, etc).
- Velocidade é importante.
- Você precisa modificar coisas (manipular listas, alterar valores).

**Use Declarativo quando:**
- O problema é "lógico" (encontrar rotas, verificar relações, etc).
- Corretude importa mais que velocidade.
- É mais fácil descrever o resultado do que o processo.

## Conclusão

Os dois paradigmas não são rivais - são ferramentas diferentes. Java (imperativo) é perfeito para apps e sistemas que realmente existem no "mundo real". Prolog (declarativo) é ótimo para resolver quebra-cabeças lógicos e sistemas especialistas.

Na verdade, muitas linguagens modernas (como Python, JavaScript, até Java com streams) misturam os dois. Você escolhe qual faz mais sentido no momento.

A moral da história? Entender esses paradigmas faz você um programador mais flexível e criativo.

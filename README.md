
# 🎯 Jogo da Adivinhação em Java

Este é um simples jogo de adivinhação feito em Java, onde o jogador deve tentar descobrir um número secreto gerado aleatoriamente. O jogador escolhe entre três níveis de dificuldade, que determinam o intervalo do número secreto e a quantidade de tentativas disponíveis.

## 📋 Como funciona

Ao iniciar o programa, o jogador é solicitado a escolher um dos seguintes níveis de dificuldade:

- **(1) Fácil**:  
  - Número entre 0 e 24  
  - Máximo de **15 tentativas**

- **(2) Médio**:  
  - Número entre 0 e 49  
  - Máximo de **20 tentativas**  
  - A cada 2 erros, o jogo dá uma dica se o número é maior ou menor

- **(3) Difícil**:  
  - Número entre 0 e 99  
  - Máximo de **30 tentativas**  
  - Dicas a cada 2 erros (igual ao modo médio)

## 🧠 Lógica do jogo

1. O número secreto é gerado aleatoriamente com base na dificuldade.
2. O jogador insere chutes até acertar ou esgotar o número de tentativas.
3. O jogo fornece feedback:
   - Se o chute foi maior ou menor que o número secreto.
   - Se as tentativas acabaram.
   - Se o jogador acertou.

## 💻 Como executar

Para compilar e executar este jogo:

```bash
javac Adivinha.java
java Adivinha
```

⚠️ É necessário ter o Java instalado na sua máquina.

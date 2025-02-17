![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> firstInput[\ Digite sua Nota \]
      firstInput --> secondInput[\ Digite a sua Frequência \]
      secondInput --> verification{" Nota >= 50? \nE\n Frequência >= 75%? "}
      verification --> |Sim| A[/ Aprovado /]
      verification --> |Não| B[/ Reprovado /]
      A --> finish([ Fim ])
      B --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> firstInput[\ Digite o Primeiro número \] 
      firstInput --> secondInput[\ Digite o Segundo número \] 
      secondInput --> sum[ Resultado \n = \n Primeiro número \n + \n Segundo número]
      sum --> output[/ Resultado /] --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite um Número\]
      input --> verification{ Número >= 0? }
      verification --> | Sim | A[/ Positivo /]
      verification --> | Não | B[/ Negativo /]
      A --> finish([ Fim ])
      B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite a sua Idade \]
      input --> secondInput[\" Tem Título de eleitor(S/N)? "\]
      secondInput --> verification{ Idade >= 16? \nE\n Título de eleitor === S? }
      verification --> | Sim | A[/ Você pode votar /]
      verification --> | Não | B[/ Você não pode votar /]
      A --> finish([ Fim ])
      B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> firstInput[\ Digite o primeiro número \]
      firstInput --> secondInput[\ Digite o segundo número \]
      secondInput --> verification{ Primeiro número \n>\n Segundo número? }
      verification --> | Sim | A[/ O Primeiro número é o maior entre ambos/]
      verification --> | Não | B[/ O Segundo número é o maior entre ambos/]
      A --> finish([ Fim ])
      B --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> firstInput[\ Digite n1 \]
      firstInput --> secondInput[\ Digite n2 \]
      secondInput --> thirdInput[\ Digite n3 \] 
      thirdInput --> verification{ n1 > n2? \nE\n n1 > n3? }
      verification --> | Sim | A[/ O n1 é o maior entre os números /]
      verification --> | Não | secondVerification{ n2 > n1 \nE\n n2 > n3? }
      secondVerification --> | Sim | B[/ O n2 é o maior entre os números /]
      secondVerification --> | Não | C[/ O n3 é o maior entre os números /]
      A --> finish([ Fim ])
      B --> finish
      C --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite n \]
      input --> A[ i = 1 \n fatorial = 1 ]
      A --> B[ fatorial = fatorial * i]
      B --> C[ i = i + 1 ]
      C --> verification{ i <= n }
      verification --> | Sim | B
      verification --> | Não | D[/ fatorial /]
      D --> finish([ Fim ])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite n \]
      input --> verification{ n % 2 == 0? }
      verification --> | Sim | A[/ O número é par /]
      verification --> | Não | B[/ O número é ímpar /]
      A --> finish([ Fim ])
      B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\" Digite n (Número maior que zero) "\]
      input --> if{ n > 0? }
      if --> | Sim | A[
         valor = 1
         divisor = 0
      ]
      if --> | Não | input
      A --> if2{ n % valor == 0? }
      if2 --> | Sim | B[ divisor = divisor + 1 ]
      if2 --> | Não | C[ valor = valor + 1 ]
      B --> C
      C --> if3{ valor <= n }
      if3 --> | Sim | if2
      if3 --> | Não | if4{ divisor == 2 }
      if4 --> | Sim | D[/ É primo /]
      if4 --> | Não | E[/ Não é primo /]
      D --> finish
      E --> finish
   ```
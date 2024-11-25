# Um hotel em Terabithia

Todo mundo quer aprender a trabalhar com código, mas nós vamos além do código. Sua capacidade de analisar um problema é a habilidade mais importante que você pode desenvolver. Os problemas abaixo possuem um contexto mais rebuscado, mas vamos encontrar soluções.

Encontre um lugar silencioso (não estou falando do filme), concentre-se, e tente por um tempo. Depois, se quiser, reúna a galera e vão se ajudando. Com paciência e dedicação, todos conseguirão chegar até lá.

## Hora de pensar!
Hoje vamos desenvolver um programa feito com vários outros programas utilizando um conceito de software modulado, feito com partes independentes. O objetivo é desenvolver uma plataforma para funcionários do hotel usarem, não os hóspedes.

## Instruções Gerais

1. **Execução Inicial**:
    - Execute o código proposto e veja como ele se comporta.
    
2. **Adaptação do Programa Principal**:
    - Invente um nome para o Hotel.
    - Ao acessar o sistema, exiba "Bem vindo ao {Hotel}".
    - Ao acessar o sistema, pergunte o nome do usuário e uma senha. O nome do usuário não precisa de validação. A senha deve ser 2678.
    - Na função "inicio", utilize escolha/caso (switch/case) para validar a opção escolhida pelo usuário.
    - Sempre que o usuário acessar o sistema, diga "Bem vindo ao Hotel {Hotel}, {Nome}. É um imenso prazer ter você por aqui!".
    - Substitua a expressão {Hotel} pelo nome do hotel informado pelo em todos os pontos do código.
    - Sempre que o usuário sair do sistema, exiba a mensagem "Muito obrigado e até logo, {Nome}."
    - Para cada escolha que o usuário fizer no menu principal, deve ser desenvolvido um programa seguindo as instruções abaixo. Esse programa deve ser criado utilizando uma função principal como chamada. Todo o restante é feito com sua liberdade.
    - Atualize o menu de opções e a função inicio com todas as opções de programas abaixo.
    - Atualize a função "erro" com as novas opções do menu.
    - Ao encerrar qualquer programa abaixo, sempre retorne ao menu inicial.

---

## Programas

### 1. Quantos quartos são?

**Objetivo**: Desenvolver um programa para reserva de quartos.

**Requisitos**:
1. O hotel possui 20 quartos e ao iniciar o programa todos estão livres.
2. Receber o valor de uma diária no hotel e a quantidade de dias de hospedagem.
   - Valide as informações: o valor da diária não pode ser negativo e a quantidade de dias não pode ser nem negativa, nem maior que 30.
   - Em caso de informação inválida, escreva na tela “Valor Inválido” e volte ao inicio do programa.
3. Pergunte o nome do hóspede.
4. Informe o número do quarto (de 1 a 20).
   - Verifique se o quarto está ocupado e, se estiver, ofereça a escolha de outro quarto.
5. Pergunte se o usuário confirma a reserva. Caso não aceite, volte ao menu inicial.

**Exemplo de Interação**:

```
Programa pergunta   => "Qual o valor padrão da diária?"
Resposta do usuário => -12
Programa exibe      => “Valor inválido, {Nome}”

Programa pergunta   => "Qual o valor padrão da diária?"
Resposta do usuário => 55.0
Programa pergunta   => "Quantas diárias serão necessárias?"
Resposta do usuário => 10
Programa exibe      => "O valor de 10 dias de hospedagem é de R$550.0"
Programa pergunta   => "Qual o nome do hóspede?"
Resposta do usuário => Carlos Moreira
Programa pergunta   => "Qual o quarto para reserva? (1 - 20)?"
Resposta do usuário => 7
Programa exibe      => "Quarto Livre."
Programa pergunta   => "{Nome}, você confirma a hospedagem para Carlos Moreira por 10 dias para o quarto 7 por R$550.0? S/N"
Resposta do usuário => S
Programa exibe      => "{Nome}, reserva efetuada para Carlos Moreira."
Programa exibe      => Lista de quartos e suas ocupações "1- livre; 2- livre; 3- livre; 4- livre; 5-ocupado; 6- livre; 7- ocupado; 8- livre; 9- livre; 10-livre; 11- livre; 12- livre; 13- livre; 14- livre; 15-livre; 16- livre; 17- livre; 18- livre; 19- livre; 20-ocupado"
```
### 2) Como soletra?

Aqui vamos tratar do cadastro de hóspedes. 
Imagine que uma família acaba de chegar ao balcão do hotel e quer se hospedar. 

Primeiro diremos ao programa o valor padrão da diária e só então cadastraremos todos os hóspedes. 
O programa receberá vários nomes de hóspedes e suas idades, sem limites. 

Caso o hóspede tenha menos de 6 anos, ela ou ele não paga a diária – nesses casos mostre na tela “[Nome do hóspede] possui gratuidade”.  
Caso o hóspede tenha mais de 60, ela ou ele paga metade da diária – mostre na tela “[Nome do hóspede] paga meia”.

O usuário informará hóspedes até digitar a palavra “PARE”, que interrompe a entrada de dados. 

Ao fim, mostre a quantidade de gratuidades, a quantidade de meias hospedagens e o valor total, considerando todos os hóspedes informados.

**Exemplo:**

```
Programa pergunta   => "Qual o valor padrão da diária?"  
Resposta do usuário => 100

Programa pergunta   => "Qual o nome do Hóspede?"  
Resposta do usuário => Rosani Albuquerque  
Programa pergunta   => "Qual a idade do Hóspede?"  
Resposta do usuário => 25  
Programa exibe         => "Rosani Albuquerque cadastrada(o) com sucesso."

Programa pergunta   => "Qual o nome do Hóspede?"  
Resposta do usuário => Jailson Albuquerque  
Programa pergunta   => "Qual a idade do Hóspede?"  
Resposta do usuário => 6  
Programa exibe          => "Jailson Albuquerque cadastrada(o) com sucesso. Jailson possui gratuidade"

Programa pergunta   => "Qual o nome do Hóspede?"  
Resposta do usuário => Gabriel Albuquerque  
Programa pergunta   => "Qual a idade do Hóspede?"  
Resposta do usuário => 19  
Programa exibe          => "Gabriel Albuquerque cadastrada(o) com sucesso."

Programa pergunta   => "Qual o nome do Hóspede?"  
Resposta do usuário => Wesley Albuquerque  
Programa pergunta   => "Qual a idade do Hóspede?"  
Resposta do usuário => 82  
Programa exibe        => "Wesley Albuquerque cadastrada(o) com sucesso. Wesley paga meia"

Programa pergunta   => "Qual o nome do Hóspede?"  
Resposta do usuário => PARE  
Programa exibe          => "{Nome}, o valor total das hospedagens é: R$250; 1 gratuidade(s); 1 meia(s)"
```
### 3) Com "S" ou com "Z"?

Aqui vamos tratar do cadastro de hóspedes, mas de uma forma diferente. 
Como no programa anterior, imagine que uma família acaba de chegar ao balcão do hotel e quer se hospedar. 

Monte um programa em que o usuário poderá cadastrar e pesquisar hóspedes. 

O programa deve oferecer um menu com algumas opções ao usuário: 1- cadastrar; 2- pesquisar; 3-listar; 4- sair. 

A opção “cadastrar” deve permitir que o usuário informe um nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja essa quantidade, mostre “Máximo de cadastros atingido”). 

A opção “pesquisar” deve permitir que o usuário informe um nome e, caso seja encontrado um nome exatamente igual, mostre a mensagem “Hospede (nome) foi encontrado". Se o nome não foi encontrado mostre “Hóspede não encontrado”. 

A opção “listar” exibe todos os hóspedes do hotel um a um. 

O programa deve permitir que o usuário realize essas operações repetidas várias vezes, até que use a opção “4”, que retorna ao menu principal.   

**Exemplo 1**:

```
Programa pergunta   => "Selecione uma opção: 1. Cadastrar - 2. Pesquisar - 3. Sair"
Resposta do usuário => 1
Programa pergunta   => "Qual o nome do Hóspede?"
Resposta do usuário => Rosani Albuquerque
Programa exibe      => "Hóspede " + nome_hospede + " foi cadastrada(o) com sucesso!"
Programa pergunta   => "Selecione uma opção: 1. Cadastrar - 2. Pesquisar - 3. Sair"
```
**Exemplo 2**:

```
Programa pergunta   => "Selecione uma opção: 1. Cadastrar - 2. Pesquisar - 3. Sair"
Resposta do usuário => 2
Programa pergunta   => "Qual o nome do Hóspede?"
Resposta do usuário => Rosani Albuquerque
Programa exibe      => "Hóspede Rosani Albuquerque foi encontrada(o)!"
Programa pergunta   => "Selecione uma opção: 1. Cadastrar - 2. Pesquisar - 3. Sair"
```
**Exemplo 3:**:

```
Programa pergunta   => "Selecione uma opção: 1. Cadastrar - 2. Pesquisar - 3. Sair"
Resposta do usuário => 2
Programa pergunta   => "Qual o nome do Hóspede?"
Resposta do usuário => Eleanor Fernandes
Programa exibe      => "Hóspede Eleanor Fernandes não foi encontrada(o)!"
Programa pergunta   => "Selecione uma opção: 1. Cadastrar - 2. Pesquisar - 3. Sair"
```

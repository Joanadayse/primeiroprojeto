<h1 align="center"> Meu primeiro projeto em Java </h1>


## 🔨 Funcionalidades do projeto

- `Funcionalidade 1`: A proposta é iniciarmos os dados do cliente como um extrato, e em seguida, teremos quatro opções de operações com a linha para inserir a opção desejada:
  
```Markdown
***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
```
- `Funcionalidade 2`: Se apertarmos a tecla "1", iremos consultar o saldo e mostraremos o valor atual de R$ 2500.0, mas se apertarmos "2", exibiremos um segundo campo para escrevermos: Informe o valor a receber:.
Inseriremos o valor que iremos depositar, como 700 por exemplo, e, ao apertarmos "Enter", mostraremos o saldo atualizado de R$ 3200.0.

  
```Markdown
//omitido

Digite a opção desejada:
2

Informe o valor a receber:
700

Saldo atualizado R$ 3200.0
```


- `Funcionalidade 3`: Mas se formos fazer uma transferência ou um saque com a tecla "3", teremos o campo Informe o valor que deseja transferir:. Se digitarmos 1000, exibiremos o saldo atualizado de R$ 2200.0.
 ```Markdown
///omitido

Digite a opção desejada:
3

Informe o valor que deseja transferir:
1000

Saldo atualizado R$ 2200.0
```

- `Funcionalidade 4`: Por fim, para encerrarmos a aplicação, bastará apertarmos a tecla "4" em Digite a opção desejada:. Mas se digitarmos um número inválido como "9" por exemplo, receberemos a mensagem Opção inválida.

# ✔️ Técnicas e tecnologias utilizadas

- ``Java 8``
- ``InteliJ IDEA``
- ``Paradigma de orientação a objetos``


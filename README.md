# 🏦 JavaBank - Sistema de Controle de Contas e Investimentos

## Descrição do Projeto

Sistema bancário simulado em Java, construído com Orientação a Objetos (POO), Streams, Lambdas e Records. Contem gestão de contas, transferências por PIX e controle de carteira de investimentos.

Permite a criação de contas, gestão de chaves PIX, depósitos, saques, transferências e o gerenciamento de uma carteira de investimentos.

## ✨ Funcionalidades Principais

O console interativo oferece as seguintes opções:

1. **Gestão de Contas:**
    * `1 - Criar uma conta`: Cria uma `AccountWallet` com chaves PIX únicas e um saldo inicial.
    * `4 - Depositar na conta`: Adiciona fundos à conta via PIX.
    * `5 - Sacar da conta`: Remove fundos da conta, com verificação de saldo.
    * `6 - Transferência entre contas`: Realiza transferências PIX entre duas contas.
    * `9 - Listar Contas`: Lista todas as contas criadas.
    * `13 - Histórico de conta`: Exibe o extrato financeiro da conta, agrupado por data.

2. **Gestão de Investimentos:**
    * `2 - Criar um invenstimento`: Cria um modelo base de investimento (`Investment`) com taxa e ID.
    * `3 - Criar uma carteira de investimento`: Cria uma `InvestmentWallet` vinculando uma conta existente a um `Investment` específico.
    * `7 - Investir`: Adiciona fundos a uma carteira de investimento existente (depósito).
    * `8 - Sacar investimento`: Resgata o valor de um investimento para a conta principal, com verificação de fundos.
    * `11 - Listar carteiras de investimento`: Exibe todas as carteiras de investimento ativas.
    * `12 - Atualizar investimento`: Aplica a taxa de rendimento (`tax`) a todas as carteiras ativas.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+ (necessário para Switch Expressions e Records).
* **Build Tool:** Gradle.
* **Dependências:** Lombok (para getters/setters/toString/etc. automáticos).
* **Conceitos de POO:** Herança (ex: `AccountWallet` estende `Wallet`), Polimorfismo.

## ⚙️ Como Rodar o Projeto Localmente

### Pré-requisitos
* Java Development Kit (JDK) 17 ou superior.
* Gradle (já incluído como wrapper no projeto).

### 1. Clonar o Repositório
```bash
git clone <URL_DO_SEU_REPOSITORIO>
cd java-bank

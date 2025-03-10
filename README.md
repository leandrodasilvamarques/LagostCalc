# LagostCalc - Calculadora de Divisão de Ganhos para Pescadores

**LagostCalc** é uma aplicação simples e intuitiva que foi desenvolvida com o objetivo de ajudar pescadores a calcular a divisão justa dos ganhos entre os membros da tripulação. A aplicação leva em consideração diferentes cargos a bordo, e a divisão é feita automaticamente, garantindo que todos recebam a porcentagem correta do total.

Este README contém uma explicação detalhada de como o aplicativo funciona, sua interface, e as funcionalidades implementadas.

---

## Ícone do Aplicativo

![Ícone do LagostCalc](https://github.com/user-attachments/assets/feb38a29-2e55-4b7a-9bdc-da91a1e33da6)

O ícone do aplicativo **LagostCalc** é composto por dois peixes nadando em um círculo com o símbolo de dólar ($) no meio. Esse ícone representa tanto a pesca quanto a divisão financeira dos lucros obtidos, refletindo o propósito da aplicação de calcular a parte de cada pescador no ganho total da pesca.

---

## Tela de Inserção de Dados - Quilogramas e Preço por Quilo

<img src="https://github.com/user-attachments/assets/a0b31e44-4f74-4965-bef5-229f58242940" width="200" />

### **Descrição**

Ao abrir o aplicativo, o usuário será recebido com a tela principal onde dois campos estão destacados:

- **Campo "Kg" (Peso em Quilogramas)**:
  - O usuário deve inserir o peso da pesca em **quilogramas**. Este valor é fundamental para o cálculo total do valor da pesca.
  - O campo está posicionado na parte superior esquerda da tela, conforme mostrado na imagem.

- **Campo "Valor" (Preço por Quilo)**:
  - Aqui, o usuário insere o preço pelo qual cada quilo de peixe será vendido. Esse valor será multiplicado pelo peso inserido no campo anterior para gerar o valor total da pesca.

Após a inserção desses dados, o usuário pode prosseguir clicando no botão **"CALCULAR"** para que a aplicação realize os cálculos automaticamente.

---

## Tratamento de Erros - Validação de Campos

<img src="https://github.com/user-attachments/assets/e1e77a48-df11-4470-9c02-196fc2efb15e" width="200" />

### **Descrição**

Se o usuário deixar de inserir um valor no campo "Kg", o aplicativo mostrará um **alerta de erro**. A tela exibe uma mensagem indicando que o campo precisa ser preenchido:

**Mensagem de erro**: “**Insira os quilos**”

Este alerta garante que o usuário não avance sem fornecer as informações necessárias para o cálculo, evitando erros nos resultados. A aplicação valida automaticamente os dados antes de permitir que o cálculo seja realizado.

---

## Tela com Cálculo Realizado - Distribuição dos Valores

<img src="https://github.com/user-attachments/assets/4bc8c06b-5241-4196-8aac-22024ec5b657" width="200" />

### **Descrição**

Após a inserção dos dados e o clique no botão **"CALCULAR"**, o aplicativo realiza os cálculos e exibe os resultados detalhados. O valor total é distribuído entre os pescadores e o barco da seguinte forma:

1. **Mestre**: 10% do total: **R$ 10.00**
2. **Mergulhador**: 10% do total: **R$ 10.00**
3. **Mangueirero**: 5% do total: **R$ 5.00**
4. **Barco** (restante após deduções): **R$ 60.00**

A tela mostra essas divisões de forma clara para cada cargo e exibe o **total final** logo abaixo, para garantir que todos os envolvidos saibam quanto cada um vai receber.

**Total Geral**: **R$ 100.00**

Essa divisão leva em conta as porcentagens específicas de cada função:

- O **Mestre** e o **Mergulhador** recebem 10% cada do total.
- O **Mangueirero** recebe 5%.
- O **Barco** recebe o restante após as deduções.

---

## Funcionalidades

- **Inserção de Dados**: O usuário insere o peso da pesca e o valor por quilograma.
- **Validação de Campos**: A aplicação verifica se os campos obrigatórios estão preenchidos corretamente e avisa o usuário caso contrário.
- **Cálculo Automático**: A aplicação realiza automaticamente o cálculo com base nos dados inseridos e apresenta os resultados detalhados para cada cargo.
- **Exibição de Resultados**: O valor total é dividido entre os pescadores de acordo com as porcentagens predefinidas, e o valor final do barco é mostrado.

---

## Tecnologias Utilizadas

- **Linguagem de Programação**: Kotlin
- **Framework**: View Binding
- **Design Responsivo**: A interface foi desenvolvida para ser simples, intuitiva e de fácil uso, garantindo uma experiência fluida em diferentes tamanhos de tela.

---

## Como Usar

1. **Insira os Dados**: Na tela principal, insira o peso da pesca (em Kg) e o valor por quilograma.
2. **Clique em "CALCULAR"**: Após inserir os dados, clique no botão **"CALCULAR"** para que a divisão seja realizada automaticamente.
3. **Veja o Resultado**: A divisão será mostrada com o valor de cada pescador e do barco, além do total geral.

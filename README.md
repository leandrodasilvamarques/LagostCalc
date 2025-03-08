Projeto: LagostCalc - Calculadora de Divisão de Ganhos
O LagostCalc é uma aplicação desenvolvida para simplificar o processo de divisão de ganhos entre pescadores, levando em consideração diferentes cargos e a quantidade de quilos de peixe pescados. A ferramenta foi projetada para reduzir o trabalho manual e as chances de erro ao calcular a participação de cada pescador no total, baseado em um percentual predeterminado.

Funcionalidade: Tela Inicial
Ícone do Aplicativo:

Imagem:![IMG-20250305-WA0005](https://github.com/user-attachments/assets/99c7a2a1-f003-4bce-85e5-82ec821323a7)


O ícone é composto por dois peixes nadando em um círculo com o símbolo de dólar ($) no meio, representando claramente o contexto de pesca e o aspecto financeiro da aplicação.
Entrada de Dados:

Imagem:
O usuário deve inserir o peso em quilogramas (Kg) no campo indicado na parte superior da tela. O campo recebe a entrada do peso do peixe que será calculado.
O aplicativo fornece um alerta, como mostrado na captura de tela, para garantir que o usuário insira os valores corretamente. Por exemplo, o erro "Insira os quilos" aparece quando o campo de peso é deixado em branco.
Tela de Cálculo
Valores para Cálculo:

Imagem:
O aplicativo exibe as entradas do usuário e calcula automaticamente o valor total de cada pescador, baseado em uma divisão percentual previamente configurada para cada cargo:
Mestre: 10% do total
Mergulhador: 10% do total
Mangueirero: 5% do total
Barco: recebe o restante, após a dedução dos valores para os pescadores.
Após inserir o valor total do peso e preço por quilo, o usuário deve clicar em "CALCULAR". Isso aciona o cálculo, e os valores são automaticamente calculados para cada pescador, conforme as porcentagens.
Resultado do Cálculo:

Imagem:
Após pressionar o botão de calcular, o total para cada pescador e o valor total geral são exibidos. No exemplo da imagem, o total foi de R$ 100,00, divididos entre os pescadores e o barco.
Tela de Valor Inicial:

Imagem:
Quando os campos ainda não são preenchidos com os valores do peso e do preço, o aplicativo exibe as caixas de texto com os valores em R$ 0,00.
Isso garante que o usuário saiba que ainda precisa inserir os dados para realizar o cálculo.
Como Funciona o Cálculo
Mestre e Mergulhador (10% cada):

Cada um recebe 10% do valor total, que é o produto do peso e do preço por quilo. Esses valores são calculados assim que o usuário insere os dados de entrada e clica em "CALCULAR".
Mangueirero (5%):

O mangueirero recebe 5% do valor total da pesca, o que também é calculado automaticamente após a inserção dos dados e o clique no botão de calcular.
Barco (restante):

O barco fica com o valor restante, após os percentuais dos pescadores terem sido deduzidos. O restante é automaticamente calculado e exibido na tela.
Considerações Finais
O LagostCalc é uma solução eficiente e intuitiva para aqueles que trabalham com pesca e necessitam de uma forma prática de dividir os lucros. A interface simples, com alertas e campos de entrada, facilita o uso até mesmo por pessoas que não têm familiaridade com cálculos complexos.

Este projeto reflete o compromisso com a inovação e a melhoria de processos no cotidiano. Ele facilita a vida dos pescadores, evitando erros comuns na divisão de valores, promovendo uma distribuição justa e transparente dos ganhos.

Tecnologias Utilizadas:

Linguagens: [Python, Java, ou Kotlin (dependendo da tecnologia usada no app)]
Frameworks: [Nome do framework utilizado]
Interface: [Design responsivo, framework de UI]


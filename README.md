# Wedding-Interface - O programa ideal para planejar seu casamento!

## Objetivo
Projeto apresentado como 'Projeto Integrador' do 3º semestre do curso de Sistemas de Informação. Tal ferramenta foi criada com o intuito de trazer praticidade com foco em usabilidade, tendo como objetivo facilitar a organização e a coordenação de um evento matrimonial, seja ele de pequena ou grande escala.

## Requisitos

IDE utilizada:
* [Apache NetBeans IDE 17](https://netbeans.apache.org/)

Banco de Dados utilizado:
* [MySQL Workbench](https://www.mysql.com/)

## Funcionamento

### Visão Geral
O programa foi criado na linguagem Java com a IDE citada acima e conta com a implementação de um CRUD. Todas as informações do planejamento contidas na ferramenta são armazenadas em um banco de dados local.
Com a ferramenta é possível:
* Cadastrar um usuário.
* Controlar o(s) convidado(s) inseridos no evento.[^1]
* Inserir, deletar ou editar o orçamento previsto para a realização do evento, garantindo o controle sobre os demais gastos.
* Controlar os gastos do noivo.
* Controlar os gastos do noiva.
* Controlar os gastos do evento.
* Controlar as informações relativas ao evento.
* Adicionar, remover ou editar anotações, se necessário.
Cada item citado é abordado com mais detalhes posteriormente nesse documento.

### A tela inicial
A tela inicial do programa conta com dois botões. O botão 'Cadastre-se' direciona o usuário a tela de cadastro, enquanto o botão 'Login' direciona o usuário a tela de login, caso este já tenha se cadastrado.
![tela-principal](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/2ec296f0-72e0-4e66-ae38-c07f9a832d6b)

Abaixo se encontra a tela de cadastro:
![tela-cadastro](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/ec008272-d2d7-461c-a0ac-5597d36eeaa2)
O usuário insere seu e-mail, seu nome de usuário e sua senha. O e-mail deve conter um domínio válido e sua senha deve ser numérica.
Ao final da tela, há o botão de 'Voltar', que retorna a tela inicial e há o botão de 'Cadastrar' que continua com o cadastro.

Tela de login:
![tela-login](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/5fe30ac7-8423-4881-ac99-98af97bb1f7b)
O usuário já cadastrado, insere suas informações nos campos correspondentes. Caso o usuário não esteja cadastrado, basta clicar no 'Clique aqui', localizado abaixo do campo de senha. Ao clicar no botão 'Entrar', o usuário é direcionado para a tela de orçamento do evento.

### A tela de orçamento
Essa é a principal tela de controle do programa, pois conta com todos os gastos do evento e do cônjuge, sendo possível o controle total dos gastos. Nessa seção do programa, o usuário pode inserir o gasto previsto para a realização do evento e dos itens envolvendo o cônjuge e os convidados. Ao informar o gasto de algum item das demais telas, o valor dos campos dessa tela serão atualizados e o valor será subtraído do gasto previsto e exibido no campo de 'Valor Restante'. O campo de 'Gasto Total' também será atualizado e exibirá a soma dos gastos da noiva, do noivo e do evento.
![tela-orçamento](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/624e2329-b7a6-418e-ae38-d456e4285f3d)
O gasto previsto pode ser alterado a qualquer momento ao alterar o valor do campo e clicar no botão 'Salvar'. Todos os cálculos serão refeitos ao realizar essa alteração.

### A tela da noiva
Todos os gastos envolvendo a noiva são informados nessa tela, de acordo com os campos. Assim como na tela de orçamento, os valores podem ser alterados a qualquer momento.
![tela-noiva](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/d240c09e-9fd3-420a-9b45-43ca7315d88c)
Ao clicar em 'Limpar' todos valores contidos nos campos são apagados.

### A tela do noivo
Todos os gastos envolvendo a noivo são informados nessa tela, de acordo com os campos. Assim como na tela de noiva, os valores podem ser alterados a qualquer momento.
![tela-noivo](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/5eb6ef70-ae48-49f7-a952-de47d2570c3c)

### A tela de evento
Essa seção é separada em duas partes por uma linha na horizontal. Na parte superior, o usuário insere as informações relativas ao matrimônio, como o local onde ocorrerá a festa, o local da igreja, a data e hora de ambos e da recepção e por último, qual será o foco do cardápio.
Na parte inferior após a linha, o usuário insere somente valores para cada item correspondente. Ou seja, só serão inserido valores nos campos que contém 'R$'. Ao final dessa seção, há um campo de anotações, onde o usuário pode escrever observações caso necessário.

![menu-evento](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/22c51466-e288-472b-bf07-f6ac0e1222cf)

### A tela de adicionar convidados
A tela de adicionar convidados contém quatro campos: 'Nome'; 'Restrição Alimentar', onde o usuário deve inserir o alimento no qual o convidado não pode consumir, caso exista; 'Telefone' e 'Grau Parentesco', onde o usuário deve inserir qual a relação do convidado com o cônjuge.
![tela-adicionar-convidado](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/f8f30b3f-c28b-4a7a-a210-589fc5695f21)

### A tela de gerenciar convidados
Aqui são listados todos os convidados cadastrados, sendo possível editar ou remover um convidado. Há presente também um campo para buscar convidados pelo nome, caso haja um número grande desses. Ao clicar em 'Remover' uma mensagem de alerta aparece, pois ao remover um convidado, não é possível recuperá-lo. Ao confirmar, o convidado é excluido.
Ao clicar em 'Editar' o usuário é direcionado para a tela de editar convidados.
![tela-gerenciar-convidados](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/7590a2c4-204d-4b77-bf6f-23e105a66bed)
Só é possível remover ou editar um convidado por vez.

### A tela de editar convidados
Nessa última tela, todas as informações referentes ao convidado selecionado são exibidas. Qualquer um dos campos podem ser alterados livremente pelo usuário. Ao clicar em 'Salvar', as informações do convidado selecionado são alteradas e são atualizadas na tabela da tela de gerenciar convidados.
![tela-editar-convidado](https://github.com/FelippePacomio/Wedding-Interface/assets/105086121/3712ed42-44d8-4d3e-891a-f6ba03df5121)

Lembrando que todas as informações inseridas pelo usuário no programa são guardadas em banco de dados local, garantindo a permanência dos dados do sistema.

[^1]: O uso do termo 'Controlar' nesses casos se referem ao acrônimo CRUD.


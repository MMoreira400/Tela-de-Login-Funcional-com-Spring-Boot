# Tela de Login Funcional com Spring Boot

Este projeto consiste em uma tela de login funcional utilizando HTML, CSS e JavaScript para o frontend e Java com Spring Boot para o backend. A logo utilizada foi criada a partir de uma inteligência artificial.

## Configuração

Para executar o projeto localmente, você deve ter um ambiente de desenvolvimento Java configurado em sua máquina. Recomendamos a utilização das IDEs Eclipse ou IntelliJ.

Para executar o projeto, siga os seguintes passos:

1. Clone este repositório em sua máquina.
2. Abra a IDE e importe o projeto.
3. Execute o projeto e aguarde até que a aplicação esteja completamente iniciada.
4. Abra o seu navegador e acesse o seguinte endereço: http://localhost:8090/loginForm.html. A tela de login será exibida e você poderá testar a funcionalidade de login.

O sistema já possui um banco de dados com um usuário cadastrado com as seguintes informações:

- Email: teste@gmail.com
- Senha: exemplo123
- Username: TesteUsuario

Por favor, note que as informações de usuário e senha são apenas para fins de demonstração e não devem ser utilizadas em uma aplicação real. Para implementar medidas de segurança mais robustas em sua aplicação, recomendamos a leitura da documentação do Spring Security e a consultoria de especialistas em segurança da informação.

## Configuração de Segurança e Validação de Usuário

As configurações de segurança e validação de usuário incluídas neste projeto são apenas demonstrativas e não devem ser usadas em uma aplicação real sem antes serem devidamente avaliadas e ajustadas de acordo com as necessidades e especificidades do projeto. É importante implementar medidas de segurança robustas em qualquer aplicação que manipule informações sensíveis ou confidenciais. Este projeto serve apenas como um exemplo de implementação básica de recursos de segurança em uma aplicação Spring Boot.

A tela emitirá um alerta conforme as credenciais cadastradas. Assim, caso o usuário coloque credenciais inválidas, a tela alertará conforme as validações que foram realizadas. Será validado também se o usuário existe no sistema e foi encontrado. 



# testes

<div style="display: inline-block;text-align: center;">

- Entrada com o Usuário

	<img src="https://user-images.githubusercontent.com/98768425/233737645-df8697f4-5036-4313-a036-93b94bd57378.gif" title="teste entrada com usuario" alt="" width="450px" height="562px">
  
- Entrada com Email

	<img src="https://user-images.githubusercontent.com/98768425/233737653-b936c537-762b-4181-82aa-cc37857a4723.gif" title="teste entrada com email" alt="" width="450px">
  
- Teste credencial inválida

	<img src="https://user-images.githubusercontent.com/98768425/233737648-5b7d8317-5ed3-491e-b27f-438b45d0f98a.gif" title="teste credencial inválida" alt="" width="450px">
  
- Teste usuário desconhecido

	<img src="https://user-images.githubusercontent.com/98768425/233737655-2686b98d-3fde-4c26-b85e-2833a3e1b4d6.gif" title="teste usuario desconhecido" alt="" width="450px">
</div>


## Contribuição

Sinta-se à vontade para contribuir com o projeto ou fazer um fork deste repositório. Qualquer tipo de contribuição é bem-vinda! Por favor, siga as melhores práticas de programação, inclua testes e documentação adequada em suas contribuições.

## Licença

Este projeto é licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.

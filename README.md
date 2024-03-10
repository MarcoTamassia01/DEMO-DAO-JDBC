# Acesso a banco de dados com JDBC

Este projeto em Java utiliza JDBC e a arquitetura DAO para acessar um banco de dados com duas tabelas: "seller" e "department". Cada vendedor ("seller") pertence a um departamento ("department").

## Funcionalidades Implementadas

  * Implementação de classes DAO (Data Access Object) para cada tabela, seguindo a arquitetura DAO.
  * Utilização de uma DAOFactory para instanciar as interfaces DepartmentDao e SellerDao, com implementações nas classes DepartmentDaoJDBC e SellerDaoJDBC, respectivamente.
  * Criação de um pacote de aplicação com as classes Program e Program2 para testar as funções DAO para cada tabela.

## Tratamento de Exceções

  *Implementação de tratamento de exceções em todo o projeto.
  *Criação de exceções personalizadas para situações específicas do projeto.

## Estrutura do Projeto

  * **application**: Contém as classes Program e Program2 para testar as funcionalidades DAO.
  * **dao**: Contém as interfaces DepartmentDao e SellerDao, juntamente com suas implementações DepartmentDaoJDBC e SellerDaoJDBC.
  * **entity**: Contém as classes Seller e Department para representar as entidades do banco de dados.
  

## Uso

Para utilizar este projeto, siga as instruções de instalação e configuração do banco de dados conforme descrito abaixo.

1. Instalação e Configuração
2. Faça o download do projeto.
3. Importe o projeto para sua IDE.
4. Configure o acesso ao banco de dados no arquivo jdbc.properties.
5. Execute a classe Program ou Program2 para testar as funcionalidades DAO

## Créditos

Agradecimentos especiais ao Professor Nelio Alves por sua contribuição.

## Contato

Para mais informações, entre em contato em marco.a.s.tamassia@gmail.com.





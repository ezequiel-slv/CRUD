# Cadastro CRUD em Java

Aplicação CRUD (Create, Read, Update, delete) desenvolvida em Java, utilizando JavaFX e FXML para construção da interface gráfica. O projeto segue uma arquitetura em camadas e utiliza Apache Maven para gerenciamento de dependências.

Além disso, conta com integração a banco de dados e suporte a execução via Docker.

Funcionalidades:

Cadastro de usuários
Listagem de registros
Atualização de dados
Exclusão de registros
Persistência em banco de dados

Tecnologias Utilizadas:
Java 25
JavaFX
FXML
Maven
Docker
Banco de dados (configure conforme o docker-compose.yml)

# Como Executar o Projeto

Pré-requisitos:
JDK 17 ou superior (recomendado: Java 25)
Maven instalado
Docker e Docker Compose instalados

Suba o banco de dados:
docker-compose up -d

# Execute a aplicação
Clone o repositório
git clone https://github.com/ezequiel-slv/Cadastro-crud.git

Acesse a pasta
cd cadastro-crud

Execute o projeto
mvn clean javafx:run

Ou execute diretamente a classe Main pela IDE.

# Estrutura do Projeto
src/main/java/com/ezequiel/cadastrocrud/

├── connection/ # Conexão com o banco de dados

├── controller/   # Controle da interface (JavaFX)

├── domain/       # Entidades do sistema (modelos)

├── repository/   # Interfaces de acesso a dados

├── service/      # Regras de negócio

└── Main.java     # Ponto de entrada da aplicação

# Arquitetura da Aplicação


Connection: responsável pela comunicação com o banco de dados

Controller: gerencia eventos da interface gráfica

Domain: representa as entidades do sistema

Repository: define operações de acesso aos dados

Service: contém regras de negócio

Main: inicializa a aplicação

# Interface Gráfica

Localização dos arquivos:

src/main/resources/com/ezequiel/cadastrocrud/telas/

cadastros.fxml: define a estrutura da interface gráfica

# Banco de Dados

O projeto utiliza Docker para facilitar a configuração do ambiente:

Arquivo: docker-compose.yml

Local: src/main/db

Certifique-se de configurar corretamente as credenciais de conexão no código.

# Fluxo da Aplicação
O usuário interage com a ‘interface’ (FXML)

O Controller captura o evento

O Service processa a lógica de negócio

O Repository executa operações de dados

A camada de Connection comunica com o banco

# Referência

Este projeto foi desenvolvido com base em um tutorial, sendo adaptado e expandido conforme a necessidade

👤 Autor

Ezequiel Silva


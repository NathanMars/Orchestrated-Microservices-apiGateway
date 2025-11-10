# Orchestrated-Microservices-apiGateway
Um API Gateway que intermedia a comunicação entre o cliente e diferentes microserviços. Parte de uma demonstração de arquitetura de microserviços em uma solução web ultilizando Spring Boot, Angular, Docker e Kubernetes.  

Caracteristicas do Projeto:  
- API Gateway desenvolvido em Spring Boot, permite a comunicação com os microserviços através de APIs REST
- Camada de segurança, autenticação e autorização ultilizando um servidor KeyCloak (configurações de segurança armazenadas em MySQL)
- Monitoramento de saúde dos diferentes componentes do sitemas, CircuitBreaker, Rate Limits, etc, implementados com Resilience4j e Actuator
- Comunicação entre este serviços realizada através de Interface REST Calls com Spring REST Client (o serviço de pedidos comunica com o serviço de inventário)
- Testes unitários de integração ultilizam JUnit, Stub Runner e Testcontainers
- Documentação automatizada das APIs com OpenAPI

Diagrama demonstrando a comunicação entre o usuario e os microserviços através do Gateway:  

![Diagrama do API Gateway de Orchestrated-Containerized-Microservices](/assets/gateway-driagram.jpeg)   

## Projeto Orchestrated-Containerized-Microservices
Este API Gateway faz parte de um projeto maior, ele intermedia a interação entre o cliente e os serviços, alem de oferecer medidas de segurança e monitoramento. Todos os serviços rodam em conteiners orquestrados pelo Kubernetes.
  
O projeto completo está distribuido entre diferentes repositórios neste perfil, seu diagrama completo pode ser analisado na imagem abaixo:

![Diagrama completo de Orchestrated-Containerized-Microservices](/assets/diagram.jpeg)  

Desenvolvido buscando seguir as melhores praticas de desenvolvimento de software. Os commits seguem os padrões de [Conventional Commits](https://gist.github.com/qoomon/5dfcdf8eec66a051ecd85625518cfd13).


# Controle de horas e acesso

Projeto "Construindo um sistema de controle de ponto e acesso com Spring Boot" do Santander Bootcamp | Fullstack Developer da Digital Innovation One.

Foram modeladas as tabelas e implementada a API REST para executar as operações CRUD na tabela JornadaTrabalho.

## Uso
Documentação [http://localhost:8081//swagger-ui.html](http://localhost:8081//swagger-ui.html)


jornada-trabalho-controller Jornada Trabalho Controller

GET localhost:8081/jornada - getJornadaList: Retorna lista de jornadas

POST localhost:8081/jornada - createJornada: Cria jornada enviada no request body

PUT localhost:8081/jornada - updateJornada: Atualiza jornada enviada no request body

GET localhost:8081/jornada/{idJornada} - getJornadaById: Retorna jornada com chave idJornada

DELETE localhost:8081/jornada/{idJornada} - deleteJornada: Apaga jornada com chave idJornada

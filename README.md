# Aplicacao para teste de Vertx

## Como criar um banco em docker
- Criar nova instancia local chamada mysql-vertx, escutando na porta 3306 (primeira vez)
```
$ sudo docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root --name mysql-vertx -d mysql
```
- Conectar por terminal no mysql criado
```
$ docker exec -it mysql-vertx mysql -uroot -proot
```
- Criar banco por linha de comandos
```
create database vertx;
```
- Usar o banco
```
use vertx
```
- Mostrar as tabelas
show tables;
- Levantar a instancia de docker (após reiniciar)
```
$ docker start mysql-vertx
```



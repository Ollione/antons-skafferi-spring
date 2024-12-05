# Webserver for restaurant project Antons Skafferi
To run the webserver you will need the latest version of
- Docker
- Docker-compose
- Permissions to run docker without sudo/root/admin
Make sure they are accessable via $PATH.

When cloning the project to IntelliJ you might need to create a run config. Go up to the right hand corner and select edit configurations ![image](https://github.com/user-attachments/assets/a00e10ad-73c0-4300-98a8-d5ce85987384)

Create a new config with the '+' button and select Spring Boot, give it a name and select java 17, select class "se.antons_skafferi.AntonsSkafferiSpringApplication" as main class then it should be up and running.

To initialize the database you will for now need to use these commands in the terminal, but a combined script will be made, make sure the docker container is up and running before running these, these might be Linux/Mac only 
- docker exec -i antons-skafferi-spring-mysql-1 mysql -u myuser -psecret mydatabase < sql/01-drops.sql
- docker exec -i antons-skafferi-spring-mysql-1 mysql -u myuser -psecret mydatabase < sql/02-tables.sql
- docker exec -i antons-skafferi-spring-mysql-1 mysql -u myuser -psecret mydatabase < sql/03-inserts.sql

To run all in one script use this command in the terminal
- cat sql/01-drops.sql sql/02-tables.sql sql/03-inserts.sql | docker exec -i antons-skafferi-spring-fork-mysql-1 mysql -u myuser -psecret mydatabase

The server can then be found at localhost:8080
The menu can be accessed at localhost:8080/menu/all

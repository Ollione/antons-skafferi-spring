# Webserver for restaurant project Antons Skafferi
To run the webserver you will need the latest version of
- Docker
- Docker-compose
- Permissions to run docker without sudo/root/admin

To initialize the database you will for now need to use these commands, but a combined script will be made, make sure the docker container is up and running
- docker exec -i antons-skafferi-spring-mysql-1 mysql -u myuser -psecret mydatabase < sql/01-drops.sql
- docker exec -i antons-skafferi-spring-mysql-1 mysql -u myuser -psecret mydatabase < sql/02-tables.sql
- docker exec -i antons-skafferi-spring-mysql-1 mysql -u myuser -psecret mydatabase < sql/03-inserts.sql

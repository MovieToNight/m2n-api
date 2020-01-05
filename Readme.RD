Setting Up MySQL DB locally

We recommend having a local docker instance of MySQL.

Kill all running docker instances:
docker rm -f $(docker ps -qa)
Run MySQL inside docker :
docker run -p 3306:3306 --name mysql -e MYSQL_USER=m2n -e MYSQL_PASSWORD=m2n -e MYSQL_DATABASE=m2n -e MYSQL_ALLOW_EMPTY_PASSWORD=true -d mysql:5.7 --max-allowed-packet=33554432
Run mysql container in interactive mode: docker exec -it mysql mysql -u m2n -p m2n




Build Docker java API

docker build -f Dockerfile -t e2n-api .


run image

docker run -p 8085:8085 --name m2n-api --link mysql:mysql -d m2n-api

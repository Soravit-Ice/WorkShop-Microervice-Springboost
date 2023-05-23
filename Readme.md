# WorkShop MicroService Spring boost using Docker

## Docker Image
Using Image From [docker image](https://hub.docker.com/_/eclipse-temurin)
## Command Docker
Build image 

        docker image build -t spring:1.0 .

Create Container 

        docker container run -d -p 9999:8080 spring:1.0
        * run on port 9999 call container port 8080 *

## Build Docker Multi Stage Image
Build image

        docker image build -t springdemo2:2.0 -f Dockerfile_multi_stage .

## Docker compose 
1. Create file `docker-compose.yml` 
2. Build image

        docker compose build
3. Run Container

        docker compose up -d
        docker compose ps <*list all container running*>
4. Remove all containers

        docker compose down <*shut down*>

## Push to Docker Hub
      docker image tag demo:2.0 soravit/spring:2.0
      docker login 
      docker push soravit/spring:2.0
## Docker Swarm
1. Create Custer

        docker swarm init
        docker node ls
2. Deploy


      docker stack deploy --compose-file docker-compose-deploy.yml dev
      docker stack ls
      docker service ls

## ![img.png](img.png)
## Scaling

      docker service scale dev_service1=5

## When change Code frontend using Nginx Docker Volume
      
      docker image pull nginx:1.23.4
      docker container run -d -p 9999:80 nginx:1.23.4

Assume create demo.html

      docker container run -d -p 9998:80 -v $(pwd)/demo.html:/usr/share/nginx/html/demo.html nginx:1.23.4
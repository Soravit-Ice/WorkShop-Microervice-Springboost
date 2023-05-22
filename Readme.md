# WorkShop MicroService Spring boost using Docker

## Docker Image
Using Image From [docker image](https://hub.docker.com/_/eclipse-temurin)
## Command Docker
Build image 

        docker image build -t spring:1.0 .

Create Container 

        docker container run -d -p 9999:8080 spring:1.0
        * run on port 9999 call container port 8080 *


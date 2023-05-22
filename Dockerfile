FROM eclipse-temurin:17.0.7_7-jdk-focal
WORKDIR /app
COPY . .
RUN ./mvnw package
CMD ["java" , "-jar" , "./target/workshopspring-0.0.1-SNAPSHOT.jar"]
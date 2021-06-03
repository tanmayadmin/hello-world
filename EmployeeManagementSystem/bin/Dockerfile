FROM openjdk:latest
ADD target/docker-spring-boot.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
FROM openjdk:17-jdk-alpine
COPY target/ms-gateway*.jar ms-gateway.jar
ENTRYPOINT ["java", "-jar", "/ms-gateway.jar"]
EXPOSE 7777

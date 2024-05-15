FROM openjdk:17-jdk-alpine
COPY target/ms-registry*.jar ms-registry.jar
ENTRYPOINT ["java", "-jar", "/ms-registry.jar"]
EXPOSE 8888

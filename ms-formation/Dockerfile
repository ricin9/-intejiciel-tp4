FROM openjdk:17-jdk-alpine
COPY target/ms-formation*.jar ms-formation.jar
ENTRYPOINT ["java", "-jar", "/ms-formation.jar"]
EXPOSE 8090

FROM openjdk:17-jdk-slim
MAINTAINER gideon.com
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
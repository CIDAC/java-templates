# This Dockerfile is very simple, but that’s all you need to run a Spring Boot app 
# with no frills: just Java and a JAR file. The project JAR file is ADDed to the
# container as "app.jar" and then executed in the ENTRYPOINT.

FROM openjdk:latest

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
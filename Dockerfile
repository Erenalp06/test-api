FROM maven:3.6.3-jdk-11-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean install


FROM openjdk:19
WORKDIR /app
EXPOSE 8085
ADD target/test-api.jar test-api.jar
ENTRYPOINT ["java", "-jar", "/app/test-api.jar"]
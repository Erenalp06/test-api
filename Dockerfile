FROM openjdk:19
WORKDIR /app
EXPOSE 8085
ADD target/test-api.0.jar test-api.jar
ENTRYPOINT ["java", "-jar", "/app/test-api.jar"]
FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the jar file from artifacts folder into the container
COPY target/webdemo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

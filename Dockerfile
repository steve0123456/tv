FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the jar file from artifacts folder into the container
COPY out/artifacts/webdemo_jar/webdemo.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

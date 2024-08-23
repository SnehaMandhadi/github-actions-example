FROM eclipse-termurin:17-jdk-alphine
WORKDIR /app
COPY target/gitthub-cicd-actions-0.0.1-SNAPSHOT.jar gitthub-cicd-actions-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar","gitthub-cicd-actions-0.0.1-SNAPSHOT.jar"]
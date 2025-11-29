#just add the below lines to make Docker image or instructions to make docker image
FROM eclipse-temurin:17-jdk AS build

WORKDIR /app

COPY target/ci-cd-demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

#After mvn clean package this gives the target/ci-cd-demo-0.0.1-SNAPSHOT.jar this jar file with is the runnable and main thing
#After mvn build ,Run this command -- docker build -t cicd-demo:latest . --- to build docker image and check it using docker images you will find your image
#Like this --- cicd-demo:latest                                  6fe32b2621c4        441MB             0B
#To run this into Container means a running app use this --- docker run -p 8080:8080 cicd-demo:latest
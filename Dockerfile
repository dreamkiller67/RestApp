FROM openjdk:17-jdk-alpine
ADD ./target/restapp-0.0.1-SNAPSHOT.jar restapp-0.0.1-SNAPSHOT.jar
EXPOSE 8282
ENTRYPOINT ["java","-jar","/restapp-0.0.1-SNAPSHOT.jar"]

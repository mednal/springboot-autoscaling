FROM openjdk:8

EXPOSE 8080

ADD target/springrabbit-0.0.1-SNAPSHOT.jar springrabbit-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","springrabbit-0.0.1-SNAPSHOT.jar"]

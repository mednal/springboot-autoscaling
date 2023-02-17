FROM openjdk:8

WORKDIR /app

COPY pom.xml .


EXPOSE 8080



ADD target/springrabbit.jar springrabbit.jar

ENTRYPOINT ["java","-jar","springrabbit.jar"]

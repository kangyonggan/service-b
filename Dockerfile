FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/service-b.jar
COPY ${JAR_FILE} service-b.jar
ENTRYPOINT ["java","-jar","/service-b.jar"]
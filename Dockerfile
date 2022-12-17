# Build stage
# FROM maven:3.6.3-jdk-8-slim AS build
FROM maven:3.6.3-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean test package

# Package stage
# FROM openjdk:8-jdk-alpine
# FROM openjdk:11-jre-slim-buster
FROM eclipse-temurin:11
COPY --from=build /home/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
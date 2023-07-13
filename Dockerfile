FROM maven:3.9.2-eclipse-temurin-20-alpine AS builder
WORKDIR /app
COPY . /app
RUN mvn clean
RUN mvn install -DskipTests
RUN ls -la target/

FROM openjdk:18-jdk
WORKDIR /app
EXPOSE 8081
COPY --from=builder /app/target/demoapp-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "demoapp-0.0.1-SNAPSHOT.jar"]

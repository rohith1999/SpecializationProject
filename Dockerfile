FROM maven:3.8.2-jdk-8

WORKDIR /specialization-project-app
COPY . .
RUN mvn clean install -DskipTests

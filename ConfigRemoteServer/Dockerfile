FROM openjdk:17-jdk-alpine
EXPOSE 8080
ENV GITHUB_REPO=https://github.com/Samnang-An/ConfigurationServer.git
ENV GITHUB_SUBFOLDER=Configurations
RUN apk add --no-cache maven
WORKDIR /configserver
COPY ./ ./
RUN mvn package
CMD ["java", "-jar","/eureka/target/Euraka-0.0.1-SNAPSHOT.jar"]
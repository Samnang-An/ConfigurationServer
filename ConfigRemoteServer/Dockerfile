FROM openjdk:17-jdk-alpine
EXPOSE 9000
ENV GITHUB_REPO=https://github.com/Samnang-An/ConfigurationServer.git
ENV GITHUB_SUBFOLDER=Configurations
RUN apk add --no-cache maven
WORKDIR /config-remote-server
COPY ./ ./
RUN mvn package
CMD ["java", "-jar","/config-remote-server/target/ConfigRemoteServer-0.0.1-SNAPSHOT.jar"]

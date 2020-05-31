FROM openjdk:14.0.1-slim
ADD library/* dockerswarm-latest.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/dockerswarm-latest.jar"]
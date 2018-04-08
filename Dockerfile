FROM openjdk:8-jre
MAINTAINER Nidhi Tapadia <nidhi.tapadia@gmail.com>

ARG JAR_FILE
ADD target/${JAR_FILE} /home/spring-playground/app.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "/home/spring-playground/app.jar"]

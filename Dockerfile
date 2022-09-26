#FROM alpine:latest
#COPY build/libs/beading-service-0.0.1-SNAPSHOT.jar beading-service-0.0.1-SNAPSHOT.jar
#ENV PATH=${PATH}:/c/Program Files/Java/jdk-11.0.16/bin
FROM openjdk:17
COPY build/libs/ /tmp
WORKDIR /tmp
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "beading-service-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["/c/Program Files/Java/jdk-11.0.16/bin/java","-jar","/beading-service-0.0.1-SNAPSHOT.jar"]
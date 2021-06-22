FROM openjdk:11
ADD target/naming-server.jar naming-server.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","/naming-server.jar"]
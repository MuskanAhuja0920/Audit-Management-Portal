FROM openjdk:11
ADD target/audit-severity.jar audit-severity.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","/audit-severity.jar"]
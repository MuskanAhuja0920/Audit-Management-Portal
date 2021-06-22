FROM openjdk:11
ADD target/audit-benchmark.jar audit-benchmark.jar
EXPOSE 8008
ENTRYPOINT ["java","-jar","/audit-benchmark.jar"]
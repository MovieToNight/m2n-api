FROM openjdk:11
ADD build/libs/m2n-api-1.0.jar  m2n-api-1.0.jar
EXPOSE 8085

ENTRYPOINT ["java", "-jar", "m2n-api-1.0.jar"]

#JAR
FROM openjdk:8
WORKDIR /
ADD target/bootcamp-avengers-discount.jar bootcamp-avengers-discount.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "bootcamp-avengers-discount.jar"]
FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

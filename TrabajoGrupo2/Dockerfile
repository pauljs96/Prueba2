FROM openjdk:17
#VOLUME /tmp
#EXPOSE 8080
COPY target/TrabajoGrupo2-0.0.1-SNAPSHOT.jar app.jar
ADD ${JAR_FILE} TrabajoGrupo2.jar

ENTRYPOINT ["java","-jar","/app.jar"]



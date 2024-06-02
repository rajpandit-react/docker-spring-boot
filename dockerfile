FROM openjdk:17
WORKDIR /opt
ENV PORT 8412
EXPOSE 8412
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
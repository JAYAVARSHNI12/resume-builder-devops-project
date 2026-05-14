FROM openjdk:21

WORKDIR /app

COPY target/ResumeBuilder.jar app.jar

EXPOSE 2006

CMD ["java", "-jar", "app.jar"]

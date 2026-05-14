FROM eclipse-temurin:17

WORKDIR /app

COPY target/ResumeBuilder-1.0.jar app.jar

EXPOSE 2007

ENTRYPOINT ["java","-jar","app.jar"]

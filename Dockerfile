FROM eclipse-temurin:21

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 2024

ENTRYPOINT ["java","-jar","app.jar"]

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# The asterisk (*) ensures it grabs whatever fresh JAR was just generated
COPY target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

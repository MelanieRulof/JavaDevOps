FROM maven:latest

WORKDIR /app

COPY /pom.xml .
COPY src/ ./src 



RUN mvn install

# copier fichier target/...  dans app.jar
RUN cp target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]




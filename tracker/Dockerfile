FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:8-jdk AS runtime
WORKDIR /tracker
EXPOSE 8080
COPY --from=build /tracker/target/tracker-0.0.1-SNAPSHOT.jar /tracker/tracker-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "tracker-0.0.1-SNAPSHOT.jar"]

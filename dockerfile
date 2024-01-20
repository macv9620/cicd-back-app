
FROM gradle:7.4-alpine AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test

FROM eclipse-temurin:17.0.9_9-jre
EXPOSE 5000
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/forest-app-spring-boot.jar
ENTRYPOINT ["java", "-jar","/app/forest-app-spring-boot.jar"]


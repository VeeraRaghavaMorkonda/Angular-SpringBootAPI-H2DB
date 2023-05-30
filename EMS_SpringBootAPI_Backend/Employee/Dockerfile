FROM openjdk:17-alpine
COPY ./build/libs/Employee-0.0.1-SNAPSHOT.jar /usr/local/app/Employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/usr/local/app/Employee-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080

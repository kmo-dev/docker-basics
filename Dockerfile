FROM openjdk:16
ARG JAR_FILE=target/basics.jar

COPY ${JAR_FILE} basics.jar

EXPOSE 80

ENTRYPOINT ["java","-jar","basics.jar"]
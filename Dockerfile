FROM openjdk:8-jdk-alpine
LABEL AUTHOR="Hiten Pratap Singh <hiten@techcret.com>"
RUN apk update && apk add bash
VOLUME /tmp
EXPOSE 7310
ARG JAR_FILE=build/libs/todo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} todo.jar
ENTRYPOINT [ "java","-jar","/todo.jar" ]
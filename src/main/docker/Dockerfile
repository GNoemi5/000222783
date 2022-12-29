FROM gcr.io/distroless/java:11
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} api-svc01.jar
CMD ["api-svc01.jar"]
EXPOSE 9080
ENTRYPOINT ["java","-Duser.timezone=America/Lima","-jar","api-svc01.jar"]
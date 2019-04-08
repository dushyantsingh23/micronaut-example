FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/with-maven*.jar with-maven.jar
CMD java ${JAVA_OPTS} -jar with-maven.jar
FROM openjdk:8-jdk-alpine

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY . /usr/src/app
RUN mvn install

CMD ["java","-jar","target/rest-assured-test-0.0.1-SNAPSHOT.jar"]

FROM anapsix/alpine-java:8u202b08_jdk

MAINTAINER bhandari

RUN mkdir -p /opt/app

COPY build/libs/metalservice-1.0.jar /opt/app/app.jar

EXPOSE 8080

WORKDIR /opt/app

CMD ["java","-jar","app.jar"]


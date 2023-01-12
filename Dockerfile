
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:18-alpine-jdk

MAINTAINER lfb

COPY target/lfb-0.0.1-SNAPSHOT.jar lfb-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/lfb-0.0.1-SNAPSHOT.jar"]
FROM openjdk:8-jre-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS

# add directly the war
ADD switch.jar /switch/switch.jar
ADD application.yml /switch/application.yml

EXPOSE 8080
CMD java -Dspring.config.location=/switch/ -Djava.security.egd=file:/dev/./urandom -jar /switch/switch.jar

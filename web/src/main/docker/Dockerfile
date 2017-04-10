FROM openjdk:8-jre-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS

# add directly the war
ADD ethereum.jar /ethereum/ethereum.jar
ADD application.yml /ethereum/application.yml

EXPOSE 8080
CMD java -Dspring.config.location=/ethereum/ -Djava.security.egd=file:/dev/./urandom -jar /ethereum/ethereum.jar

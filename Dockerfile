FROM openjdk:11

# folder creation
RUN mkdir -p /pis-bank-connector

# binary and conf copy paste
COPY pis-bank-connector-rest.jar /pis-bank-connector
COPY logback.xml /pis-bank-connector

# env to override at container call
ENV INTERNAL_PORT TO_BE_CHANGED
ENV AXON_SERVER_URI TO_BE_CHANGED
# example: command,query,local (change local to qa,preprod,prod)
ENV SPRING_PROFILES_ACTIVE TO_BE_CHANGED
ENV AXON_SSL_ENABLE TO_BE_CHANGED
# java opts
ENV JAVA_OPTS TO_BE_CHANGED

ENTRYPOINT ["java","-jar","/pis-bank-connector/pis-bank-connector-rest.jar"]

FROM openjdk:11

# folder creation
RUN mkdir -p /conf

# binary and conf copy paste
COPY conf.jar /conf
COPY conf.properties /conf

# env to override at container call
ENV CONF_FILE_PATH /conf/conf.properties

EXPOSE 11111

ENTRYPOINT ["java","-jar","/conf/conf.jar"]

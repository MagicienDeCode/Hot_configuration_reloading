# Reloadable properties with docker container
Kotlin Gradle SpringBoot Docker

## Build project
```shell
gradle clean build
```

## Builder docker image
```shell
cp build/libs/conf.jar Docker
docker build -t conf .
```

## Launch docker image
```shell
docker run --rm -it -d -p 11111:11111 conf
```

## Call endpoint check value
```shell
curl localhost:11111/test
```

## Copy your local file to running docker container
- first, change the upload value in conf.properties
- curl localhost:11111/test, if true, change it to false.
```shell
docker container ls
docker cp <src-path> <container>:<dest-path> 
dk cp /home/xiang/private_Xiang/conf.properties 2a29a9bc0a42:/conf/
```
- curl localhost:11111/test, normally it should be false.

FROM java:openjdk-8-jdk-alpine
ADD *.jar spring-boot.jar
RUN echo "Asia/Chongqing" > /etc/timezone
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot.jar"]
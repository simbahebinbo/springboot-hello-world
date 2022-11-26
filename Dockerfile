FROM khipu/openjdk17-alpine
MAINTAINER lansheng228@gmail.com
ADD ./target/springboot-hello-world-1.0.0.jar /opt/
RUN chmod 777 /opt/springboot-hello-world-1.0.0.jar
CMD ["java","-jar","/opt/springboot-hello-world-1.0.0.jar"]

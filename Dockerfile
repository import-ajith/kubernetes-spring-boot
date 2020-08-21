FROM openjdk:8
ADD target/kubernetes-spring-boot.jar kubernetes-spring-boot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","kubernetes-spring-boot.jar"]


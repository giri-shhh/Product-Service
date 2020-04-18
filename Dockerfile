FROM openjdk:8-jre-alpine
WORKDIR /app
COPY target/product-service-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "product-service-0.0.1-SNAPSHOT.jar"]
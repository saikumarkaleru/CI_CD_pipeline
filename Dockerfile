FROM openjdk:8
WORKDIR '/app'
ADD target/ecommerce.jar ecommerce.jar
EXPOSE 8086
COPY . .
ENTRYPOINT ["java", "-jar", "ecommerce.jar"]
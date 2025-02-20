# Sử dụng OpenJDK 21
FROM openjdk:21-jdk-slim

# Đặt thư mục làm việc trong container
WORKDIR /app

# Copy file JAR từ target/
COPY target/ConfigService-3.4.2.jar app.jar
# Copy file .env vào container
COPY .env /app/.env

# Chạy ứng dụng với biến môi trường từ `.env`
CMD ["sh", "-c", "java -jar app.jar"]

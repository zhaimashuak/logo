# Используем базовый образ
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем JAR файл
COPY target/myapp.jar /app/myapp.jar

# Устанавливаем команду запуска
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]

# Указываем порт, на котором работает приложение
EXPOSE 8080

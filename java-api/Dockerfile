# Usa a imagem oficial do OpenJDK 17
FROM eclipse-temurin:17-jdk-jammy

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR para o container
COPY target/java-api-*.jar app.jar

# Expõe a porta que sua aplicação Spring Boot usa
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
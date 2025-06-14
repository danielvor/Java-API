# Estágio de construção
FROM eclipse-temurin:17-jdk-jammy AS builder

WORKDIR /app

# 1. Primeiro copia apenas os arquivos necessários para o build
COPY pom.xml .
COPY src ./src
COPY mvnw ./
COPY .mvn/ ./.mvn/

# 2. Dá permissão e executa o build
RUN chmod +x mvnw && \
    ./mvnw clean package -DskipTests

# Estágio de execução
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
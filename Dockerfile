FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

# 依存関係を先に落としてキャッシュ効かせる
COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY . .

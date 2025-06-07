FROM eclipse-temurin:17-jdk-jammy

# Variáveis de ambiente
ENV SPRING_PROFILES_ACTIVE=prod \
    DB_URL=jdbc:mysql://mysql-container:3306/appdb \
    DB_USERNAME=root \
    DB_PASSWORD=rootpassword

# Criar um usuário não-root
RUN useradd -ms /bin/bash chocha

# Definir diretório de trabalho
WORKDIR /home/chocha/app

COPY target/money-control-api-0.0.1-SNAPSHOT.jar money-control-api-0.0.1-SNAPSHOT.jar

RUN chown -R chocha:chocha /home/chocha/app

USER chocha

# Expor uma porta da app
EXPOSE 8080

CMD ["java", "-jar", "money-control-api-0.0.1-SNAPSHOT.jar"]

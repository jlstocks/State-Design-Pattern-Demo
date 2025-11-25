FROM eclipse-temurin:21-jdk

RUN mkdir /app

COPY . /app

WORKDIR /app/src

RUN javac $(find . -name "*.java")

CMD ["java", "Client"]
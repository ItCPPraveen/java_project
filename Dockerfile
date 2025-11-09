# Use OpenJDK 17 (compatible with your pom.xml)
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy built jar file into container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar (Render provides PORT env variable)
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=${PORT:-8080}"]

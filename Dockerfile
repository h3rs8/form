# Use the official OpenJDK base image with Alpine Linux
FROM maven:3.8.5-openjdk-17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo.jar /app/app.jar

# Expose the port that your Spring Boot application runs on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "demo.jar"]

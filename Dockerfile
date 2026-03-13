FROM maven:3.9.10-amazoncorretto-24-alpine


# Copy project files and set working directory (similar to the previous example)
COPY src /Advanced-Automation-Framework-Enterprise-Level/RestApiAutomationFramework/src
COPY pom.xml /Advanced-Automation-Framework-Enterprise-Level/RestApiAutomationFramework/pom.xml
WORKDIR /Advanced-Automation-Framework-Enterprise-Level/RestApiAutomationFramework

# Run Maven clean and test commands
ENTRYPOINT mvn clean test

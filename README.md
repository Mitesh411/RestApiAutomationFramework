# Rest API Automation Framework

This is a Rest API automation test framework built using Java. It provides a simple way to write and run API test cases.

## Folder Structure

- `src/test/java/tests` - Contains all the test cases 
- `src/test/java/utils` - Contains utility classes like BaseTest
- `src/main/java` - Contains main application code
- `target` - Contains generated reports and build artifacts


## Key Features

- Makes HTTP requests to test REST APIs
- Supports GET, POST, PUT, DELETE requests
- Easy configuration using JSON files
- Assertions for status code, headers, body
- Generates HTML test reports
- Parallel test execution
- Extensible framework to add custom code

## Getting Started

### Prerequisites

- Java 17
- Maven

### Usage

- Clone the repository 
- Update `config.json` with the base URL for APIs to test
- Add API test cases under `src/test/java/tests` 
- Run `mvn test`

Maven will execute the test cases and generate a test report under `target/site/serenity` folder.

## Write Test Cases

- Extend `BaseTest` class to create a test class
- Annotate test methods with `@Test`
- Use `sendRequest()` methods to make API calls
- Use assertions to validate response


@Test
public void testCreateUser() {

  JSONObject request = new JSONObject();
  request.put("name", "John");
  
  Response response = sendRequest("POST", "/users", request.toString());
  
  assertEquals(201, response.statusCode);
  
  JSONObject body = new JSONObject(response.body);
  assertEquals("John", body.get("name"));
  
}


## Documentation

- [Serenity BDD](https://serenity-bdd.github.io/theserenitybook/latest/index.html) - Open source library used in the framework

## Contributions

Contributions are welcome! Please create a pull request to contribute to the project.



# Spring Boot JSON Manipulation API

## Approach

The objective of this assignment is to develop a Spring Boot application that manipulates a JSON model based on user-provided inputs, returns the modified JSON model, and saves it to a database. The approach involves:

1. Setting up a Spring Boot application with necessary dependencies.
2. Defining a predefined JSON model.
3. Creating a REST API endpoint to accept dynamic inputs and perform string manipulations.
4. Saving the modified JSON model to a database.
5. Testing the application to ensure correctness.

## Code Implementation

### 1. Set Up Spring Boot Application

Create a new Spring Boot project using Spring Initializr with the following dependencies:

- Spring Web
- Spring Data JPA
- MySQL Database

  ### 2. Define JSON Model

The JSON model is predefined in the code. It will be manipulated based on user inputs.

### 3. Implement the REST API Endpoint

The REST API endpoint takes dynamic inputs, parses them, performs string manipulations on the JSON model, and returns the modified JSON model. The modified JSON model is also saved to the database.

#### Project Structure:

src
└── main
    ├── java
    │   └── com
    │       └── test
    │           └── stringManipulation
    │               ├── StringManipulationApplication.java
    │               ├── controller
    │               │   └── JsonController.java
    │               ├── model
    │               │   └── JsonModel.java
    │               └── repository
    │                   └── JsonModelRepository.java
    └── resources
        ├── application.properties
        └── data.sql


### 4. Testing Strategy

Testing involves verifying that the string manipulation works correctly and that the modified JSON model is saved to the database.

#### Testing Steps:

##### Unit Testing:

Write unit tests to test the parseInputs and replaceValuesInJson methods.

##### Integration Testing:

- Use tools like Postman or curl to send HTTP POST requests to the /api/json/manipulate endpoint with various input strings.
- Verify that the response contains the correctly modified JSON model.
- Check the MySQL database  to ensure the modified JSON model is saved.

  

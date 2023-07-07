**Exercise: Alien Greeting Controller**

In this exercise, students will create a RESTful API for an Alien who wants to greet Earthlings and tell them about himself.

1. **Setup a new Spring Boot Project**: Create a new Spring Boot Project and name it `aliengreeting`. make sure to include the necessary dependencies.

2. **Create an Alien Class**: In the `com.example.aliengreeting` package, create an `Alien` class. An Alien should have `name` (String), `species` (String), and `planetOrigin` (String).

3. **Create the AlienGreetingController Class**: This class should have the following functionalities:
    - It should have a default Alien. You can use the constructor for this.

    - **GET /alien**: This should return the information about the Alien (name, species, and planetOrigin). For now, you can hardcode the information of the Alien in the GET method.

    - **POST /alien/greet**: This should make the Alien greet the Earthling by name. The Earthling's name should be provided in the request body.

    - **GET /alien/greet/{name}**: This should return a greeting from the Alien to a specified Earthling using path variable.

    - **GET /alien/greet?name=XXX**: This should return a greeting from the Alien to a specified Earthling using request param.

Here's the flow of how it would work:

- When the `GET /alien` endpoint is hit, it would return the hardcoded details of the Alien.
- The `POST /alien/greet` endpoint will take the Earthling's name in the request body and return a greeting from the Alien.
- The `GET /alien/greet/{name}` and `GET /alien/greet?name=XXX` endpoints will return a greeting from the Alien to a specified Earthling.

This way, they are still implementing and using the different HTTP methods, path variables, request parameters, and request body, but in a simpler and more manageable context.

They can test this by running the Spring Boot application and using curl commands or a tool like Postman to send requests to these endpoints.

**Bonus:**
- A `PUT /alien` endpoint that will update the details of the Alien, taking the new details in the request body.

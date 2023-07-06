**Bonus Exercise 1: Implement User Authentication and Authorization**

Implement a `User` entity and provide registration and login endpoints. Ensure that only authenticated users can create, update or delete Planets and Books. For an added challenge, implement role-based authorization where only 'admin' users can create, update or delete entities, while 'user' role can only view the entities.

**Bonus Exercise 2: Implement HATEOAS**

Implement Hypermedia as the Engine of Application State (HATEOAS) in your REST API. HATEOAS is a constraint of the REST application architecture where the server's response to a client call includes not only the information about the state of the resource but also the actions the client or server may perform. This is represented in hyperlinks to other resources.

**Bonus Exercise 3: Enhance Your API with Custom Metrics**

Add Spring Actuator to your application and create custom metrics. These metrics could track how many times books or planets are accessed, created, updated, or deleted. This can be very useful for understanding how your API is being used.

**Bonus Exercise 4: Add Swagger Documentation**

Include Swagger in your project for API documentation. Swagger provides a user interface to call your API endpoints, making it a great tool for testing and documenting your REST API.

**Bonus Exercise 5: Dockerize Your Application**

Learn about Docker and create a Dockerfile for your application. This will allow anyone to run your application on any platform that has Docker installed, without worrying about setting up the correct environment or dependencies.


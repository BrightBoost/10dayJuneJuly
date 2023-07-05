**Exercise: Building a Simple REST API for an Intergalactic Library with Spring Boot**

In this exercise, you will be creating a simple REST API for an intergalactic library. This will involve developing the following:

**Step 1: Set up your Spring Boot Application**

Initialize a new Spring Boot project using start.spring.io or your preferred IDE. Make sure to add the Spring Web and Spring Data JPA dependencies. If you're feeling ambitious, also add a SQL database like PostgreSQL.

**Step 2: Create a Planet Entity**

Create a `Planet` class that represents a planet in the galaxy. It should have the following fields: `id`, `name`, and `galaxy`.

**Step 3: Create a Book Entity**

Create a `Book` class that represents an alien book in the library. It should have the following fields: `id`, `title`, `alienAuthor`, `isbn`, and `planet` (the planet where the book was written). 

**Step 4: Create a Planet and Book Controller**

Create `PlanetController` and `BookController` classes. These classes will handle HTTP requests related to planets and books.

**Step 5: Create a Planet and Book Service and Repository**

Create `PlanetService`, `BookService`, `PlanetRepository`, and `BookRepository`.

**Step 6: Add Planet and Book Endpoints**

Within `PlanetController` and `BookController`, define the following endpoints:

- **Planet Endpoints**
    - **GET /planets**: This should return a list of all planets.
    - **GET /planets/{id}**: This should return the planet with the given id.
    - **POST /planets**: This should add a new planet.
    - **PUT /planets/{id}**: This should update the planet with the given id.
    - **DELETE /planets/{id}**: This should delete the planet with the given id.

- **Book Endpoints**
    - **GET /books**: This should return a list of all books.
    - **GET /books/{id}**: This should return the book with the given id.
    - **POST /books**: This should add a new book.
    - **PUT /books/{id}**: This should update the book with the given id.
    - **DELETE /books/{id}**: This should delete the book with the given id.

**Bonus Challenges:**
0. Make sure to create a One-to-Many relationship between `Planet` and `Book`.
1. Add a new endpoint `GET /planets/{id}/books` to get a list of all books written on a given planet.
2. Implement pagination for the `GET /books` and `GET /planets` endpoints to return only a subset of records at a time.
3. Use `@ControllerAdvice` and `@ExceptionHandler` to handle exceptions and return proper HTTP status codes and error messages when things go wrong.

Remember, you can use an in-memory database, but for an added challenge, consider setting up a real database.

Once you've finished, test your endpoints with a tool like Postman or curl.
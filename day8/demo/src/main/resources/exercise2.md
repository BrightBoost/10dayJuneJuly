**Exercise: Interstellar Travel Agency**

In this exercise, we will create a RESTful API for an Interstellar Travel Agency that manages a single Starship.

1. **Setup a new Spring Boot Project**: Create a new Spring Boot Project and name it `interstellarTravelAgency`.

2. **Create a Starship Class**: In the `com.example.interstellarTravelAgency` package, create a `Starship` class. A starship should have `name` (String), `crewSize` (int), `planetOrigin` (String), and `currentPlanet` (String).

3. **Create the InterstellarTravelController Class**: This class should have the following functionalities:

    - **GET /starship**: This should return the details of the Starship. For now, you can hardcode the details of the Starship in the GET method.

    - **POST /starship/land**: This endpoint should make the Starship land on a new planet. The new planet should be provided in the request body. Update the `currentPlanet` field of the Starship and return a message "Successfully landed on [planetName]".

    - **PUT /starship**: This should update the details of the Starship. The new details should be provided in the request body.

    - **GET /starship/travel/{planetName}**: This endpoint should simulate the Starship traveling to a new planet. Update the `currentPlanet` field of the Starship and return a message "Travelling to [planetName]".

    - **GET /starship/searchcrew/{crewSize}**: This endpoint should return a message depending on the crew size. If the crew size is less than the provided value, return "Need more crew!". If the crew size is equal to the provided value, return "Crew is full". If the crew size is more, return "There's enough crew!".

    - **POST /starship/embark**: This endpoint should add crew members to the Starship. The number of crew members to be added should be provided in the request body. Update the `crewSize` field of the Starship and return a message "Crew members embarked successfully. Current crew size is [crewSize]".

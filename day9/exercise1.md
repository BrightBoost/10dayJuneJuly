
1. **Write a Simple JUnit Test for a Method that Adds Two Numbers and Returns the Result:**

Create an Addition class with an add method that accepts two integers and returns their sum. 
Create a test class AdditionTest and import the necessary JUnit annotations and classes. 
Add a test method testAdd with the @Test annotation and check whether the add method works correctly for different input values.

2. **Create a Simple Class with a Dependency (e.g. a Database Connection) and Use Dependency Injection to Inject and Test this Dependency:**

Create an interface called DatabaseConnection with a connect method.
Create an implementation class called DatabaseConnectionImpl that implements the connect method.
Create a new class called DataService with a constructor that accepts a DatabaseConnection object and stores it as an instance variable.
Use a dependency injection framework such as CDI to inject the DatabaseConnectionImpl into the DataService class.
Write a test class DataServiceTest that tests the DataService class using the injected DatabaseConnection dependency.

3. **Write a JUnit Test that Expects an Exception and Verify the Exception is Thrown:**

Add a divide method to the Addition class that accepts two numbers and returns their quotient.
Make the divide method throw an ArithmeticException if the divisor is zero.
In the AdditionTest test class, add a test method testDivideByZero with the @Test annotation and the expected = ArithmeticException.class attribute to check if the exception is thrown when dividing by zero.

4. **Use the @BeforeEach and @AfterEach Annotations in a JUnit Test to Do a Test Setup and Cleanup:**

In the AdditionTest test class, create two methods setUp and tearDown.
Annotate the setUp method with @BeforeEach and initialize the Addition instance for each test.
Annotate the tearDown method with @AfterEach and set the Addition instance to null after each test.

5. **Write a Test for a Method that Returns a List of Objects and Use the assertThat Method with Matchers to Verify the Expected Results:**

Add a getNumbers method to the Addition class that returns a list of integers.
In the AdditionTest test class, add a test method testGetNumbers with the @Test annotation.
Use the assertThat method in combination with Matchers (for example contains or equalTo) to check whether the returned list of numbers matches the expected list.


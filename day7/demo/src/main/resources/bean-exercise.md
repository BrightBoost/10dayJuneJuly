# Lunchtime Soup

Create a Spring Boot application (no dependencies needed) and we're going to alter it to create bean soup.

To do:
- Create three different classes and make them beans, for example GreenBean or Tomato
- Turn these classes into beans
- Give them a property description of what recipes they're good for
- Give them a name property
- In your main method prompt the user for what kind of soup they would like.
- Get the Bean that corresponds to the type of soup they chose from the application context
- Print the name and description of that Bean

Bonus:
- Can you give them a parent class SoupType?
- And create a class Soup that is a bean and depends on SoupType?
- Solve the ambiguity problem that might occur!
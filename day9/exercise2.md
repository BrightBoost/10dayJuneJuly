# BankAccount test
We will work with a simplified BankAccount class. The class will have methods to deposit, withdraw, get the current balance, and get a list of transaction history. Here's a step-by-step exercise:

**Step 1**: Create a BankAccount class.

This class should have properties for the account number, balance, and a list to hold transaction history. It should have methods for deposit, withdrawal, getting the current balance, and getting the transaction history.

```java
public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactions;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        transactions.add("Withdrew: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
}
```

**Step 2**: Create a BankAccountTest class.

This class will contain all the test cases for the BankAccount class. Don't forget to import the necessary JUnit annotations and classes.
 
**Step 3**: Write a test for the deposit method.

Use the `@Test` annotation to define this deposit method as a test method. Deposit a certain amount to the account and assert that the balance is as expected.

**Step 4**: Write a test for the withdraw method that expects an exception.

Make a withdrawal that is greater than the current balance. This should throw an IllegalArgumentException. Use `assertThrows` to check if the exception is thrown.
 
**Step 5**: Use the `@BeforeEach` and `@AfterEach` annotations to initialize and clean up the BankAccount object.

**Step 6**: Write a test for the getTransactions method using assertThat and Matchers.

After making a few deposits and withdrawals, assert that the transactions list contains the correct transactions.

**Step 7**: Run your tests.

At this point, you should be able to run your tests. Each test should pass if everything has been set up correctly. 

**Step 8**: Continue creating additional test methods as necessary.

Remember to think about edge cases and potential exceptions. The more robust your tests, the more reliable your code will be.

Here are the imports for the parameterized and repeated tests:

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.RepeatedTest;
```

For the assertions and matchers:

```java
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
```


## Bonus


**Step 1**: Write a parameterized test for the deposit method.

Test the deposit method with various input amounts and verify that the balance increases accordingly.

**Step 2**: Write a repeated test for the withdraw method.

Repeatedly test the withdraw method. This is just an example, as in real-world tests, repeated tests are used in scenarios where tests may fail intermittently, or in performance testing.
 
Please note that when doing repeated tests, you need to consider that tests are not isolated from each other, so you might need to adjust your `@BeforeEach` or `@AfterEach` setup.
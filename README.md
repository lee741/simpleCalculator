# simpleCalculator
A walkthrough of utilizing Test Driven Development for a simple calculator is illustrated through this project. Specifically, test cases for an add and multiply method are done. 

Test-Driven Development (TDD) is a software development methodology that emphasizes writing tests before writing the actual code. It follows a simple cycle: Red-Green-Refactor.

In this walkthrough, we’ll build a simple calculator using TDD principles. Let's assume that we are building a basic calculator that performs addition and multiplication.

Step 1: Write a Test
The first step in TDD is writing a test for a function we intend to implement. In this case, we will start by writing tests for an addition method.

Step 2: Run the Test (Expect it to Fail)
At this point, the Calculator class doesn’t exist, so running the test will fail. You should see an error message saying NameError: name 'Calculator' is not defined.

Step 3: Write Code to Pass the Test
Now, we will create the Calculator class and implement the add method.

Step 4: Run the Tests Again (Expect it to Pass)
After implementing the add method, we can run the tests again.

Step 5: Refactor
Now that the test is passing, we can look at our code and see if there is anything to improve. In this case, the code is simple and doesn’t require refactoring. But in a larger project, you might clean up redundant code, optimize the implementation, or improve readability.

Let’s repeat the above steps on the next operation: multiplication and run all tests.
Add Method
![Add Method](https://github.com/lee741/simpleCalculator/blob/main/Add%20Method.png)

Multiply Method
![Multiply Method](https://github.com/lee741/simpleCalculator/blob/main/Multiply%20Method.png)

Test Cases
![Test Cases](https://github.com/lee741/simpleCalculator/blob/main/Test%20Cases.png)

Conclusion
Through TDD, we:

Started by writing a test for each calculator operation.
Implemented the functionality to make the tests pass.
Ran the tests after each change to ensure everything works as expected.
This cycle of Red-Green-Refactor helps us develop software that is both reliable and maintainable.

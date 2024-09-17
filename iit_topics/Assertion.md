An assertion in Java is a statement that tests an assumption about the program. It is primarily used for debugging purposes to ensure that certain conditions hold true during the execution of a program. If the condition evaluates to true, the program continues execution; if it evaluates to false, an AssertionError is thrown, indicating a failed assumption.

Assertions are generally used to catch logical errors that should never occur during normal execution. They can be turned on or off depending on how the program is executed (typically, they are turned off in production).

Syntax of Assertions in Java:

1)Simple Assertion:
   
   assert expression;
If the expression evaluates to false, an AssertionError is thrown

2)Assertion with Error Message:
   
   assert expression : message;
If the expression evaluates to false, an AssertionError is thrown with the provided message.

Why is it Used? What is the Purpose?

Assertions are used for debugging and testing. They are helpful in verifying that the program behaves as expected by checking the internal state and logic during development.

Purpose:
Ensure internal consistency and validate assumptions.
Debug potential bugs during development.
Reduce the likelihood of bugs making it into production.

In summary:

Catch Bugs Early: Assertions help identify bugs as soon as possible by checking for invalid states or incorrect assumptions.

Non-Intrusive Testing: Assertions are turned off in production, which means they don’t affect the performance of the final application, but they help catch bugs during development.

Self-Documenting Code: Assertions can serve as a form of documentation, showing other developers the assumptions and expected behavior of the program.

When Not to Use Assertions:

Do not use for user input validation: Assertions are not meant to handle invalid input from users, as they can be disabled at runtime. Use exceptions for such cases.

Do not rely on them in production: Assertions can be disabled, so critical checks should not be enforced using assertions.

Types of Assertions:

Precondition Assertions:
 
   These are used to check if the method or function is called with valid parameters or if the environment is set up correctly.

     Example:
       
       public int divide(int a, int b) {
    assert b != 0 : "The divisor should not be zero";
    return a / b;
    }

Postcondition Assertions:

  These check if the method produces the expected result after execution. They are used after a method call to ensure the output is correct or consistent.

  Example:

  public int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    assert max >= arr[0] : "Max should be greater than or equal to the first element";
    return max;
}


Enabling and Disabling Assertions

  By default, assertions are disabled in Java runtime. You can enable assertions using the -ea (or -enableassertions) flag when running the program:

  To enable assertions:

      java -ea MyProgram

  To disable assertions:

      java -da MyProgram
 
  To enable System assertion :

      -esa: Stands for "enable system assertions."

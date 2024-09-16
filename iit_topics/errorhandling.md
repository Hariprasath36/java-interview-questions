ERROR HANDLING 

Error handling refers to the process of managing and responding to errors that occur during the execution of a program. Its goal is to ensure that the program can deal with unexpected situations or problems in a graceful manner, rather than crashing or behaving unpredictably.

Key Concepts in Java Error Handling
Exceptions: An exception is an event that occurs during the execution of a program and disrupts its normal flow. Exceptions are represented by objects in Java, and they indicate that something unexpected has happened in the program.

Types of Exceptions:

Checked Exceptions: Must be caught or declared in the method signature using throws. These are checked at compile-time. Examples include:
IOException
SQLException
FileNotFoundException
ClassNotFoundException

Unchecked Exceptions: Also known as runtime exceptions, they are not checked at compile time and don’t need to be explicitly handled. Examples include:

NullPointerException
ArrayIndexOutOfBoundsException
ArithmeticException
IllegalArgumentException

Errors: These are serious problems that a program should not try to handle. Errors are external to the application and typically indicate issues like memory overflow or JVM failure. Examples include:
OutOfMemoryError
StackOverflowError

Exception Handling Mechanism: Java provides a robust mechanism to handle exceptions using the following keywords:

try: Used to define a block of code that may throw an exception.
catch: Used to handle the exception thrown by the try block.
finally: A block of code that will always execute, whether an exception is thrown or not, often used for cleanup (closing resources, etc.).
throw: Used to explicitly throw an exception.
throws: Used in a method signature to declare that a method may throw exceptions


In Java, exceptions can be categorized as explicit and implicit based on how they are generated in the program. The difference lies in whether the exception is manually triggered by the developer (explicit) or automatically thrown by the Java runtime environment (implicit).

1. Explicit Exception: (programmer create and throw an exception)
An explicit exception is one that is manually thrown by the programmer using the throw keyword.
The programmer deliberately decides when and where to throw an exception, often based on a specific condition or validation failure in the code.
Typically used for custom error handling or when certain conditions are not met, making it necessary to stop the normal flow of execution and handle the problem immediately.

public class Example {
    public static void main(String[] args) {
        int age = 15;
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Explicitly throwing an exception
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
        System.out.println("You are eligible.");
    }
}

Implicit Exception: (already in the code)
An implicit exception is one that is automatically thrown by the Java runtime environment when the program encounters an error at runtime.
These exceptions are not manually triggered by the developer but occur when the program violates certain runtime rules (e.g., division by zero, null reference, array index out of bounds).
These are typically unchecked exceptions (i.e., subclasses of RuntimeException) such as NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, etc.

public class Example {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int c = a / b; // This will throw an implicit ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught implicit exception: " + e.getMessage());
        }
    }
}

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


 the printStackTrace() 
 
 method is used to print a detailed stack trace of an exception to the standard error stream. This method helps in debugging by showing the sequence of method calls that led to the exception.

 Other Methods in Throwable

 getMessage()

Description: Returns a detailed message string describing the exception.

getLocalizedMessage()

Description: Returns a localized description of the exception. It may be overridden to provide a message formatted for the locale.

getCause()

Description: Returns the cause of the exception (if it was caused by another throwable).

getStackTrace()

Description: Returns an array of StackTraceElement objects representing the stack trace.

toString()

Description: Returns a string representation of the exception, including its class name and message.

Chained Exception
Chained exceptions in Java refer to the concept of associating one exception with another. This happens when an exception (the "cause") triggers another exception (the "wrapper"), creating a chain of exceptions that provide a more comprehensive context of what went wrong.

Using the initCause() method: This method allows you to set the cause of an exception after the exception is created

Using getCause(): This method allows you to retrieve the cause of an exception. 


Here is a list of some of the most commonly used classes in the java.lang package:

Core Classes:
Object – The root class of all class hierarchies.
Class – Represents the runtime class of an object.
System – Contains system-level utilities like input/output and environment variables.
Runtime – Allows the application to interact with the Java runtime environment.
Thread – Represents a thread of execution in a program.
ThreadGroup – Represents a group of threads.

Wrapper Classes for Primitive Data Types:
Boolean – Wraps a boolean value.
Byte – Wraps a byte value.
Short – Wraps a short value.
Integer – Wraps an int value.
Long – Wraps a long value.
Float – Wraps a float value.
Double – Wraps a double value.
Character – Wraps a char value.
Void – Represents the void return type.

String and Text Processing:
String – Represents a sequence of characters (immutable).
StringBuilder – A mutable sequence of characters (not thread-safe).
StringBuffer – A thread-safe mutable sequence of characters.

Math and Number Utilities:
Math – Provides methods for performing basic numeric operations.
StrictMath – Provides methods that are more strictly defined.
Number – The superclass of all numeric wrapper classes.
Comparable – Used for object comparison.

Exception and Error Handling:
Exception – The superclass for exceptions.
RuntimeException – The superclass for runtime exceptions.
Error – The superclass for serious errors.
Throwable – The superclass for all errors and exceptions.
ArithmeticException – Thrown when an exceptional arithmetic condition occurs, like division by zero.
ArrayIndexOutOfBoundsException – Thrown to indicate that an array has been accessed with an illegal index.
NullPointerException – Thrown when an application attempts to use null where an object is required.
IllegalArgumentException – Thrown to indicate that a method has been passed an illegal or inappropriate argument.
IndexOutOfBoundsException – Thrown to indicate that some type of index is out-of-bounds.
StringIndexOutOfBoundsException – Thrown when attempting to access an invalid index in a string.

Utility Classes:
Math – Provides methods for performing basic numeric operations.
Runtime – Provides methods for interacting with the Java runtime environment.
System – Provides system utilities like reading environment variables or dealing with standard I/O.
Process – Provides control over native operating system processes.
ProcessBuilder – Constructs processes.

Multithreading and Synchronization:
Thread – Represents a thread of execution.
Runnable – Represents a task that can be executed by a thread.
ThreadGroup – Represents a group of threads.
ExceptionInInitializerError – Signals an exception during static initialization.
InterruptedException – Signals that a thread has been interrupted.

Reflection:
Class – Represents a class at runtime.
ClassLoader – Loads classes into the JVM.
Enum – The base class for all Java enumerations.

Other:
AssertionError – Thrown when an assertion fails.
CloneNotSupportedException – Thrown to indicate that the clone() method has been called on an object that does not implement the Cloneable interface.
SecurityManager – Allows applications to implement a security policy.

Interfaces in java.lang:
Cloneable – Indicates that a class allows for cloning.
Comparable – Enables objects of implementing classes to be compared.
Runnable – Allows an object to be executed by a thread.
AutoCloseable – Specifies that a resource can be closed automatically.
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
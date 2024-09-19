In Java, a Stream is a powerful feature introduced in Java 8, as part of the java.util.stream package. It provides a modern and functional approach to process collections of data (such as lists, sets, or arrays) in a concise and declarative manner. Streams allow you to perform operations like filtering, mapping, and reducing without explicitly iterating over elements.

Key Characteristics of Streams:
No Storage: Streams do not store elements. Instead, they work on the underlying data source (such as a collection or an array).

Functional: Streams allow you to process data using functional programming patterns. You can use lambda expressions and method references to define transformations.

Lazy Evaluation: Intermediate operations (like filtering or mapping) are lazy. They are not executed until a terminal operation (like forEach or collect) is invoked.

Parallel Processing: Streams can be processed in parallel to improve performance, particularly for large datasets. This can be done by simply calling .parallelStream() instead of .stream().

Immutable: Streams do not modify the original data structure. They produce new results or collections without affecting the source.

Types of Stream Operations:
There are two types of stream operations:

Intermediate Operations: These return another stream and are lazy, meaning they don’t trigger processing. Examples:

map(): Transforms elements.
filter(): Filters elements based on a condition.
distinct(): Removes duplicates.
sorted(): Sorts the stream.
Terminal Operations: These trigger the processing of streams and produce a result (or a side effect like printing). Examples:

forEach(): Performs an action for each element.
collect(): Collects the elements into a collection or another structure.
count(): Returns the count of elements in the stream.
reduce(): Reduces the elements to a single result.

Stream Creation:
Streams can be created from various sources, such as collections, arrays, or even I/O channels

eg:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> numberStream = numbers.stream();


Benefits of Streams:
Declarative: The code is more readable and easier to maintain since you describe what should happen rather than how.
Efficient: Streams use lazy evaluation and optimize the processing pipeline.
Parallel Processing: Easily run tasks in parallel for faster performance.

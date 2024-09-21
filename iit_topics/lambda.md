What is a Lambda Expression?
A lambda expression is like a shortcut for writing small pieces of code that perform a specific task, without having to create a whole new class or method. It makes your code simpler and shorter.

You can think of it as a quick way to create a function that can be passed around in your program.

Why Do We Use Lambdas?

Before Java 8, whenever you wanted to create a simple function to pass as an argument or use somewhere, you had to write a lot of extra code. Lambdas make this much easier. They are mainly used with functional interfaces, which are interfaces that have just one method.

Basic Syntax of Lambda:

(parameters) -> { body of the function }


takeWhile is an intermediate stream operation that processes elements in the stream as long as the condition (n % 2 == 0) is true. It stops processing the stream as soon as an element does not satisfy the condition (i.e., it encounters an odd number).


+--------------------------------------+--------------------------------------------------------------------------+
|             Method Name              |                              Definition                                  |
+--------------------------------------+--------------------------------------------------------------------------+
|             Stream.of()              | Creates a stream from specified values or an array.                      |
|         Stream.generate()            | Creates an infinite stream from a supplier.                              |
|         Stream.iterate()             | Generates an infinite stream using a function and initial seed.          |
|            Stream.empty()            | Creates an empty stream.                                                 |
|           Arrays.stream()            | Creates a stream from an array.                                          |
+--------------------------------------+--------------------------------------------------------------------------+
|         filter(Predicate<T>)         | Filters elements based on a condition.                                   |
|          map(Function<T, R>)         | Transforms each element by applying a function.                          |
|      flatMap(Function<T, Stream<R>>) | Transforms each element into a stream and flattens them.                 |
|              distinct()              | Removes duplicate elements from the stream.                              |
|              sorted()                | Sorts the stream in natural order.                                       |
|    sorted(Comparator<T> comparator)  | Sorts the stream using a custom comparator.                              |
|         peek(Consumer<T>)            | Performs an action for each element (mainly for debugging).              |
|          limit(long maxSize)         | Limits the stream to a fixed number of elements.                         |
|            skip(long n)              | Skips the first `n` elements.                                            |
|     takeWhile(Predicate<T>)          | Takes elements from the stream while the condition is true (Java 9+).    |
|     dropWhile(Predicate<T>)          | Drops elements while the condition is true and processes the rest (Java 9+).|
+--------------------------------------+--------------------------------------------------------------------------+
|         forEach(Consumer<T>)         | Performs an action for each element in the stream.                       |
|    forEachOrdered(Consumer<T>)       | Performs an action for each element in encounter order.                  |
|              toArray()               | Converts the stream into an array.                                       |
|      reduce(BinaryOperator<T>)       | Combines elements using an associative accumulation function.            |
| reduce(T identity, BinaryOperator<T>)| Reduces elements using an initial identity and an accumulation function.  |
| collect(Collector<T, A, R>)          | Collects elements into a collection, list, set, map, or other structure. |
|      min(Comparator<T> comparator)   | Finds the minimum element based on a comparator.                         |
|      max(Comparator<T> comparator)   | Finds the maximum element based on a comparator.                         |
|             count()                  | Returns the number of elements in the stream.                            |
|    anyMatch(Predicate<T>)            | Returns `true` if any element matches the given predicate.               |
|    allMatch(Predicate<T>)            | Returns `true` if all elements match the predicate.                      |
|    noneMatch(Predicate<T>)           | Returns `true` if no elements match the predicate.                       |
|           findFirst()                | Returns the first element (if any) in the stream.                        |
|            findAny()                 | Returns any element (useful for parallel streams).                       |
+--------------------------------------+--------------------------------------------------------------------------+
|    Stream.concat(Stream<T>, Stream<T>)| Concatenates two streams.                                                |
|        Stream.builder()              | Builds a stream incrementally.                                           |
| Stream.iterate(seed, predicate, next)| Iterates with a condition, stopping when the condition is false (Java 9+).|
|        parallel()                    | Converts the stream to a parallel stream for concurrent processing.      |
|        sequential()                  | Converts the stream back to sequential.                                  |
|      onClose(Runnable closeHandler)  | Registers a close handler for the stream.                                |
+--------------------------------------+--------------------------------------------------------------------------+

Collections in Java
In Java, Collections refer to a framework that provides architecture to store and manipulate a group of objects. It is a unified way to work with groups of objects by providing common operations like adding, removing, searching, sorting, and iterating over objects.

Key Components of the Java Collections Framework

1)Interfaces: Define the abstract data types (ADTs) that represent different types of collections (e.g., List, Set, Map, etc.).
2)Classes: Provide concrete implementations of the collection interfaces (e.g., ArrayList, HashSet, HashMap, etc.).
3)Algorithms: Static methods provided by the Collections utility class to perform operations such as sorting and searching.


Collection Interface:

The root of the collection hierarchy.
Represents a group of objects, known as its elements.
Key subinterfaces include List, Set, and Queue.

public interface Collection<E> {
    boolean add(E element);
    boolean remove(Object o);
    int size();
    boolean contains(Object o);
    Iterator<E> iterator();
}

List Interface:

An ordered collection that allows duplicate elements.
Elements are accessed by their index.
Common implementations: ArrayList, LinkedList.

List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

Set Interface:

A collection that does not allow duplicate elements.
It does not maintain any order (except specific implementations like LinkedHashSet).
Common implementations: HashSet, LinkedHashSet, TreeSet

Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");

Queue Interface:

A collection used to hold elements prior to processing.
Follows FIFO (First-In-First-Out) principle.
Common implementations: LinkedList, PriorityQueue.

Queue<String> queue = new LinkedList<>();
queue.add("Task1");
queue.add("Task2");

Map Interface:

A collection of key-value pairs.
Each key is unique, but values can be duplicated.
Common implementations: HashMap, TreeMap, LinkedHashMap

Map<Integer, String> map = new HashMap<>();
map.put(1, "Apple");
map.put(2, "Banana");


Important Classes in Java Collections Framework

ArrayList:

A resizable array implementation of the List interface.
Provides fast access to elements by index but is slower for insertions/removals (except at the end).

ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");

LinkedList:

Implements both List and Queue interfaces.
Elements are stored as a doubly linked list, making insertions and deletions efficient.

LinkedList<String> list = new LinkedList<>();
list.add("A");
list.add("B");

HashSet:

A Set implementation backed by a hash table.
Does not maintain any order, and elements must be unique

HashSet<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");

HashMap:

A Map implementation based on hashing.
Allows for fast lookups based on keys but does not maintain any order.

HashMap<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(2, "B");

TreeSet:

A Set implementation that maintains its elements in sorted order

TreeSet<Integer> sortedSet = new TreeSet<>();
sortedSet.add(10);
sortedSet.add(5);

PriorityQueue:

A Queue implementation that orders its elements based on their natural ordering or by a custom comparator.

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(5);

Common Methods in the Java Collections Framework
add(E e): Adds an element to the collection.
remove(Object o): Removes a specified element from the collection.
size(): Returns the number of elements in the collection.
clear(): Removes all elements from the collection.
contains(Object o): Checks if the collection contains a specific element.
isEmpty(): Checks if the collection is empty.
iterator(): Returns an iterator to traverse the collection.

The Collections Utility Class
The Collections class contains static methods that operate on or return collections. Some commonly used methods include:

Collections.sort(List<T>): Sorts a list.
Collections.reverse(List<T>): Reverses the order of elements in a list.
Collections.shuffle(List<T>): Randomly shuffles the elements of a list.
Collections.min(Collection<T>): Returns the minimum element from the collection.
Collections.max(Collection<T>): Returns the maximum element from the collection.
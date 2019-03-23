Definition:
An object that facilitates the traversal of a data structure

Examples:
Tree Iteration
Array Backed Properties

Notes:
- Iteration is a core functionality of various data structures
- An iterator is a class that facilitates the traversal
    - Keeps a reference to the current element
    - Knows how to move to a different element
- Java has Iterator<T> and Iterable<T>
    - Iterator<T> specifies the iterator API
    - A class needs to be Iterable inn order to support for(Foo foo: bar) loops
- An iterator specified how you can traverse an object
- Iterator cannot be recursive(no coroutines)
- Iterator implements Iterator<T>, iterable object implements Iterable<T>
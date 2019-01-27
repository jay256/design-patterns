Definition:
Facilitates the addition of behaviors to individual objects without inheriting from them

Examples:
String Decorator: final class decorator
Dynamic decorator: Shape
Static decorator composition
Adapter Decorator: StringBuilder


Notes:
1. Dynamic decorator called so because we can build new decorators at runtime
2. Static decorators can decide type at compile time
3. Java has limitations to forward calls to decorated class from the Decorator
4. Decorator typically keeps a reference to the decorated object
5. Java has limitations in static decorators due to type erasure and inability to inherit from type parameters
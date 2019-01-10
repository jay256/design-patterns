Definition:
When piecewise object construction is complicated, provides an API for doing it succinctly

Example:
1. StringBuilder is an in-built example of Builder Design Pattern
2. HtmlBuilder uses the Builder design pattern to build a complex HtmlElement
3. Person and Employee builder explain maintaining fluency with recursive generics and inheritance

Notes:
1. For objects that require a lot of ceremony to be created
2. For objects that have multiple number of arguments for their constructor, opt for piecewise creation
3. By following the builder pattern we can provide APIs for step by step object creation
4. Fluent interface allows writing long chains ot build an object
5. Recursive Generics with inheritance in Builder DP is used to maintain fluent interfaces
6. Faceted builders inherit from base builder class as both can be used fluently
Definition:
A high level blueprint for an algorithm to be completed by inheritors.
Allows us to define the 'skeleton' of the algorithm, with concrete implementations defined in subclasses

Examples:
- Algorithms can be composed into common parts + specifics
- Strategy does this through composition
    - High level algorithm uses an interface
    - Concrete implementation implement the interface
- Template method does the same thing through inheritance
    - Overall algorithms make use of abstract member
    - Inheritors override the abstract members
    - Parent template method invoke

Notes:
- Define an algorithm at a high level
- Define constituent parts as abstract methods/properties
- Inherit the algorithm class, providing necessary overrides
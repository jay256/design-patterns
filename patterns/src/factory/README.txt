Definition:
A component responsible solely for the wholesale (not piecewise) creation of objects.


Example:
1. Move PointFactory inside Point class if you don't want to make Point constructor public


Notes:
1. Following are the motivations:
    - Object creation logic becomes too convoluted
    - Constructor is not descriptive
        . Name mandated by name of containing type
        . Cannot overload with same set of arguments with different names
        . Can turn into 'overloading hell'
    - Wholesale object creation(non-precise, unlike builder) can be outsourced to
        . A separate function(Factory method)
        . That may exist in a separate class (Factory)
        . Can create hierarchy of factories with Abstract Factory

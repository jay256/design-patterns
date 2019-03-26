Definition:
System behavior partially specified at runtime
Enables the exact behavior of a system to selected either at runtime(dynamic) or compile-time(static)


Examples:
- Many algorithms can be decomposed into higher and lower level parts
- Making tea can be decomposed into
    - The process of making a hot beverage(boil water, pout into cup) and
    - Tea specific things(put teabag into water)
- The high level algorithm can then be reused for making coffee or hot chocolate
    - Supported by beverage-specific strategies

Notes:
- Known as policy in the C++ world
- Define an algorithm at a high lvel
- Define the interface you expect each strategy to follow
- Provide for either dynamic or static composition of strategy in the overall algorithm
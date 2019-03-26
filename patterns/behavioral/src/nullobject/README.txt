Definition:
A no-op object that conforms to the required interface, satisfying a dependency requirement of some other object

Examples:
- When component A uses component B, it typically assumes that B is non-null
    - you inject B, not some Option<B> type
    - You do not check for null on every call
- There is no otion of telling A not to use an instance of B
    - Its use is hard-coded
- Thus, we build a no-op, non-functioning inheritor of B(or some interface that B implements) and pass it into A

Notes:
- Implement the required interface
- Rewrite the methods with empty bodies
    - If method is non-void, return default value for a given type
    - If these values are ever used, you are inn trouble
- Supply an instance of NullObject in place of actual object
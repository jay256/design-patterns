Definition:
Sequence of handlers processing an event one after the other.
A chain of components who all get a chance to process a command or a query, optionally having default processing implementation and an ability to terminate the processing chain.

Examples:
- Games. Creature ability modifiers

Notes:
- Command Query Separation
    - Command: asking for an action or change
    - Query: asking for information
    - CQS: having separate means of sending commands and queries to eg. direct field access
- Chain of responsibility can be implemented as a chain of references or a centralized construct
- Enlist objects in the chain, possibly controlling their order
- Object removal from chain

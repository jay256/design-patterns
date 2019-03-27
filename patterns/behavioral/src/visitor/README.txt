Definition:
A pattern where  a component(visitor) is allowed to traverse the entire inheritance hierarchy. Implemented by propagating a single visit() method throughout the entire hierarchy

Examples:
- Need to define a new operation on an entire hierarchy of classes
    - Make a document model printable to HTML/Markdown
    - Do not want to keep modifying every class in the hierarchy
- Need access to the non common aspects of classes in the hierarchy
- Create an external component to handle rendering
    - But avoid type checks

Notes:
- Allows adding extra behaviors to entire hierarchies of classes
- Intrusive vs Reflective visitor
- Classic visitor(double dispatch)
- Acyclic Visitor
- Propagate an accept(Visitor v) method throughout the entire hierarchy
- Create a visitor with visit(Foo), visit(Bar), for each element in the hierarchy
- Each accept() simply calls visitor.visit(this)
- Acyclic visitor allows greater flexibility with some trade off with performance
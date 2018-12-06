Definition:

A. High level modules should not depend on low level modules. Both should depend on abstractions.
B. Abstractions should not depend on details. Details should depend on abstractions.

Example:
Relationships is a low-level module
Research is a high-level module
Both should depend upon an abstraction that is RelationshipBrowser


Notes:
Low level modules are the ones that act as interface between data model and the business logic
High level modules deal with logic of the application
When we depend on abstraction for both our low level and high level modules we are saving ourselves from changing the implementations in multiple places if some future changes arise in the low level module(eq: change from List to Array)
Definition:
Should be able to substitute a base class with a sub class.

Example:
Square inherits the Rectangle class and overrides its methods in such a way that substituting Rectangle for a Square violates the LSP.

Notes:
To maintain LSP, we can get rid of the inheritance and have a method in place which checks whether the Rectangle is a Square or have a Factory
implementation which will provide us with APIs to create a Rectangle/Sqaure.
The bottom line is we should not have inheritance just for the sake of it and break LSP. We should take care of LSP while implementing
inheritance.
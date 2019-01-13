Definition:

Connecting components together through abstractions.
A mechanism that decouples an interface from an implementation.

Examples:
Shape->Circle,Square
Rendering->Vector,Raster
VectorCircleRenderer, VectorSquareRenderer, RasterCircleRenderer, ResterSquareRenderer


Notes:

1. Bridge prevents a 'Cartesian Product' complexity explosion
2. Dependency Injection frameworks(eg: Guice) help Bridge pattern implementation
Definition:
A component that facilitates communication between objects without them being necessarily aware of each other or having direct(reference) access to each other.

Examples:
- Chat rooms
- MMORPG players
- EventBroker

Notes:
- Facilitates communication between components
- Components may go in and out of a system at any time
    - Chat room participants
    - Players in a MMORPG
    - It makes no sense for them to have direct references to one another
        - Those reference may go dead
    - Have them all refer to a central component that facilitates communication
- Create a mediator and have object int the system refer to it
- Mediator engages in bidirectional communication with its connected components
- Mediator has functions that the components can call
- Components have functions that the mediator can call
- Event processing libraries make communication easier to implement
Definition:
A pattern in which the object's behavior is defined by its state. An object transitions from one state to another(something needs ti trigger a transition)

Examples:
- Finite State Machines
- Telephone:
    - What you do with it depends on the state of the phone line:
        - If the phone is ringing or you want to make a call, you can pick it up
        - Phone must be off the hook to talk/make a call
        - If you try calling someone, and it's busy, you put the handset down
- changes in state can be explicit or in response to event(Observer pattern)


Notes:
- A formalized construct which manages state and transitions is called a state machine
- Given sufficient complexity, it pays to have formally defined states and events/triggers
    - Can define
        - State entry/exit behaviors
        - Action when a particular event causes a transition
        - Guard conditions enabling/disabling a transition
        - Default actions when no transitionsare found for an event
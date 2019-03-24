Definition:
Keep a memento of an object's state to return to that state.
A token/handle representing the system state. Let us rollback to the state where the token was generated. May or may not directly expose state information.

Examples:
- An object or system that goes htrough changes
    - Bank account getting deposits and withdrawals
- Memento is also used for interoperability between different programming languages

Notes:
- Different ways of navigating through the changes that the system goes through
    - One way is to record every change(Command) and teach a command to undo itself
    - Another is to simply save snapshots of the system
- Mementos are used to rollback states aribitrarily
- A memento is simply a token/handle class with(typically) no functions of its own
- A memento is not required to directly expose the state to which it reverts the system
- Can be used to implement undo/redo

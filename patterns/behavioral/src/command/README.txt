Definition:
An object that represents an instruction to perform a particular action. Contains all the information necessary for the action to be taken.

Examples:
GUI commands
multi-level undo/redo
macro recording

Notes:
- Ordinary java statements are perishable
    - Cannot undo a field assignment
    - Cannot directly serialize a sequence of actions(calls)
- Want an object that represents an operation
    - X should change its field Y to value Z
    - X should do w()

- Encapsulate all details of an operation in a separate object
- Define instruction for applying the command(either in the command itself or elsewhere)
- Optionally define instructions for undoing the command
- Can create composite commands(a.k.a macros)
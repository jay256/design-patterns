Definition:
An observer is an object that wishes to be informed about events happening in the system. The entity generating the events is an observable.

Examples:
- We need to be informed when certain things change:
    - Object's field changes
    - Object does something
    - Some external event occurs
- We want to listen to events and get notified when they occur

Notes:
- Typical pattern involves addXxxListener()
- Java now has funtional objects
    - Supplier<T>, Consumer<T>, Function<T>
- Observer is an intrusive approach: an observable must provide an event to subscribe to
- Special care must be taken to prevent issues in multithreaded scenarios
- Rx uses Observer<T>/Observable<T>
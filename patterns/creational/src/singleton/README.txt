Definition:

A component which is instantiated only once.
For components for which it makes sense to have only one in the system. eg: Database Repository, Object Factory

Example:
InnerStaticSingleton mitigates thread safety issues inherently.
EnumBasedSingleton: cannot inherit, cannot effectively serialize.
Monostate does not give any indication of it being a singleton. Monostate provides single data source.

Notes:
1. BasicSingleton defeated by using Reflection API
2. BasicSingleton has issues with Serialization/Deserialization
3. Instead of directly using a concrete implementation of a singleton, consider depending on an abstraction
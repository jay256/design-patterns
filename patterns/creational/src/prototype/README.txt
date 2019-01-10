Definition:

A partially or fully initialized object that you copy(clone) and make use of.

Example:

The default implementation of clone() method is to perform a shallow copy so not advisable for deep copy implementation.



Notes:
1. Cloneable is a marker interface.
2. Deep copy: Replicating every single element and copying it over to the new object.
3. Shallow copy: Simply copying the references. Changing one object will automatically the other object.
4. Copy constructor better than clone()

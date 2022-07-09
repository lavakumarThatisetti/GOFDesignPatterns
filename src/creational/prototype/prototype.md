Intent
Specify the kinds of objects to create using a prototypical instance, and create new
objects by copying this prototype.


1. The concept is to copy an existing object rather than creating a new instance from scratch,
something that may include costly operations.
2. The existing object acts as a prototype and contains the state of the object.
3. The newly copied object may change same properties only if required.
4. This approach saves costly resources and time, especially when object creation is a heavy process.

Example: create an object from existing objects is the clone() method.
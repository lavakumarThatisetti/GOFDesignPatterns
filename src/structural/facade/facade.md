Intent:
-------
*Facade is a behavioral design pattern that provides a simplified interface to a library, a framework, or any
other complex set of classes.*
1. It encapsulates a complex subsystem behind a simple interface. It hides much of the complexity and makes the subsystem easy to use.
2. It decouples a client implementation from the complex subsystem

![img.png](facade.png)

**Applicability**
--------------
Use the Facade pattern when
* *you want to provide a simple interface to a complex subsystem. Subsystems
often get more complex as they evolve. Most patterns, when applied, result
in more and smaller classes. This makes the subsystem more reusable and
easier to customize, but it also becomes harder to use for clients that don't
need to customize it. A facade can provide a simple default view of the
subsystem that is good enough for most clients. Only clients needing more
customizable will need to look beyond the facade.*
* *there are many dependencies between clients and the implementation classes
of an abstraction.Introduce a facade to decouple the subsystem from clients
and other subsystems, thereby promoting subsystem independence and
portability*
* *you want to layer your subsystems. Use a facade to define an entry point to
each subsystem level. If subsystems are dependent, then you can simplify
the dependencies between them by making them communicate with each
other solely through their facades*
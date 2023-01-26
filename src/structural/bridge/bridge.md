Intent
-------
Decouple an abstraction from its implementation so that the two can vary independently.

![img.png](img.png)


**Applicability**
-------------------
Use the Bridge pattern when
* you want to avoid a permanent binding between an abstraction and its implementation. This might be the case,for example,when the implementation 
  must be selected or switched at run-time.
* Both the abstractions and their implementations should be extensible by
subclassing. In this case, the Bridge pattern lets you combine the different
abstractions and implementations and extend them independently.
* changes in the implementation of an abstraction should have no impact on
clients; that is, their code should not have to be recompiled
Intent
--------
Allow an object to alter its behavior when its internal state changes. The object
will appear to change its class

idea = "allow the object for changing its behavior without changing its class"

UML Diagram
![state.png](state.png)

In the UML diagram, we see that **Context** class has an associated State which is going to change during program execution.

Our context is going to delegate the behavior to the state implementation. In other words, all incoming requests will be handled by the concrete implementation of the state.

We see that logic is separated and adding new states is simple – it comes down to adding another State implementation if needed

Example
1. During Food Delivery Possible States Could be [ACCEPTED_THE_ORDER, FOOD_BEING_PREPARED, FOOD_PICKED_UP_BY_DELIVERY_PARTNER,
   DELIVERY_IS_IN_TRANSITION, FOOD_DELIVERED]
2. During Payment for Movie booking or food [PAYMENT_INITIATED, PAYMENT_PROCESSING, PAYMENT_COMPLETED, PAYMENT_FAILED]
3. In Amazon Delivery Track [ITEM_NOT_YET_DISPATCHED, ITEM_IS_IN_HUB1, ITEM_IS_IN_HUB2, ITEM_DELIVERED]
   1. here if we return bck [ITEM_PICKUP ...]
   
The Basic idea all were sequential if we change the state a some point then everything goes in sequential

Downsides
----------
State pattern drawback is the payoff when implementing transition between the states.
That makes the state hardcoded, which is a bad practice in general.
But, depending on our needs and requirements, that might or might not be an issue





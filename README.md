# mediator-pattern
Try application of Mediator pattern.

The intent of the Mediator Pattern is to reduce the complexity and dependencies between tightly coupled objects communicating directly with one another

![alt text](https://www.baeldung.com/wp-content/uploads/2019/03/mediator.png)

As we can see, Colleague objects do not refer to each other directly. Instead, all the communication is carried out by the Mediator.
Also, in case we need to change the way Colleague objects work together, we only have to amend the ConcreteMediator logic. Or we can create a new implementation of the Mediator.

The Mediator Pattern is a good choice if we have to deal with a set of objects that are tightly coupled and hard to maintain. This way we can reduce the dependencies between objects and decrease the overall complexity.

Additionally, by using the mediator object, we extract the communication logic to the single component, therefore we follow the [Single Responsibility Principle](https://www.baeldung.com/solid-principles#s). Furthermore, we can introduce new mediators with no need to change the remaining parts of the system. Hence, we follow the Open-Closed Principle.

Sometimes, however, we may have too many tightly coupled objects due to the faulty design of the system. If this is a case, we should not apply the Mediator Pattern. 

# Design patterns

<br/>

## The 23 design patterns according to the GOF

### Creational Patterns (5)

1. Abstract Factory
2. Builder
3. Factory Method
4. Prototype
5. Singleton

### Structural Patterns (7)

1. Adapter
2. Bridge
3. Composite
4. Decorator
5. Facade
6. Flyweight
7. Proxy

### Behavioral Patterns (11)

1. Chain of Responsibility
2. Command
3. Interpreter
4. Iterator
5. Mediator
6. Memento
7. Observer
8. State
9. Strategy
10. Template Method
11. Visitor

<br/>

## Pattern Explanation

- Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

- Builder: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

- Factory Method: Defines an interface for creating objects, but lets subclasses decide which class to instantiate.

- Prototype: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

- Singleton: Ensures a class has only one instance and provides a global point of access to it.

<br/>

- Adapter: Allows incompatible interfaces to work together by wrapping an object with a new interface.

- Bridge: Decouples an abstraction from its implementation, so the two can vary independently.

- Composite: Composes objects into tree structures to represent part-whole hierarchies, treating individual objects and compositions of objects uniformly.

- Decorator: Adds behavior to objects dynamically, without changing their class.

- Facade: Provides a simplified interface to a complex system of classes, libraries, or frameworks.

- Flyweight: Minimizes memory usage or computational expenses by sharing as much as possible with similar objects.

- Proxy: Provides a placeholder or surrogate for another object to control access to it.

<br/>

- Chain of Responsibility: Passes a request along a chain of handlers, each processing the request or passing it to the next handler in the chain.

- Command: Encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of requests.

- Interpreter: Provides a way to evaluate language grammar or expressions.

- Iterator: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

- Mediator: Defines an object that encapsulates how a set of objects interact, promoting loose coupling between them.

- Memento: Captures and externalizes an object's internal state so that it can be restored later, without violating encapsulation.

- Observer: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

- State: Allows an object to alter its behavior when its internal state changes, the object will appear to change its class.

- Strategy: Defines a family of algorithms, encapsulates each algorithm, and makes the algorithms interchangeable within that family.

- Template Method: Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

- Visitor: Represents an operation to be performed on the elements of an object structure, lets you define a new operation without changing the classes of the elements.
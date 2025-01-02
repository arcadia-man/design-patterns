# **Behavioral Design Patterns**

Behavioral design patterns deal with object interaction and how responsibilities are distributed between objects. These patterns are focused on improving communication between objects while keeping the system flexible and easy to extend. Behavioral patterns help manage complex flow control and object interactions while maintaining flexibility in the system.

## **Purpose of Behavioral Patterns**

Behavioral patterns aim to:
- **Improve communication** between objects, making it easier for them to collaborate effectively.
- **Decouple the classes** that communicate, allowing for greater flexibility and reducing dependencies.
- **Optimize responsibility distribution**, ensuring that objects are responsible for their tasks and interactions in a system.

## **Advantages of Behavioral Patterns**

- **Increased flexibility**: These patterns allow objects to change their behavior or interaction mechanism dynamically.
- **Better communication management**: They streamline communication between objects, reducing the complexity of the system.
- **Reduced coupling**: By decoupling classes, these patterns make it easier to extend or modify the system without affecting other components.

## **Common Behavioral Design Patterns**

### 1. **Chain of Responsibility Pattern**
- Allows a request to be passed along a chain of handlers, where each handler decides whether to process the request or pass it along to the next handler.
- **Example Use Case**: A logging system where different loggers handle messages of varying severity (info, warning, error).

### 2. **Command Pattern**
- Encapsulates a request as an object, allowing clients to parameterize the objects with operations, delay the execution, or queue requests.
- **Example Use Case**: A remote control that turns devices on/off, with each button press representing a command.

### 3. **Interpreter Pattern**
- Defines a way to evaluate sentences in a language by defining a grammar for the language and an interpreter to execute the sentences.
- **Example Use Case**: A simple calculator that interprets mathematical expressions and computes the result.

### 4. **Iterator Pattern**
- Provides a way to access elements of a collection sequentially without exposing the underlying representation of the collection.
- **Example Use Case**: Iterating through elements of a collection like a list or set, without exposing the internal data structure.

### 5. **Mediator Pattern**
- Defines an object that controls the interaction between different objects to reduce direct dependencies between them.
- **Example Use Case**: A chat room where the mediator (chat server) controls communication between users, reducing the complexity of direct interactions.

### 6. **Memento Pattern**
- Captures and externalizes an object’s internal state so that it can be restored later, without violating encapsulation.
- **Example Use Case**: A text editor where the user can undo and redo changes by storing and restoring the document's state.

### 7. **Observer Pattern**
- Allows a subject to notify its observers (listeners) of any changes in its state without knowing who or what those observers are.
- **Example Use Case**: A weather monitoring system where multiple devices (smartphones, displays) are updated with weather data.

### 8. **State Pattern**
- Allows an object to change its behavior when its internal state changes, making the object appear as if it has changed its class.
- **Example Use Case**: A vending machine that behaves differently depending on whether it's waiting for payment, dispensing a product, or idle.

### 9. **Strategy Pattern**
- Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to be selected at runtime.
- **Example Use Case**: A payment system that can choose different payment strategies (credit card, PayPal, etc.) based on user preference.

### 10. **Template Method Pattern**
- Defines the skeleton of an algorithm, allowing subclasses to implement specific steps of the algorithm without changing its structure.
- **Example Use Case**: A recipe where the basic steps are defined, but specific dishes like cake or cookies can customize certain steps.

### 11. **Visitor Pattern**
- Allows you to define new operations on objects without changing their classes.
- **Example Use Case**: A shopping cart system where different types of discounts or operations (like tax calculation) can be added to the cart items without modifying their classes.

# **Structural Design Patterns**

Structural design patterns focus on how classes and objects are composed to form larger structures. They deal with object composition, creating relationships between objects that make it easier to work with complex systems. These patterns ensure that the system is flexible, maintainable, and scalable by simplifying the relationships between different components.

## **Purpose of Structural Patterns**

Structural patterns aim to:
- **Simplify relationships**: They make it easier to work with large, complex systems by reducing the number of classes and objects that need to be managed directly.
- **Increase reusability**: By using simpler objects and relationships, these patterns encourage code that can be reused across different parts of the system.
- **Promote loose coupling**: They ensure that components are minimally dependent on one another, reducing the impact of changes on the system.

## **Advantages of Structural Patterns**

- **Improved maintainability**: Simplifying object relationships leads to code that is easier to understand, maintain, and extend.
- **Better scalability**: These patterns allow the system to grow without becoming more complex or fragile.
- **Flexible architecture**: Structural patterns help create systems where components can be easily modified or replaced without affecting other parts.

## **Common Structural Design Patterns**

### 1. **Adapter Pattern**
- Allows incompatible interfaces to work together by providing a wrapper that translates between them.
- **Example Use Case**: A legacy system that needs to work with a new interface. An adapter pattern can allow the old system to integrate with the new one without changing the existing code.

### 2. **Bridge Pattern**
- Decouples an abstraction from its implementation so that both can vary independently.
- **Example Use Case**: A remote control for different types of devices (e.g., TV, air conditioner) where the control mechanism can remain the same, but the device type can change.

### 3. **Composite Pattern**
- Allows you to compose objects into tree-like structures to represent part-whole hierarchies.
- **Example Use Case**: A file system where files and directories are treated as objects, allowing directories to contain other directories or files in a hierarchical structure.

### 4. **Decorator Pattern**
- Allows you to add new behavior to an object dynamically by wrapping it in another object.
- **Example Use Case**: Adding new features to an existing object, such as adding a scroll bar to a window or a border to a graphical element.

### 5. **Facade Pattern**
- Provides a simplified interface to a complex subsystem, hiding the complexities from the client.
- **Example Use Case**: A library system where a facade is used to provide simple methods to borrow, return, and search books, while the complex system of book management remains hidden from the user.

### 6. **Flyweight Pattern**
- Reduces memory usage by sharing common objects rather than creating multiple instances of the same object.
- **Example Use Case**: A text editor where individual characters are shared across multiple instances of a document to reduce memory consumption.

### 7. **Proxy Pattern**
- Provides a surrogate or placeholder for another object to control access to it.
- **Example Use Case**: A virtual proxy for loading large images only when needed, helping to improve the performance of applications by loading resources on demand.

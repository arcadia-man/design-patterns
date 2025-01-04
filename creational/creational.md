# **Creational Design Patterns**

Creational design patterns deal with object creation mechanisms. These patterns abstract the process of object creation, making it more flexible and dynamic. They provide a way to instantiate objects in a manner that suits the situation at hand, without specifying the exact class of the object that will be created.

## **Advantages of Creational Patterns**

- **Encapsulation of object creation**: The creation logic is abstracted and centralized, making code more maintainable and adaptable.
- **Increased flexibility**: The creation of objects can be controlled and changed without affecting the rest of the system.
- **Enhanced code readability**: Complex object creation logic is simplified, improving the understanding of the code.

## **Common Creational Design Patterns**

### 1. **Singleton Pattern**
- Ensures that a class has only one instance and provides a global point of access to it.
- **Example Use Case**: A database connection class where only one instance of the connection should exist throughout the application lifecycle.

### 2. **Factory Method Pattern**
- Defines an interface for creating objects, but lets subclasses alter the type of objects that will be created.
- **Example Use Case**: A GUI framework where different types of buttons (WindowsButton, MacButton) need to be created depending on the operating system.

### 3. **Abstract Factory Pattern**
- Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Example Use Case**: A theme manager that can generate different families of widgets (buttons, checkboxes) depending on the theme (light or dark).

### 4. **Builder Pattern**
- Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- **Example Use Case**: Building a house where each step (foundation, walls, roof) is handled independently to create different types of houses.

### 5. **Prototype Pattern**
- Creates new objects by copying an existing object (prototype)
- It saves the resource while new object creation and allow modifications to be made to the new object.
- **Example Use Case**: Cloning a document template and customizing it with different content, preserving the structure but changing the details.
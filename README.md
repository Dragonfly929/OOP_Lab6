# Architecture and SOLID

**SOLID principles in your project**. It stands for

* Single-responsibility principle (SRP)
* Open-closed principle (OCP)
* Liskov substitution principle (LSP)
* Interface segregation principle (ISP)
* Dependency inversion Principle (DIP)

**MVC** Pattern stands for **Model-View-Controller** Pattern. This pattern is used to separate application's concerns.

* **Model** - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

* **View** - View represents the visualization of the data that model contains.

* **Controller** - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.

The **Rectangle/Square** hierarchy violates the Liskov Substitution Principle (LSP)! Square is behaviorally not a correct substitution for Rectangle. As well as Ellipse/Circle so I excluded the Square and Circle class

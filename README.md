# MIDTERM Projects:

This repository contains three Java-based projects that demonstrate the use of design patterns and object-oriented programming principles:
In the docs/testing.docx you can see testing and explanation of each project.

1. **Online Payment Gateway**
2. **Smart Home Control System**
3. **Coffee Shop Simulator**

Each project showcases different design patterns and provides a practical implementation of real-world systems.

---

## 1. Online Payment Gateway

### Overview
The **Online Payment Gateway** simulates a payment platform that supports multiple payment methods (e.g., credit card, PayPal, cryptocurrency). It demonstrates the use of the **Factory Method** and **Adapter** patterns.

### Features
- **Multiple Payment Methods**: Supports credit card, PayPal, and cryptocurrency payments.
- **Transaction Management**: Tracks transaction status (pending, completed, failed).
- **Adapter Pattern**: Integrates external payment APIs (e.g., PayPal, credit card validation).

### Design Patterns Used
- **Factory Method Pattern**: Encapsulates the creation of payment method objects.
- **Adapter Pattern**: Integrates external payment APIs.

### Usage
1. Run the `PaymentGatewayDemo` or `PaymentGatewayConsole` class.
2. Follow the CLI prompts to select a payment method and process a transaction.

---

## 2. Smart Home Control System

### Overview
The **Smart Home Control System** simulates the management of a smart home with various devices (e.g., lights, thermostats, security cameras). It demonstrates the use of the **Composite**, **Decorator**, **Abstract Factory**, **Facade**, and **Adapter** patterns.

### Features
- **Device Management**: Add, remove, and control smart home devices.
- **Dynamic Behavior**: Decorate devices with additional features (e.g., logging, power-saving mode).
- **Simplified Interface**: Use a facade to interact with the system.
- **Integration**: Adapt legacy or third-party systems (e.g., legacy door locks).

### Design Patterns Used
- **Composite Pattern**: Organizes devices into hierarchical structures.
- **Decorator Pattern**: Adds behavior to devices dynamically.
- **Abstract Factory Pattern**: Creates families of related devices (basic vs. advanced).
- **Facade Pattern**: Provides a simplified interface for managing the system.
- **Adapter Pattern**: Integrates legacy or third-party systems.

### Usage
1. Run the `SmartHomeDemo` or `SmartHomeCLI` class.
2. Follow the CLI prompts to:
   - Choose a home type (Basic or Advanced).
   - Decorate devices with additional behaviors.
   - Start routines (e.g., evening or night routines).
   - Check the system status.

---

## 3. Coffee Shop Simulator

### Overview
The **Coffee Shop Simulator** simulates a coffee ordering system where customers can customize their coffee with various ingredients and toppings. It demonstrates the use of the **Factory Method** and **Decorator** patterns.

### Features
- **Coffee Customization**: Choose from different coffee types (e.g., Espresso, Latte).
- **Dynamic Toppings**: Add ingredients (e.g., milk, caramel syrup) dynamically.
- **Order Management**: Calculate the total cost and display the order description.

### Design Patterns Used
- **Factory Method Pattern**: Creates different coffee types.
- **Decorator Pattern**: Adds ingredients dynamically to customize coffee.

### Usage
1. Run the `CoffeeShopDemo` class.
2. Follow the CLI prompts to:
   - Select a coffee type.
   - Add toppings or ingredients.
   - View the final order description and cost.

---

## Installation

### Prerequisites
- **Java Development Kit (JDK)**: Ensure you have JDK 8 or later installed.
- **IDE**: Use an IDE like IntelliJ IDEA, Eclipse, or VS Code for easier development.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/project-portfolio.git
   cd project-portfolio

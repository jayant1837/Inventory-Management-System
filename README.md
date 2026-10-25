# Inventory Management System

A menu-driven, console-based Java application for managing product inventory. The application allows users to add, view, search, update, and delete product records and generate a stock report.

## Features

- Add new product records.
- View all product records.
- Search for products using Product ID.
- Update product name, quantity, price, or all details.
- Delete product records.
- Generate a stock report.
- Display total products, available products, low-stock products, and out-of-stock products.
- Validate user input and handle invalid numeric values.
- Prevent duplicate product IDs.
- Prevent negative quantities and prices.
- Automatically classify stock status.
- Save product records to `inventory.txt`.
- Load saved records when the application starts.
- Generate stock reports using multithreading.

## Technologies Used

- Java (JDK 8 or later)
- Java Collections Framework
- File Handling
- Exception Handling
- Multithreading
- Git
- GitHub

## Java Concepts Used

### 1. Classes and Objects
The application uses the `InventoryManagementSystem` and `Product` classes to manage inventory records.

### 2. Constructors
Constructors initialize product objects with their ID, name, quantity, and price.

### 3. `this` Keyword
The `this` keyword refers to the current object and distinguishes instance variables from constructor or setter parameters.

### 4. Encapsulation
The quantity and price fields in the `Product` class are private and accessed through getter and setter methods.

### 5. Inheritance
The `Product` class extends the abstract `Item` class.

### 6. Polymorphism
The `Product` class implements the `Stock` interface and provides its own implementation of `getStockStatus()`.

### 7. Abstraction
The abstract `Item` class declares the abstract `display()` method, which is implemented by `Product`.

### 8. Interface
The `Stock` interface defines the `getStockStatus()` method.

### 9. Collections

- `ArrayList<Product>` stores product records.
- `HashSet<Integer>` prevents duplicate product IDs.
- `HashMap<Integer, Product>` provides product lookup using Product ID.

### 10. Exception Handling
The application handles invalid numeric input, file errors, and invalid records loaded from the data file.

### 11. File Handling
The application uses `FileReader`, `FileWriter`, `BufferedReader`, and `PrintWriter` to load and save inventory records.

### 12. Multithreading
The `stockReport()` method creates a separate thread to calculate and display inventory statistics.

### 13. Static Members
Static variables and methods allow the application to share the scanner, collections, file name, and utility methods.

## Project Structure

```text
InventoryManagementSystem/
├── InventoryManagementSystem.java
├── inventory.txt
└── README.md
```

**File descriptions:**

- `InventoryManagementSystem.java` — contains the main application, product class, interface, abstract class, and inventory operations.
- `inventory.txt` — stores product records and is created or updated when data is saved.
- `README.md` — contains project documentation and instructions.

## How to Run the Project

### Requirements

Install Java JDK 8 or later and configure Java so that `java` and `javac` are available in your terminal.

### Step 1: Save the Java File

Save your source code as:

```text
InventoryManagementSystem.java
```

The filename must match the public class name.

### Step 2: Open the Terminal

Open Command Prompt or a terminal in the directory containing the Java file.

### Step 3: Compile the Program

```bash
javac InventoryManagementSystem.java
```

### Step 4: Run the Application

```bash
java InventoryManagementSystem
```

The application will display the main menu.

**Important:** Run the application from the project directory so that `inventory.txt` is created and loaded in the expected location.

## Sample Output

```text
========== INVENTORY MANAGEMENT SYSTEM ==========
1. Add Record
2. View All Records
3. Search Record
4. Update Record
5. Delete Record
6. Stock Report
7. Exit

Enter your choice: 6

Generating Stock Report...

========== STOCK REPORT ==========
Total Products : 3
Available      : 1
Low Stock      : 1
Out of Stock   : 1
==================================
```

*Note: This is an illustrative example. The actual totals depend on the product records stored in the inventory file.*

## Stock Status Rules

| Quantity | Stock Status |
|---:|---|
| 0 | Out of Stock |
| 1–5 | Low Stock |
| Greater than 5 | Available |

## Data File Format

The application stores each product on a separate line in `inventory.txt`.

Example:

```text
101|Keyboard|12|799.0
102|Mouse|4|399.0
103|USB Cable|0|149.0
```

Each record contains:

```text
Product ID | Product Name | Quantity | Price
```

The pipe character (`|`) separates the fields. Therefore, product names cannot contain this character.

## Git & GitHub

Follow these steps to upload the project to GitHub.

### Step 1: Initialize Git

```bash
git init
```

### Step 2: Add Project Files

```bash
git add InventoryManagementSystem.java README.md
```

If you want to include your saved inventory records, add the data file too:

```bash
git add inventory.txt
```

### Step 3: Commit the Changes

```bash
git commit -m "Add Inventory Management System"
```

### Step 4: Set the Main Branch

```bash
git branch -M main
```

### Step 5: Connect Your GitHub Repository

```bash
git remote add origin YOUR_GITHUB_REPOSITORY_URL
```

Replace `YOUR_GITHUB_REPOSITORY_URL` with your actual GitHub repository URL.

### Step 6: Push the Project

```bash
git push -u origin main
```

After pushing, verify that your Java source code and README are accessible in your GitHub repository.

## Future Improvements

- Develop a graphical user interface using Java Swing or JavaFX.
- Integrate a MySQL database.
- Add product categories and supplier management.
- Implement sales and purchase transactions.
- Export stock reports to CSV or PDF.
- Add user authentication and role-based access.
- Implement automated unit testing.

## Conclusion

The Inventory Management System demonstrates fundamental and intermediate Java concepts through a practical inventory application. It provides product management, stock classification, file-based data persistence, collections, exception handling, and multithreading.

The project helps demonstrate Java programming skills and provides a foundation for developing more advanced inventory management applications.

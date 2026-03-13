# Student Management System

A console-based **Student Management System** built using **Java, JDBC, and MySQL**.  
This project demonstrates how a backend application interacts with a database to manage student records efficiently.

The application allows users to **Add, View, Update, and Delete student data** using a simple menu-driven interface.

---

## Features

- Add new student records
- View all student records
- Update existing student details
- Delete student records
- Console-based interactive menu
- MySQL database integration using JDBC
- Exception handling for better reliability

---

## Tech Stack

- Java
- JDBC (Java Database Connectivity)
- MySQL
- SQL

---

## Project Structure

```
StudentManagementSystem
│
├── DBConnection.java
├── Student.java
├── StudentDAO.java
├── Main.java
```

---

## Database Setup

Run the following SQL script in MySQL before running the project.

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(100),
department VARCHAR(100),
marks INT
);
```

---

## How to Run

1. Clone the repository

```
git clone https://github.com/jaiprakashoffcl/student-management-system-java.git
```

2. Open the project in **Eclipse / IntelliJ**

3. Add **MySQL Connector JAR** to the project build path

4. Update database credentials in `DBConnection.java`

5. Run the application

```
Main.java
```

---

## Sample Output

```
===== Student Management System =====
1 Add Student
2 View Students
3 Update Student
4 Delete Student
5 Exit
```

---

## Learning Outcomes

- Java backend development
- JDBC database connectivity
- CRUD operations
- SQL queries
- Object-Oriented Programming concepts

---

## Author

**Jai Prakash R**

GitHub: https://github.com/jaiprakashoffcl  
LinkedIn: https://www.linkedin.com/in/jai-prakash-ramesh

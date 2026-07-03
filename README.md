# 🔐 Authentication-Web-Application

A secure and responsive **Authentication Web Application** built using **Java, JSP, Servlets, JDBC, and MySQL**. This project demonstrates user registration, login authentication, session management, and database connectivity following the **MVC (Model-View-Controller)** architecture.

---

## 📖 Overview

Authentication-Web-Application is a Java web application that enables users to create an account, securely log in, and access protected pages. It is designed as a beginner-to-intermediate project for learning Java EE web development and serves as a strong portfolio project for Java and DevOps enthusiasts.

---

## ✨ Features

* 🔐 Secure User Login
* 📝 New User Registration
* 👤 User Authentication
* 💾 MySQL Database Integration
* 🔗 JDBC Connectivity
* 📂 MVC Project Structure
* 🌐 Responsive User Interface
* 🔒 Session Management
* ⚠️ Invalid Login Handling
* 🚪 User Logout Functionality

---

## 🛠️ Tech Stack

### Backend

* Java
* JSP (JavaServer Pages)
* Servlets
* JDBC

### Frontend

* HTML5
* CSS3

### Database

* MySQL

### Web Server

* Apache Tomcat

### Development Tools

* Eclipse IDE / Spring Tool Suite (STS)
* Git
* GitHub

---

## 📁 Project Structure

```text
Authentication-Web-Application
│
├── src/
│   ├── controller/
│   ├── dao/
│   ├── model/
│   └── util/
│
├── src/main/webapp/
│   ├── login.jsp
│   ├── register.jsp
│   ├── welcome.jsp
│   ├── logout.jsp
│   ├── css/
│   └── images/
│
├── WEB-INF/
├── pom.xml
├── README.md
└── database.sql
```

---

## ⚙️ Prerequisites

Install the following software before running the project:

* Java JDK 17 or later
* Apache Tomcat 9 or later
* MySQL Server
* Eclipse IDE / STS
* Git

---

## 🗄️ Database Setup

Create a database:

```sql
CREATE DATABASE crt;
```

Create the users table:

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255)
);
```

Update your JDBC database connection with your MySQL credentials.

---

## ▶️ Running the Project

1. Clone the repository.

```bash
git clone https://github.com/your-username/Authentication-Web-Application.git
```

2. Import the project into Eclipse or STS.

3. Configure Apache Tomcat.

4. Create the MySQL database.

5. Update the JDBC connection details.

6. Deploy the project on Tomcat.

7. Open your browser.

```text
http://localhost:8080/Authentication-Web-Application/
```

---

## 📸 Application Screens

Add screenshots after uploading them to GitHub.

* Home Page
* Registration Page
* Login Page
* Welcome Dashboard
* MySQL Database

---

## 🎯 Project Objectives

* Understand Java Web Development
* Learn JSP and Servlets
* Connect Java applications with MySQL using JDBC
* Implement secure authentication
* Practice session management
* Follow MVC architecture
* Build a portfolio-ready Java web application

---

## 📚 Skills Demonstrated

* Java Programming
* Object-Oriented Programming (OOP)
* JSP
* Servlets
* JDBC
* MySQL
* HTML
* CSS
* MVC Architecture
* Session Management
* Git
* GitHub
* Apache Tomcat

---

## 🚀 Future Enhancements

* Password Encryption using BCrypt
* Forgot Password
* Email Verification
* User Profile Management
* Admin Dashboard
* Role-Based Authentication
* Bootstrap UI
* Spring Boot Migration
* REST API Integration
* Docker Containerization
* Jenkins CI/CD Pipeline
* AWS Deployment

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository.
2. Create a new feature branch.
3. Commit your changes.
4. Push to your branch.
5. Open a Pull Request.

---

## 👨‍💻 Author

**Surya Teja**

Thank you for visiting this project!

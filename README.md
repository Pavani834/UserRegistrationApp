# 🧾 User Registration Web Application

This is a simple **User Registration and Login** web application built using **Java Servlets**. It demonstrates basic form handling, session tracking, and user input validation in a traditional Java EE web environment.

---

## 📌 Features

- User registration with form input
- Login authentication using Java Servlets
- Session tracking for logged-in users
- Input validation and form handling
- HTML & CSS for frontend design
- Simple user feedback via redirect/pages

---

## 🛠️ Tech Stack

| Layer         | Technologies                    |
|---------------|---------------------------------|
| Language      | Java (Servlets)                 |
| Frontend      | HTML5, CSS3                     |
| Backend       | Java Servlet API                |
| IDE           | Eclipse                         |
| Server        | Apache Tomcat (via XAMPP)       |
| Build Tool    | Manual deployment / .class files|

---

## 📁 Project Structure

UserRegistrationApp/
│
├── WebContent/
│ ├── index.html # Home page with options
│ ├── register.html # Registration form
│ ├── login.html # Login form
│ └── success.html # Post-login landing page
│
├── src/
│ ├── RegisterServlet.java # Handles user registration
│ └── LoginServlet.java # Handles login/authentication
│
└── WEB-INF/
├── web.xml # Deployment descriptor

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Pavani834/UserRegistrationApp.git
Open the project in Eclipse IDE

Configure a local Tomcat server (e.g., via XAMPP or standalone)

Add the project to the server and deploy

Navigate to http://localhost:8080/UserRegistrationApp/index.html

🎯 Learning Objectives
This project helped me:

Understand the Servlet lifecycle

Handle HTTP GET and POST methods

Practice session management

Build full-stack web logic manually without Spring or frameworks

🧠 Future Improvements
Add form validation using JavaScript

Store user data in a database (e.g., MySQL)

Add logout functionality

Improve CSS styling and responsiveness

📜 License
This project is open-source and free to use for educational purposes.

🙋‍♀️ Author
Molabanti Pavani Kalyani

# 🔐 JWT Authentication System (Spring Boot)

## 📌 Project Overview

This project demonstrates a **JWT (JSON Web Token) Authentication System** built using **Spring Boot**.

It allows:

* User login
* Token generation
* Secure access to protected APIs

---

## 🚀 Features

* 🔑 User Authentication using username & password
* 🪪 JWT Token Generation
* 🔒 Secure Protected Routes
* ⚡ Spring Security Integration
* 🗄️ H2 Database (in-memory)

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Security
* JWT (io.jsonwebtoken)
* Maven
* Postman (for testing)

---

## 📂 API Endpoints

### 🔹 1. Login API

* **URL:** `/auth/login`
* **Method:** POST

#### Request Body:

```json
{
  "username": "user",
  "password": "password"
}
```

#### Response:

```json
{
  "token": "JWT_TOKEN"
}
```

---

### 🔹 2. Protected API

* **URL:** `/protected`
* **Method:** GET

#### Header:

```
Authorization: Bearer YOUR_TOKEN
```

#### Response:

```
You accessed a protected route!
```

---

## 📸 Screenshots

### 🔐 Login Page

![Login Page](login-page.png)

### 🏠 Backend Working

![Home Page](home-page.png)

### 📤 Login Request (Postman)

![Login Request](login-request-postman.png)

### 🔑 Token Response

![Token Response](token-response.png)

### 🔒 Protected Route Access

![Protected Route](protected-route.png)

---

## ⚙️ How to Run

1. Clone the repository

```
git clone https://github.com/your-username/jwt-auth.git
```

2. Navigate to project folder

```
cd jwt-auth
```

3. Run the project

```
mvn spring-boot:run
```

4. Open browser:

```
http://localhost:8080
```

---

## 🎯 Learning Outcomes

* Understanding JWT authentication
* Working with Spring Security
* Securing REST APIs
* Using Postman for API testing

---

## 👨‍💻 Author

* Your Name

---

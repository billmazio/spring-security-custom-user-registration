# Spring Security Custom User Registration

This project demonstrates a custom user registration process using Spring Security and Thymeleaf. It is integrated with Hibernate for database operations.

## Table of Contents
1. [Project Structure](#project-structure)
2. [Usage](#usage)
3. [Features](#features)
4. [Credits](#credits)
5. [Screenshots](#screenshots)

## Project Structure <a name="project-structure"></a>
- **Configuration Files**
  - `src/main/resources/application.properties`: Properties file containing application-specific configurations, including database settings.
  
- **Java Classes**
  - `DemoSecurityConfig.java`: Defines Spring Security configuration, such as access rules and authentication providers.
  - `CustomAuthenticationSuccessHandler.java`: Handles successful logins and stores user information in the session.
  - `LoginController.java`: Manages login-related functionalities.
  - `RegistrationController.java`: Manages user registration processes.
  - `DemoController.java`: Demonstrates various pages and role-based access controls.
  - `User.java`: Represents a user entity.
  - `Role.java`: Represents user roles.
  - `UserService.java`: Interface for user-related operations.
  - `CrmUser.java`: DTO class for user registration form data.
  
- **Templates**
  - `src/main/resources/templates/`: Contains Thymeleaf templates for different pages like login, registration, home, etc.

## Usage <a name="usage"></a>
1. **Clone or Download**: Clone or download this repository.
2. **Database Configuration**: Set up your database configurations in `application.properties`.
3. **Run Application**: Use your preferred method to run the application. For example, with Spring Boot, you can use `mvn spring-boot:run`.
4. **Access**: Open the application in your web browser.

## Features <a name="features"></a>
- **User Registration**: Comes with input validation.
- **Login**: Secure login functionality is implemented using Spring Security.
- **Access Control**: Role-based access controls for different user roles.

## Credits <a name="credits"></a>
This project is based on the tutorial and guidance provided by [Luv2Code](https://www.luv2code.com/).

## Screenshots <a name="screenshots"></a>
![Registration](assets/116730698/da3f2543-4815-4a9a-a9ac-18aedcfc8dec.png)
![Registration Successful](assets/116730698/c904f860-36c5-46be-a64b-ccc0fe944973.png)
![Login Page](assets/116730698/f42b10f2-703d-443d-8d92-7a29b9f1a596.png)
![User Employee Details](assets/116730698/0c336d64-a3fd-4a6e-924e-d88274d326a7.png)
![Login - Manager Role](assets/116730698/70a42f59-b832-4aa5-910a-cd3002969fe9.png)
![User Manager Details](assets/116730698/72e9e973-a3e6-447f-98a5-3a9e1e9ca6c9.png)
![Manager Page](assets/116730698/7c8f0810-078f-4e7b-a8cf-7ecf7a72d990.png)
![Admin Page](assets/116730698/0da175d4-6416-4786-bd1c-444f16c198e8.png)

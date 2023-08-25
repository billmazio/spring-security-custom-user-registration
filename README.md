# spring-security-custom-user-registration
# Spring Security Custom User Registration Demo

This project demonstrates a custom user registration process using Spring Security and Thymeleaf.

## Project Structure

- **src/main/java/com/luv2code/springsecurity/demo/config/DemoSecurityConfig.java**
  - Configuration class that defines Spring Security configuration.
  - Specifies access rules and authentication providers.
  
- **src/main/java/com/luv2code/springsecurity/demo/config/CustomAuthenticationSuccessHandler.java**
  - Custom authentication success handler to handle successful logins.
  - Retrieves user information and stores it in the session.
  
- **src/main/java/com/luv2code/springsecurity/demo/controller/LoginController.java**
  - Controller class for handling login-related functionality.
  - Provides endpoints for displaying login and access-denied pages.
  
- **src/main/java/com/luv2code/springsecurity/demo/controller/RegistrationController.java**
  - Controller class for handling user registration.
  - Includes endpoints for displaying registration forms and processing registrations.
  
- **src/main/java/com/luv2code/springsecurity/demo/controller/DemoController.java**
  - Controller class for demonstrating various pages and access control.
  - Contains endpoints for home, leaders, and systems pages with role-based access.
  
- **src/main/java/com/luv2code/springsecurity/demo/entity/User.java**
  - Entity class representing a user with relevant fields.
  - Defines relationships with roles and stores user information.
  
- **src/main/java/com/luv2code/springsecurity/demo/entity/Role.java**
  - Entity class representing user roles.
  - Stores role information to be associated with users.
  
- **src/main/java/com/luv2code/springsecurity/demo/service/UserService.java**
  - Service interface for user-related operations.
  - Defines methods for finding users by username and saving users.
  
- **src/main/java/com/luv2code/springsecurity/demo/user/CrmUser.java**
  - DTO (Data Transfer Object) class for user registration form data.
  - Used for validating and transferring registration form data.
  
- **src/main/resources/templates/**
  - Directory containing Thymeleaf template files for various pages.
  - Includes templates for login, registration, home, leaders, systems, and more.
  
- **src/main/resources/application.properties**
  - Properties file containing application-specific configurations.
  - Includes database configurations, Spring Security settings, and more.

## Usage

1. Clone or download this repository.
2. Set up your database configurations in `application.properties`.
3. Run the application using your preferred method (e.g., Spring Boot's `mvn spring-boot:run`).
4. Access the application in your web browser.

## Features

- User registration with input validation.
- Secure login using Spring Security.
- Role-based access control for different user roles.

## Credits

This project is based on the tutorial and guidance provided by [Luv2Code](https://www.luv2code.com/).

![Registration](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/da3f2543-4815-4a9a-a9ac-18aedcfc8dec)

![Registration Successful](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/c904f860-36c5-46be-a64b-ccc0fe944973)

![Login Page](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/f42b10f2-703d-443d-8d92-7a29b9f1a596)

![User Employee Details](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/0c336d64-a3fd-4a6e-924e-d88274d326a7)

![Login - Manager Role](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/70a42f59-b832-4aa5-910a-cd3002969fe9)

![User Manager Details](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/72e9e973-a3e6-447f-98a5-3a9e1e9ca6c9)

![Manager Page](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/7c8f0810-078f-4e7b-a8cf-7ecf7a72d990)

![Admin Page](https://github.com/billmazio/spring-security-custom-user-registration/assets/116730698/0da175d4-6416-4786-bd1c-444f16c198e8)


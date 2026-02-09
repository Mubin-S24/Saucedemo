# Selenium Test Automation Framework (Data-Driven)



## Project Overview 

The project is a Selenium WebDriver automation framework built using JAVA, TestNG, Apache POI, and Page object Model (POM). 
It demonstrates data-driven testing by reading login test data from an Excel file and validating the login functionality of a web application.

The framework is scalable, maintainable, and configurable, making it suitable for real-world automation projects.



## Tech Stack 

* Java
* Selenium WebDriver
* TestNG
* Apache POI (Excel handling)
* WebDriverManager
* Maven (dependency management)



## Framework Design

* Page Object Model (POM) - 
  	Separates UI locators and actions from test logic.
  
* Data-Driven Testing - 
  	Uses Excel (.xlsx) as a data source via TestNG @DataProvider.
  
* Configuration Management - 
  	Browser, URL and test data paths are externalised in config.properties.
  
* Reusable Base Class - 
  	WebDriver setup and teardown handled centrally



## Supported Browsers 

*  Chrome
*  Firefox
  
(Change browser value without touching code)



## How to Run the Tests

1. Prerequisites
* Java 8 or higher.
* Maven installed.
* Internet connection (for WebDriverManager)
  
2. Run Using TestNG XML
   (Bash)
   mvn test
   
3. Run from IDE
*     Open testng.xml
*     Right-Click -> Run



## Test Execution Flow 

1. TestNG reads testng.xml
2. BaseTest initializes WebDriver
3. DataProvider reads test data from excel
4. Test executes once per Excel row
5. Assertions validates expected vs actual results
6. Browser closes after each test



## Key Features 

*  Data-driven testing with Excel
*  Cross-browser execution
*  Reusable Page Objects
*  Centralized configuration
*  Clean test lifecycle management

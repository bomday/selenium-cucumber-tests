<h1 align="center"> Selenium - Java (Cucumber) with chrome driver  </h1> <br>

<p align="center">
  Description: This is a demo testcase on java tech with cucumber and selenium test. There are couple testcases ( 2 automation scripts ): which validates the business scenarios.
</p>

## Table of Contents

- [Introduction](#introduction)
- [Requirements](#requirements)
- [Structure](#structure)
- [Quick Start](#quick-start)

## Introduction
- This is a demo testcase on java tech with cucumber and selenium test;
- This simple test is to validate the product page is appearing post login on the sample application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html;

## Requirements

<b> Test Scenario 1: </b>
1. Open up google chrome browser (This project has google chrome driver version 115- which is installed and setup as path)
2. Launch the application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html#
3. Click on the hamburger menu
4. Click on 'SignIn Portal'
5. Enter the username
6. Enter the password
7. Click on Login button
8. Verify if the Product Category name is matching with expected.
   The application can be run locally.

<b> Test Scenario 2: </b>
1. Open up google chrome browser (This project has google chrome driver version 115- which is installed and setup as path)
2. Launch the application: https://anupdamoda.github.io/AceOnlineShoePortal/index.html#
3. Click on the hamburger menu
4. Click on 'SignIn Portal'
7. Click on 'New User? Register here' button
8. Verify if the user lands on the User Registration Page
   The application can be run locally.

## Structure

````
Web Automation Framework
└── src
    ├── main
    └── test
        ├── java
        │   ├── features                          -------> Stores the scenarios
        │   │   ├── LoginUser.feature
        │   │   └── NewUser.feature
        │   ├── pages                             -------> Stores the xpaths for elements within a specific page 
        │   │   ├── HomePage.java
        │   │   ├── ProductCategoryPage.java
        │   │   ├── RegistrationPage.java
        │   │   └── SignInPage.java
        │   ├── runner                            -------> Where the scenarios are executed
        │   │   └── TestRunner.java
        │   ├── stepDefinition                    -------> Stores steps within a specific page 
        │   │   ├── BasePage.java
        │   │   ├── ProductCategoryPage.java
        │   │   ├── RegistrationPage.java
        │   │   └── SignInPage.java
        │   ├── utils                             -------> Stores the initializations
        │   │   ├── BrowserDriver.java
        │   │   └── Hooks.java
        └── resources
            └── drivers                           -------> Stores the drivers
                └── chromedriver.exe

````

### Local
* [Java 17 SDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [ChromeDriver](https://googlechromelabs.github.io/chrome-for-testing/) 

## Quick Start 
````
command: mvn test
````

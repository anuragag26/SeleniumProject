# Advantage Online Shopping Automation Framework

## Overview

This project is a Selenium Automation Framework developed using Java, Maven, TestNG, and Extent Reports.

Website Tested:

[https://www.advantageonlineshopping.com/#/](https://www.advantageonlineshopping.com/#/)

---

## Technologies Used

* Java
* Selenium WebDriver
* Maven
* TestNG
* Extent Reports
* Page Object Model (POM)

---

## Automated Test Cases

### 1. Home Page Verification

* Open website
* Verify page title

### 2. Speakers Page Verification

* Open Speakers category
* Verify products displayed

### 3. Login Automation

* Enter username/password
* Verify successful login

### 4. Add To Cart Automation

* Open product
* Add item to cart
* Verify cart updated

---

## Project Structure

```text
src/test/java
│
├── pageobjects
├── testcases
└── utilities
```

---

## Run The Project

1. Import project as Maven Project
2. Update Maven dependencies
3. Run `testng.xml` as TestNG Suite

---

## Report

Execution report generated at:

```text
TestResults/testresults.html
```

---

## Author

Anurag Agrawal

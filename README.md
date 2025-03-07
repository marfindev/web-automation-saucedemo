
# Web Automation - SauceDemo

## Introduction
This project is an automated test suite for the **SauceDemo** website using **Java**, **Selenium WebDriver**, and **Cucumber BDD** framework. It covers various scenarios including login functionality, product selection, and cart interactions.

The project follows a structured automation framework to ensure maintainability and scalability of test cases.

---

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Running Tests](#running-tests)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

---

## Installation
### Prerequisites
- Java Development Kit (JDK) 11 or later
- Apache Maven
- IntelliJ IDEA (or any preferred IDE)
- Google Chrome browser
- ChromeDriver (included in `driver` folder)

### Steps
1. Clone this repository:
    ```bash
    git clone <repository-url>
    ```
2. Open the project in your IDE.
3. Ensure Maven dependencies are installed using:
    ```bash
    mvn clean install
    ```
4. Set up ChromeDriver path if necessary (see Configuration section).

---

## Usage
You can execute the test cases using Maven commands, either directly or through the IDE.

### Example Command
```bash
mvn test
```

---

## Features
- Automated login scenarios
- Product selection and cart management
- BDD-style test cases using Cucumber
- Integration with Selenium WebDriver
- Modular page-object design for better maintainability

---

## Project Structure
```
src/
├── main/
│   └── java/
│       └── id/marfin/
│           └── App.java          // Main entry class (not directly used for tests)
├── test/
│   ├── java/
│   │   ├── StepDef/
│   │   │   └── SauceDemoSteps.java  // Step definitions for Cucumber scenarios
│   │   └── TestRunner/
│   │       └── TestRunner.java     // Cucumber test runner
│   └── resources/
│       └── features/
│           └── saucedemo.feature  // Feature file describing test scenarios
└── driver/
    └── chromedriver.exe          // ChromeDriver binary
```

---

## Dependencies
This project uses the following main dependencies (declared in `pom.xml`):
- **Selenium WebDriver**: Browser automation library
- **Cucumber-Java**: BDD framework
- **JUnit**: Test runner
- **Maven Compiler Plugin**: Ensures proper Java version compatibility

---

## Configuration
### ChromeDriver
The `chromedriver.exe` file is located in the `driver` directory. If using a different OS (Linux/Mac), you need to replace it with the appropriate version.

You can also set the `webdriver.chrome.driver` property dynamically in the step definitions if necessary:
```java
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
```

---

## Running Tests
### Using Maven
```bash
mvn test
```

### Using IDE
- Open `TestRunner.java`.
- Right-click and select **Run**.

---

## Examples
### Sample Feature Scenario
```gherkin
Feature: SauceDemo Login

  Scenario: Valid Login
    Given user navigates to SauceDemo login page
    When user enters valid username and password
    And user clicks login button
    Then user should be redirected to homepage
```

---

## Troubleshooting
- **Chromedriver version mismatch**: Make sure the Chrome browser version matches the `chromedriver` version.
- **Element not found exceptions**: Confirm locators are still valid (SauceDemo site updates could break locators).
- **Build issues**: Run `mvn clean install -U` to force update dependencies.

---

## Contributors
- **Marfin (Author)**

---

## License
This project is licensed under the **MIT License**. See the `LICENSE` file for details (if applicable).

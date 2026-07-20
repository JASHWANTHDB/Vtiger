# Vtiger
Built a Selenium Automation Framework for VTiger CRM using Java, Selenium WebDriver, TestNG, and Maven. Implemented the Page Object Model (POM), Data-Driven Testing with Apache POI, reusable utility classes, and automated end-to-end test scenarios for Login, Leads, Contacts, and Organizations.

# VTiger CRM Selenium Automation Framework

A Selenium Automation Framework developed for **VTiger CRM** using **Java, Selenium WebDriver, TestNG, and Maven**. This project follows the **Page Object Model (POM)** design pattern to build reusable, maintainable, and scalable test automation scripts for web application testing.

## 🚀 Features

- Automated test scenarios for:
  - Login
  - Organizations
  - Contacts
  - Leads
  - Products
  - Campaigns
- Page Object Model (POM) architecture
- Data-Driven Testing using Apache POI
- TestNG framework for test execution
- Maven for dependency management
- Reusable utility classes
- Configuration through Properties files
- Screenshot capture on test failure
- Git version control

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Apache POI
- Git & GitHub
- Eclipse IDE

## 📂 Project Structure

```
VTiger/
├── src/
│   ├── main/java/
│   │   ├── ObjectRepository/
│   │   └── GenericUtilities/
│   ├── test/java/
│   │   └── TestScripts/
│   └── test/resources/
│       ├── commonData.properties
│       └── TestData.xlsx
├── screenshots/
├── pom.xml
└── testng.xml
```

## ▶️ Prerequisites

- Java JDK 8 or above
- Maven
- Eclipse/IntelliJ IDEA
- Google Chrome
- ChromeDriver (compatible with Chrome version)

## ⚙️ Installation

1. Clone the repository

```bash
git clone https://github.com/<your-username>/<repository-name>.git
```

2. Navigate to the project

```bash
cd <repository-name>
```

3. Install dependencies

```bash
mvn clean install
```

## ▶️ Run Tests

Run all TestNG tests:

```bash
mvn test
```

Or execute using the TestNG XML file from your IDE.

## 📊 Framework Highlights

- Page Object Model (POM)
- Data-Driven Testing
- Reusable Utilities
- Cross-browser ready architecture
- Easy maintenance and scalability

## 📖 Learning Outcomes

- Selenium WebDriver automation
- TestNG framework
- Maven project management
- Page Object Model implementation
- Data-Driven Testing with Apache POI
- Software Testing best practices

## 👨‍💻 Author

**Jashwanth D B**

- GitHub: https://github.com/JASHWANTHDB
- LinkedIn: https://www.linkedin.com/in/<your-linkedin-profile>

---

⭐ If you found this project useful, consider giving it a star!

# Selenium Automation Project

Project Name: kartiksharma200-15-03-2025-selenium-automation

Description

This project is designed for automating various web testing scenarios using Selenium WebDriver with TestNG. It includes handling different test cases such as data-driven testing, file uploads, iframe handling, and window handling. Additionally, API testing is performed using Postman.

# Features

* Data-Driven Testing: Fetch data from an Excel file to use in test cases.
* File Upload Automation: Automate file uploads in a web application.
* Iframe Handling: Switch between iframes and perform actions within them.
* Window Handling: Manage multiple browser windows and tabs.
* API Testing with Postman: Validate REST API requests using Postman.

# Project Structure
~~~
 kartiksharma200-15-03-2025-selenium-automation/
 ├── README.md
 ├── 15-03-2025_Assignment/
 │   ├── pom.xml
 │   ├── testng.xml
 │   ├── src/
 │   │   └── test/
 │   │       └── java/
 │   │           └── com/
 │   │               ├── fetchDataFromExcel/
 │   │               │   └── fetchData.java
 │   │               ├── fileUpload/
 │   │               │   └── FileUpload.java
 │   │               ├── iframeHandle/
 │   │               │   └── iframeHandle.java
 │   │               └── windowHandle/
 │   │                   └── windowHandle.java
 │   └── target/
 │       ├── classes/
 │       ├── test-classes/
~~~
# Tools & Technologies Used

* Selenium WebDriver - For automating web browser interactions.
* TestNG - For test execution and reporting.
* Maven - For dependency management and build automation.
* Postman - For API testing and validation.
* Java - Programming language for writing test scripts.

# Setup Instructions

Clone this repository:
~~~
git clone https://github.com/yourusername/kartiksharma200-15-03-2025-selenium-automation.git
~~~
Navigate to the project directory:
~~~
cd kartiksharma200-15-03-2025-selenium-automation/15-03-2025_Assignment
~~~
Install dependencies using Maven:
~~~
mvn clean install
~~~
Run tests using TestNG:
~~~
mvn test
~~~
# Author

Kartik Sharma

# License

This project is licensed under the MIT License.

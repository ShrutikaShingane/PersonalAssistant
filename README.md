Personal Assistant Console Application
📌 Project Overview
The Personal Assistant is a Java-based console application built using Apache Maven. It is designed to act as a simple digital assistant that performs daily tasks such as fetching real-time weather updates, executing basic mathematical calculations, and managing text notes. The application emphasizes robust error handling and system logging.

🚀 Key Features
Weather Lookup: Fetches and displays the current weather for any given city using a live API.

Simple Calculator: Performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division).

Note Taking: Allows users to create and save notes locally to a text file (my_notes.txt).

Robust Logging: Utilizes java.util.logging to track user actions, successful operations, and errors.

Exception Handling: Implements comprehensive try-catch blocks to prevent application crashes from invalid inputs (e.g., text instead of numbers) or system errors (e.g., network failure).

🛠️ Technology Stack
Language: Java (JDK 17 or higher)

Build Tool: Apache Maven

Libraries: Google Gson (v2.10.1)

API: wttr.in (Free Weather API)

📁 Project Architecture
The application is modularized into the following core components:

Main.java: The entry point of the application. Handles the console UI, user input routing, and the main application loop.

WeatherService.java: Handles HTTP requests to the weather API and processes the response.

Calculator.java: Contains the mathematical logic and specific error handling for operations like division by zero.

NotesManager.java: Manages File I/O operations to persist user notes into a local text file.

⚙️ How to Run the Application
Prerequisites
Java Development Kit (JDK 17+)

Apache Maven installed and configured in your system environment variables.

An active internet connection (for the Weather feature).

Method 1: Running via Command Line (Recommended)
Open your terminal or command prompt.

Navigate to the root directory of this project (where the pom.xml is located).

Compile and package the application using Maven:

bash
mvn clean package
Once the build is successful, navigate to the target folder and run the executable JAR file:

bash
java -jar target/PersonalAssistant-1.0.jar
Method 2: Running via IDE (Eclipse)
Open Eclipse and go to File > Import > Maven > Existing Maven Projects.

Select the project directory and click Finish.

Open Main.java, right-click anywhere in the code editor, and select Run As > Java Application.

📝 Usage
Upon successful execution, the console will display the following main menu:

text
=== MAIN MENU ===
1. Check Weather
2. Use Calculator
3. Take a Note
4. Exit
Enter your choice (1-4): 
Enter 1, 2, 3, or 4 to navigate through the features.

When a note is saved (Option 3), a my_notes.txt file will be automatically generated in the project's root directory.
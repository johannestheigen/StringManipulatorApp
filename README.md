# String Manipulator Application v 1.0

Developed by **Johannes Nupen Theigen**

## Project Description

This project is a mandatory assignment
in the course IDATG2003 - Programming 2 at NTNU. The
assignment is about creating a program that can manipulate
strings in different ways. The program is written in Java
and developed in IntelliJ IDEA IDE. 

## Project Structure
The unit tests are located in the test folder, in  packages matching the unit classes.
The source code is packaged in the main folder.

There are five packages in the main folder:

- **`app`**: Contains the `UserInterface` class and the `Main` class.
- **`commands`**: Contains all the different command classes
- **`util`**: Contains utility classes for input reading and printing.

## How to run the project
The user can run the program
in the command prompt by navigating to the project folder and
running the following commands:`javac filename.java` to compile the project.
and the command `java filename` to run the project.

## How to run the tests
The unit tests are managed with Apache Maven.
JUnit5 dependencies are specified in the pom.xml file.

To run the tests:

In IntelliJ, use the Maven plugin and select the test phase in the Build Lifecycle.
Alternatively, `run mvn` test in the terminal
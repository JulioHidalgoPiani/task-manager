# TaskManager

**TaskManager** is a command-line interface (CLI) application designed for task management. It allows you to perform CRUD operations (Create, Read, Update, Delete) on tasks in a simple way, with data persistence in a local JSON file.

This project is developed in Java SE and uses Jackson libraries for handling object serialization and deserialization.

## Features

- **CRUD**: Allows creating, listing, updating, and deleting tasks.
- **Persistence**: Task data is stored in a JSON file.
- **Command-line Interface (CLI)**: User interaction through the terminal.

## Technologies

- **Java SE**: The primary language for developing the application.
- **Jackson**: A library for serializing and deserializing Java objects to and from JSON.
  
- **Swing/JavaFX** (optional): For future implementation of a graphical user interface (GUI).

## Requirements

Before running the project, ensure you have the following prerequisites installed:

- **Java 17 or higher**: Required to run the project.
- **Jackson Libraries**: The Jackson dependencies must be present in the project. If you're not using a dependency manager like Maven or Gradle, the required `.jar` libraries are:
  - `jackson-core-2.18.1.jar`
  - `jackson-databind-2.18.1.jar`
  - `jackson-annotations-2.18.1.jar`

  These libraries should be placed in the `libs/` folder.

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/<user>/TaskManager.git
   cd TaskManager

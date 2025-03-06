# Task Tracker

## Overview
Task Tracker is a simple and efficient application for managing tasks. It allows users to create, update, and delete tasks while storing them persistently. This project is built using Java and follows an Object-Oriented Programming (OOP) approach.

## Features
- Add new tasks with a title and description
- View all tasks in a structured format
- Update task details
- Delete completed or unwanted tasks
- Save tasks in a JSON format for persistence

## Technologies Used
- Java (Core Java, Collections Framework)
- JSON for data storage
- File Handling for saving tasks persistently

## Installation
### Prerequisites
Ensure you have the following installed on your system:
- Java JDK 8 or later
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Steps to Set Up
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/task-tracker.git
   ```
2. Navigate to the project directory:
   ```sh
   cd task-tracker
   ```
3. Open the project in your preferred IDE.
4. Compile and run the Java application:
   ```sh
   javac TaskTracker.java
   java TaskTracker
   ```

## Usage
1. Run the application.
2. Choose an option from the menu:
   - Add a task
   - View all tasks
   - Edit a task
   - Delete a task
   - Exit the application
3. Follow on-screen prompts to manage tasks effectively.
4. Task data is stored in a JSON file for persistence.

## Project Structure
```
TaskTracker/
│── src/
│   ├── main/
│   │   ├── java/com/akshay/tasktracker/
│   │   │   ├── cli/
│   │   │   │   ├── TaskTrackerCli.java     # Manages all command-line operations
│   │   │   ├── models/
│   │   │   │   ├── Task.java               # DTO representing a task
│   │   │   ├── service/
│   │   │   │   ├── TaskService.java        # Interface defining task operations
│   │   │   │   ├── TaskServiceImpl.java    # Implementation of TaskService
│   │   │   ├── repository/
│   │   │   │   ├── TaskRepository.java     # Interface for data operations
│   │   │   │   ├── TaskRepositoryImpl.java # Implementation of TaskRepository
│   │   │   ├── utils/
│   │   │   │   ├── JsonUtil.java           # JSON utility functions (parse and convert tasks)
│── tasks.json                              # JSON file for storing tasks
│── README.md                               # Documentation
```

## Contributing
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature-branch
   ```
3. Commit your changes:
   ```sh
   git commit -m "Add new feature"
   ```
4. Push to your branch:
   ```sh
   git push origin feature-branch
   ```
5. Open a Pull Request.

## License
This project is licensed under the MIT License.

## Contact
For any questions or suggestions, feel free to reach out:
- GitHub: [Akshayknchalapalli](https://github.com/Akshayknchalapalli)
- Email: akshaysmart31@gmail.com

---
Happy coding! 🚀


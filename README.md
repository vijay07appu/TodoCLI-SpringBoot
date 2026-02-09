📝 Task Manager CLI Application

A Java-based Command Line Task Manager that allows users to manage daily tasks efficiently using a simple, menu-driven interface.
The application supports full CRUD operations, task filtering, and persistent storage using JSON files.

📌 Features

✔ Add new tasks
✔ View all tasks
✔ Update existing tasks
✔ Delete tasks
✔ Filter tasks by status (Pending / Completed)
✔ Persistent storage using JSON
✔ User-friendly CLI menu
✔ Proper application runner
✔ Error handling for invalid inputs

🛠️ Technologies Used

Java (Core Java)
JSON
File I/O
OOP Principles
Git & GitHub

📂 Project Structure
task-manager-cli/
│
├── src/
│   ├── model/
│   │   └── Task.java
│   ├── service/
│   │   └── TaskService.java
│   ├── runner/
│   │   └── TaskManagerRunner.java
│   └── util/
│       └── FileUtil.java
│
├── data/
│   └── tasks.json
│
├── README.md
└── .gitignore

▶️ Runner File (Entry Point)

TaskManagerRunner.java is the main entry point of the application.
Responsibilities:
Starts the application
Displays the CLI menu
Accepts user input using Scanner
Calls appropriate service methods
Controls application flow until Exit

📄 Task Model
Each task contains:
id – Unique task identifier
title – Task title
description – Task description
status – Pending / Completed

🔁 Application Workflow
Application starts from TaskManagerRunner
Existing tasks are loaded from tasks.json
Menu is displayed to the user
User selects an operation
TaskService handles business logic
Updated data is saved back to JSON
Application exits only when user chooses Exit

📜 Menu Options
1. Add Task
2. View All Tasks
3. Update Task
4. Delete Task
5. View Tasks by Status
6. Exit

🚀 How to Run the Project
1️⃣ Clone the Repository
git clone https://github.com/your-username/task-manager-cli.git

2️⃣ Navigate to Project Directory
cd task-manager-cli

3️⃣ Compile the Runner File
javac src/runner/TaskManagerRunner.java

4️⃣ Run the Application
java src.runner.TaskManagerRunner

💾 Data Persistence
Tasks are stored in a JSON file
Data remains after restarting the application
No external database required


🔧 Git Workflow
git init
git add .
git commit -m "Initial commit"
git remote add origin <repository-url>
git push -u origin main



👨‍💻 Author
Vijay JD


Resume bullet points

Just say 👍

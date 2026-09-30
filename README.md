# Overview

Kotlin Study Planner is a console-based application I developed to strengthen my skills in Kotlin programming and object-oriented programming concepts. The application provides a simple way for users to create, view, complete, and delete study tasks.

The software is built with Kotlin and uses a Gradle-based Kotlin/JVM project. Study tasks are represented using a Kotlin data class, while a mutable collection is used to store and manage the tasks during the program's execution. The application uses a menu-driven interface that allows users to interact with their study tasks through the console.

The project demonstrates fundamental Kotlin programming concepts, including variables, expressions, conditionals, loops, functions, classes, collections, data classes, and `when` expressions.

# Purpose

The purpose of writing this software was to gain practical experience with Kotlin and strengthen my understanding of programming concepts that can be applied to larger software projects. I wanted to learn how Kotlin handles data, collections, conditions, loops, and object-oriented structures while building a useful application.

I also used a continuous-learning approach by developing the application in smaller features. I first learned the basic Kotlin syntax and program structure, then added the study task data structure, user input, menu options, task viewing, completion, and deletion functionality.

Youtube Video:
https://youtu.be/_eYjU8ZupXw 

# Application Features

The Study Planner provides the following features:

* **Add study task** – Allows the user to create a new study task by entering a title, subject, and due date.
* **View study tasks** – Displays all study tasks currently stored in the application.
* **Mark task as completed** – Allows the user to find a task by its title and change its completion status.
* **Delete study task** – Allows the user to find and remove a study task.
* **Exit** – Allows the user to safely exit the application.
* **Input validation through menu conditions** – Handles invalid menu selections by displaying an appropriate message.

# Kotlin Concepts Demonstrated

## Variables

The application demonstrates both immutable and mutable variables.

* **`val`** – Used for values that should not be reassigned, such as task titles, subjects, and due dates.
* **`var`** – Used for the `completed` property because the value changes when a study task is marked as completed.

## Expressions

The application uses expressions to compare values, assign values, and construct output using string templates.

For example, the application searches for a task by comparing the entered title with the title stored in a study task.

## Conditionals

The application uses `if` and `else` statements to make decisions.

For example, before displaying or modifying tasks, the program checks whether the task collection is empty. It also checks whether a requested task was found.

## Loops

The application uses loops to control repeated actions.

A `while` loop keeps the study planner menu running until the user chooses to exit. A `for` loop is used to go through the stored study tasks when displaying them.

## Functions

The application uses the Kotlin `main()` function as the entry point of the program. The program's functionality is organized within the main program flow.

## Classes and Data Classes

The application uses a Kotlin data class called `StudyTask` to represent each study task.

Each study task contains:

* **`title`** – Name of the study task
* **`subject`** – Subject or technology being studied
* **`dueDate`** – Date the task is due
* **`completed`** – Indicates whether the task has been completed

The `completed` property is mutable so that the application can update it from `false` to `true`.

## Collections

The application uses a mutable list to store `StudyTask` objects.

The collection allows the program to:

* Add new study tasks
* Search for existing tasks
* Display stored tasks
* Remove tasks

## `when` Expression

The application uses a Kotlin `when` expression to process the user's menu selection.

Each menu option corresponds to a different action, such as adding, viewing, completing, or deleting a study task. An `else` branch handles invalid menu selections.

# Development Environment

## Development Tools

* **IntelliJ IDEA** – Primary code editor and development environment used to create, run, and manage the Kotlin project.
* **Git** – Us

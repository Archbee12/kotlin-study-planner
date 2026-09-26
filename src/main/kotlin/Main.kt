//fun is used to declare a function, the main() function is where the program starts from
//The body of a function is written inside the curly braces {}
//println() prints something and moves to the next line
//print() prints something but keeps the cursor on the same line

fun main() {

  // Creates an empty list that can store StudyTask objects.
  val tasks = mutableListOf<StudyTask>()

  while(true) {
    println("===== STUDY PLANNER =====")
    println("1. Add study task")
    println("2. View study tasks")
    println("3. Mark task as completed")
    println("4. Delete study task")
    println("5. Exit")

    print("Enter your choice: ")

    val choice = readln()

    when(choice) {
      "1" -> {
//        Ask the user for the information of the study task
        print("Enter task title: ")
        val title = readln()

        print("Enter task subject : ")
        val subject = readln()

        print("Enter task dueDate: ")
        val dueDate = readln()

//        print("Enter task completed : ")
//        val completed = readln()

        // Create a study-task using the info entered by the user.
        val task = StudyTask(
          title = title,
          subject = subject,
          dueDate = dueDate,
        )

        //Adds the newly creaed task to the list.
        tasks.add(task)

//       // Display the task that was created
        println("Task added successfully")
        println("Title: ${task.title}")
        println("Subject : ${task.subject}")
        println("DueDate: ${task.dueDate}")
        println("Completed: ${task.completed}")
      }

      // Display Tasks
      "2" -> {
        // Check whether there are any tasks in our list.
        if (tasks.isEmpty()) {
          // Tell the user when there are no tasks to display.
          println("No tasks found")
        } else {
          println("==== YOUR STUDY TASKS =====")

          // Go through each task in the list.
          for (task in tasks) {
            println("Title: ${task.title}")
            println("Subject : ${task.subject}")
            println("DueDate: ${task.dueDate}")
            println("Completed: ${task.completed}")
            println()
          }
        }
      }

      // Update an existing task completed status
      "3" -> {
        // Finds a study task and marks it as completed.
        if (tasks.isEmpty()) {
          println("No study tasks found.")
        } else {
          println("Enter the title of the task you completed: ")
          val title = readln()

          val task = tasks.find { it.title == title }

          if (task != null) {
            task.completed = true
            println("Task marked as completed!")
          } else {
            println("Task not found.")
          }
        }
      }

      // Delete an existing task
      "4" -> {
        if (tasks.isEmpty()) {
          println("No study tasks found.")
        } else {
          println("Enter the title of the task to delete: ")
          val title = readln()

          val task = tasks.find { it.title == title }

          if (task != null) {
            tasks.remove(task)
            println("Task deleted successfully")
          } else {
            println("Task not found.")
          }
        }
      }
      "5" -> {
        println("Goodbye!")
        break
      }

      else -> println("Invalid choice. Please select 1-5.")
    }
  }
}


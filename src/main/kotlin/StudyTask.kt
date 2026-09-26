// This creates a type of object that represents one study task in our planner
// It stores the studytask information and it's types.
data class StudyTask(
    val title: String,
    val subject: String,
    val dueDate: String,
    var completed: Boolean = false
)

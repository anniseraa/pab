object AppConfig {
    const val MAX_COURSES = 5
}

enum class CourseStatus { ACTIVE, COMPLETED }

data class Course(
    val code: String,
    val name: String,
    val status: CourseStatus
) {
    companion object {
        const val PREFIX = "PAB"
    }
}

fun Course.displayInfo(): String = "$code - $name - $status"

fun MutableList<Course>.addCourse(course: Course): Boolean {
    if (size < AppConfig.MAX_COURSES && course.code.startsWith(Course.PREFIX)) {
        add(course)
        return true
    }
    return false
}

fun main() {

    val courses = mutableListOf(
        Course("PAB101", "Mobile App Development", CourseStatus.ACTIVE),
        Course("PAB102", "Kotlin", CourseStatus.ACTIVE)
    )

    val course1 = Course(
        "PAB103",
        "Pemrograman Android",
        CourseStatus.ACTIVE
    )

    val course2 = Course(
        "PSI101",
        "Pengembangan Sistem Informasi",
        CourseStatus.ACTIVE
    )

    println(courses.addCourse(course1))
    println(courses.addCourse(course2))

    for (course in courses) {
        println(course.displayInfo())
    }
}

enum class CourseStatus { ACTIVE, COMPLETED, DROPPED }

data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun describe(status: CourseStatus): String = when (status) {
    CourseStatus.ACTIVE -> "Mata kuliah sedang aktif"
    CourseStatus.COMPLETED -> "Mata kuliah sudah selesai"
}

fun main() {
    
    val course = mutableListOf(
        Course("A101", "PAB", CourseStatus.ACTIVE),
        Course("B101", "SJK", CourseStatus.COMPLETED),
        Course("B102", "PSI", CourseStatus.COMPLETED)
    )
    
    course.add(Course("A102", "PAIM", CourseStatus.ACTIVE))
    course.remove(Course("B102", "PSI", CourseStatus.COMPLETED))
    
    for (c in course){
        println(c.displayInfo())
        println(describe(c.status))
    }
    
    val (code, name, status) = course[1]
    
    println("$code - $name - $status")
    
}

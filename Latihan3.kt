fun main() {
    
    val skills = mutableSetOf("Kotlin", "Java")
    
    skills.add("Python")
    skills.add("Kotlin")
    
    println(skills.size)

    println("Swift" in skills)
    println("Python" in skills)
    
    //Kotlin tidak menambah ukuran Set karena Kotlin sudah ada
}

fun main() {

    val scores = mutableMapOf<Int, Int>(
        101 to 80,
        102 to 75,
        103 to 90
    )

    scores[102] = 85

    scores.remove(103)

    for ((nim, score) in scores) {
        println("$nim - $score")
    }

    println(scores[104])
}

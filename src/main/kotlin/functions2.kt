fun main(args: Array<String>) {
    //создание списка,разделение и повторное объединение с помощью zip()
    val fullName = mutableListOf<String>()
    for (i in 1..15) {
        fullName.add("Surname$i Name$i")
    }
    val surnames = fullName.map { it.substringBefore(" ") }
    val names = fullName.map { it.substringAfter(" ") }

    val newFullName = names.zip(surnames) { a, b -> "$a = $b" }
    //println(newFullName)

    val data = mapOf<String, List<Int>>(
        "File1" to listOf(8, 12, 25, 2),
        "File2" to listOf(4, -12, 13, 2),
        "File3" to listOf(8, 7, 25, -2),
        "File4" to listOf(8, 12, 16, 20)
    )
    //average больше 0 , меньше 25
    val avg = data.flatMap { it.value }.filter { it > 0 }.average()
    val avgBefore25 = data.flatMap { it.value }.filter { it < 25 }.average()
    println(avg)
    println(avgBefore25)

    // использовала unzip()
    val dataList = data.toList()
    println( dataList.unzip() )
}
fun main(args: Array<String>) {
    //рандомная коллекция <Int> и преобразование в <String>

    val randomCollectionNumbers = arrayListOf<Int>()
    for (index in 0..999) {
       randomCollectionNumbers.add(index,(0..1000).random())
    }

   /* val result = randomCollectionNumbers.run {
        this.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }
    }.sortedDescending().map { "$it" }

    for (i in result){
        println(i)
    }*/
        //пузырьковая сортировка
   bubbleSortDescendingNumbers(randomCollectionNumbers)
    println(randomCollectionNumbers)



    //бесконечная послед-ть строк
   /* val employeeSequence = generateSequence(0) {
        println("Employee ${it +1}")
        it + 1
    }
    val employees = employeeSequence.take(100)
    for (i in employees){
        println(i)
    }*/

    //массив строк - "Фамилия Имя"
   /* var arraySurname = arrayOf<String>()
    for (i in 1..10){
        arraySurname += "Surname $i"
    }
    var arrayName = arrayOf<String>()
    for (i in 1..10){
        arrayName += "Name $i"
    }
        //первый способ
   val arrayFullName = arraySurname.zip(arrayName)
    for (i in arrayFullName){
        println(i)
    }

        //2й способ
    val arrayFullName2 = mutableMapOf<String,String>().apply {
        for (j in arraySurname.indices) this[arraySurname[j]] = arrayName[j]
    }
    for (m in arrayFullName2){
        println(m)
    }*/

}

fun bubbleSortDescendingNumbers(collection :ArrayList<Int> )  {
    var bigger:Int
    var checkCollection:ArrayList<Int>
    var sort = false

    while (!sort) {
        sort = true

        for (index in 0..<(collection.size - 1)) {
            if (collection[index + 1] > collection[index] ) {
                bigger = collection[index + 1]
                collection[index + 1] = collection[index]
                collection[index] = bigger
                sort = false
            }
        }

    }
}
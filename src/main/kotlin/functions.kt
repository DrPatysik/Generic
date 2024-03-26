fun main(args: Array<String>) {
    //
    val square: (Int) -> Int = { it * it }
    println(square(3))

    //1st
    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(3, 5))

    //2nd
    val greeting: (String) -> Unit = { println("Hello, $it!") }
    greeting("Anna")

    //3rd
    var listOfNumbers = arrayOf<Int>()
    for (i in 0..99) {
        listOfNumbers += i
    }
    listOfNumbers.forEach { println(it) }

    //работает,но не уверена правильно ли сделала
    val listOfDecreasingNumbers: (Array<Int>) -> Array<Int> = { it.reversedArray() }

    for (i in listOfDecreasingNumbers(listOfNumbers)){
        println(i)
    }

    //фильтрация коллекций
    val namesCollection = arrayListOf<String>(
        "Sasha","Kolya", "Sonya", "Alena", "Alex", "Masha", "Vera")
     val namesBeginningWithA = namesCollection.filter { it.startsWith("A") }
    for (i in namesCollection){
        println(i)
    }
    println("**************")
    for (j in namesBeginningWithA){
        println(j)
    }

}
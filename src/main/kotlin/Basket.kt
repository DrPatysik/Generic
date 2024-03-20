class Basket<Fruit>() {
    private var myArrayFruit = arrayListOf<Fruit>()
    private var weightBasket = 0.0
    private var size:Int = 0


    fun size():Int{
        return myArrayFruit.size
    }

    fun addFruit (element:Fruit)  {
            myArrayFruit.add(element)

            if (element is Apple) {
                weightBasket += Apple().weight
            }
            if (element is Orange) {
                weightBasket += Orange().weight
            }
    }


    //еще не готово
    fun getOutFruit( vararg elements:Fruit)
     {
        //это все было без vararg ,если удалять только 1 элемент
       /* myArrayFruit.removeAt(0) //так работает,удаляет элемент и уменьшается список

      println( myArrayFruit.contains(elements) )  //тут выяснила,что в списке у меня не содержится elements

         if (myArrayFruit.size > 0) {
            myArrayFruit.removeIf { elements == Orange() } // нет ошибки,но не удаляет
            myArrayFruit.removeAt(myArrayFruit.indexOf(elements)) // выдает ошибку,так как в списке не видит добавленные элементы
            myArrayFruit.remove(elements)  // выдает ошибку,причина как выше
            myArrayFruit.lastIndexOf(elements)  // тоже ошибка
        } else throw IndexOutOfBoundsException()

        myArrayFruit.forEach { i -> println(i) }*/

         if (myArrayFruit.size > 0) {
             for (element in elements) {
                 for (fruit in myArrayFruit) {
                     if (element is Apple == fruit is Apple ) {
                        // myArrayFruit.removeIf { fruit == Apple() }  //нет ошибки,не удаляет
                         myArrayFruit.removeAt(myArrayFruit.indexOf(fruit))  //опять ошибку выдает (ConcurrentModificationException)
                        size-- //не срабатывает
                         weightBasket -= Apple().weight
                         println( myArrayFruit.contains(fruit) ) //фрукты тут есть,как и должно быть
                     }
                     else if (element is Orange ) {
                         myArrayFruit.removeIf { fruit == Orange() }
                         println( myArrayFruit.contains(fruit) )
                         size--
                         weightBasket -= Orange().weight
                     }

                 }
             }
         }
         else throw IndexOutOfBoundsException()
    }


    fun getWeight() {
        println("Weight of the basket is $weightBasket")
        //при желании можно добавить
       /* when(weightBasket) {
            0.0 -> println("Basket is empty")
            1.0 -> println("Apple in the basket")
            2.0 -> println("2 apples in the basket")
            1.5 -> println("Orange in the basket")
            in 2.5..60.0 -> println("Apple and orange in the basket")
               }*/
    }

}
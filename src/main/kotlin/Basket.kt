class Basket<Fruit>() {
    private var myArrayFruit = arrayListOf<Fruit>()
    private var weightBasket = 0.0
    private var weightFruit = 0.0
    private var size:Int = 0


    fun size():Int{
        return myArrayFruit.size
    }

    fun addFruit (element:Fruit):Double  {
            myArrayFruit.add(element)

            if (element is Apple) {
                weightFruit = Apple().weight
            }
            if (element is Orange) {
                weightFruit = Orange().weight
            }
            weightBasket += weightFruit

        return weightFruit
    }


    //еще не готово
    fun getOutFruit( elements:Fruit) {
        myArrayFruit.removeAt(0)
       println( myArrayFruit.contains(elements) )

       /* if (myArrayFruit.size > 0) {
            myArrayFruit.removeIf { elements == Orange() }
        } else throw IndexOutOfBoundsException()

        myArrayFruit.forEach { i -> println(i) }*/

        /* if (myArrayFruit.size > 0) {
             for (element in elements) {
                 for (fruit in myArrayFruit) {
                     if (element is Apple == fruit is Apple ) {
                         myArrayFruit.removeIf { fruit == Apple() }
                       //  size--
                         myArrayFruit.forEach { i -> println(i) }

                     }
                     else if (element is Orange ) {
                         myArrayFruit.removeIf { fruit == Orange() }
                         size--
                     }

                    }
             }
         }
         else throw IndexOutOfBoundsException()*/
    }


    fun getWeight() {
        println("Weight of the basket is $weightBasket")
       /* when(weightBasket) {
            0.0 -> println("Basket is empty")
            1.0 -> println("Apple in the basket")
            2.0 -> println("2 apples in the basket")
            1.5 -> println("Orange in the basket")
            in 2.5..60.0 -> println("Apple and orange in the basket")
               }*/
    }

}
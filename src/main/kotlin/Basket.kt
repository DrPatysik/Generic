class Basket<Fruit>() {
    private var myArrayFruit = arrayListOf<Fruit>()
    private var weightBasket = 0.0
    private var size = 0

    fun size():Int{
        return myArrayFruit.size
    }

    fun addFruit (element:Fruit)  {
       myArrayFruit.add(element)

    }

   // private var index :Int = 0
    //еще не готово
   /* fun getOutFruit(vararg elements:Fruit) {
        if (myArrayFruit.size > 0) {
            for (element in elements) {
                for (el in myArrayFruit) {
                    if (element is Apple == el is Apple ) {

                       println( myArrayFruit.last())
                    }
                    myArrayFruit[index] = myArrayFruit[index + 1]
                    size--
                   // println(lastIndex)
                }
            }
        }
        else throw IndexOutOfBoundsException()
    }*/


    fun getWeight() {
         for (element in myArrayFruit) {
             if (element is Apple) {
                 weightBasket += Apple().weight
             }
             if (element is Orange) {
                 weightBasket += Orange().weight
             }
         }
        when(weightBasket) {
            0.0 -> println("Basket is empty")
            1.0 -> println("Apple in the basket")
            2.0 -> println("2 apples in the basket")
            1.5 -> println("Orange in the basket")
            in 2.5..60.0 -> println("Apple and orange in the basket")
               }
    }

}
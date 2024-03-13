class Basket(val weight:Double = 0.0) {
    fun getWeight(n:Double):Double {
        when(n){
            0.0 -> println("The basket is empty")
            1.0 -> println("Apple in the basket")
            1.5 -> println("Orange in the basket")
            2.5 -> println("Apple and orange in the basket")
        }
        return n
    }


    companion object {
        fun createBasketFruit(n: Fruit): Double {
            return  n.weight
        }
        fun createBasketFruit(n: Fruit,m:Fruit): Double {
            return  n.weight + m.weight
        }
    }
}
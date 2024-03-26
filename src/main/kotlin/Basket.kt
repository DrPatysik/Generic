class Basket<Fruit>() {
    private var myArrayFruit = arrayListOf<Fruit>()
    private var weightBasket = 0.0
    private var size:Int = 0


    fun size():Int{
        return myArrayFruit.size
    }

    fun addFruit (element:Fruit)  {
        myArrayFruit.add(element)
        when(element){
            is Apple -> weightBasket += element.weight
            is Orange -> weightBasket += element.weight
        }
        size++
    }

    fun getOutFruit( element:Fruit) {
        if (this.size == 0){
            println("The basket is empty!!")
        }
        if (this.size > 0) {
            for ((index,value) in myArrayFruit.withIndex()){
                if (element is Apple && value is Apple) {
                    myArrayFruit.removeAt(index)
                    weightBasket -= value.weight
                    size--
                    break
                }
                if (element is Orange && value is Orange) {
                    myArrayFruit.removeAt(index)
                    weightBasket -= value.weight
                    size--
                    break
                }
            }
        }
    }
        //добавила удаление нескольких фруктов
    fun getOutSomeFruits( vararg elements:Fruit) {
        for (element in elements){
            getOutFruit(element)
        }
    }

    fun printWeight() {
        println("Weight of the basket is $weightBasket")
    }

}
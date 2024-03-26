fun main(args: Array<String>) {

    val basket1 = Basket<Fruit>()
    basket1.addFruit(Apple())
    basket1.addFruit(Orange())
    basket1.addFruit(Apple())
    basket1.addFruit(Apple())


    //basket1.printWeight()
    //println( basket1.size() )

    basket1.getOutFruit(Apple())
    basket1.getOutFruit(Apple())
    basket1.getOutSomeFruits(Orange(), Apple(),Orange())
    //basket1.getOutFruit(Orange())
    //basket1.getOutFruit(Orange())

    //println( basket1.size() )
    basket1.printWeight()

}
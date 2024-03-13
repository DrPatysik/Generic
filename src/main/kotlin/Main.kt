fun main(args: Array<String>) {
    val apple = Apple()
    val orange = Orange()
    apple.printInfo()
    orange.printInfo()
    val basket = Basket()
    basket.getWeight(apple.weight)
    basket.getWeight(orange.weight)
    basket.getWeight(basket.weight)
    val fruit = orange.weight + apple.weight
    basket.getWeight(fruit)

    //корзина с фруктами
    println( Basket.createBasketFruit(apple,orange) )
    println( Basket.createBasketFruit(apple) )
    println( Basket.createBasketFruit(orange) )

}
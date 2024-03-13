fun main(args: Array<String>) {
    val apple = Apple()
    val orange = Orange()
    apple.printInfo()
    orange.printInfo()
    val basket = Basket()
    basket.getWeight(apple.weight)
    basket.getWeight(orange.weight)
    basket.getWeight(basket.weight)
}
package com.example.solidexamples.l

fun makeBirdFly(bird: Bird) {
    bird.fly()
}

fun main() {
    val bird: Bird = Sparrow()
    makeBirdFly(bird)
}

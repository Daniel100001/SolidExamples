package com.example.solidexamples.l

open class Bird {
    open fun fly() {
        println("The bird is flying.")
    }
}

class Sparrow : Bird() {
    override fun fly() {
        println("The sparrow is flying.")
    }

    fun chirp() {
        println("Chirp chirp!")
    }
}

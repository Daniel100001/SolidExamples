package com.example.solidexamples.d.bad_realisation

class LightSwitch {
    private val lightBulb = LightBulb()

    fun operate() {
        lightBulb.turnOn()
        lightBulb.turnOff()
    }
}

package com.example.solidexamples.d

interface Switchable {
    fun turnOn()
    fun turnOff()
}

class LightBulb : Switchable {
    override fun turnOn() {
    }

    override fun turnOff() {
    }
}

class LightSwitch(private val device: Switchable) {
    fun operate() {
        device.turnOn()
        device.turnOff()
    }
}

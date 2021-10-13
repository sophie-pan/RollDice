package fr.android.rolldice

import java.util.*

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
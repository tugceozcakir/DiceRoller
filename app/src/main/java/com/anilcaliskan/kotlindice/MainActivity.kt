package com.anilcaliskan.kotlindice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button=findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT).show()
        }
        //main()
    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it.
        val dice=Dice(6)
        val diceRoll=dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView=findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
    /*
    fun main() {
        val myFirstDice=Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        if (rollResult == luckyNumber) {
                 println("You win!")
            }else {
              println("You didn't win, try again!")
             }
        //val diceRoll = myFirstDice.roll()
        println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

        val mySecondDice = Dice(20)
        println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

    }

     */

}

    class Dice(val numSides: Int) {
        //var sides = 6
        fun roll() : Int {
            //val randomNumber = (1..numSides).random()
            return (1..numSides).random()
        }
    }
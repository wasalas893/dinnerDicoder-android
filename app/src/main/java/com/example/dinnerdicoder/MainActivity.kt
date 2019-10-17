package com.example.dinnerdicoder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList= arrayListOf("Chinese","Hamburger","pizza","McDonalds","Barros pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random=Random()
            val randomFood=random.nextInt(foodList.count())
            selectedFoodTxt.textView.text=foodList[randomFood]

        }
        addFoodBtn.setOnClickListener{
           val newFood=addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }


    }
}

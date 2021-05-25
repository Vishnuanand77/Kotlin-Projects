package com.vishnu.backgroundcolorrandomizer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var colorArray = arrayOf(Color.BLACK, Color.BLUE, Color.GRAY, Color.MAGENTA,
            Color.RED, Color.YELLOW, Color.CYAN,Color.TRANSPARENT,Color.WHITE,Color.LTGRAY)

        RandomizerButton.setOnClickListener {
            MainViewID.setBackgroundColor(colorArray[getRandom(colorArray.size)])
        }
    }

    fun getRandom(arraySize: Int): Int {
        var rand = Random()
        return rand.nextInt(arraySize)
    }

    fun getRandom2(arraySize: Int): Int {
        var rand = Random()
        return rand.nextInt(arraySize)
    }
}
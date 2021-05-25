package com.vishnu.animalbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cheetah = cheetahImage
        var lion = lionImage

        //Register views to receive onClick events
        cheetah.setOnClickListener(this)
        lion.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            cheetahImage.id -> {
                var cheetahIntent = Intent(this, DetailsActivity::class.java)
                cheetahIntent.putExtra("Animal", "Cheetah")
                startActivity(cheetahIntent)
            }
            lionImage.id -> {
                var lionInent = Intent(this, DetailsActivity::class.java)
                lionInent.putExtra("Animal", "Lion")
                startActivity(lionInent)
            }
        }
    }
}
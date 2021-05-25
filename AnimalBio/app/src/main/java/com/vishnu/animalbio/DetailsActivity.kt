package com.vishnu.animalbio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    val cheetahInfo = "The cheetah is a large cat native to Africa and central Iran. " +
            "It is the fastest land animal, estimated to be capable of running at 80 to " +
            "128 km/h (50 to 80 mph) with the fastest reliably recorded speeds being 93 and " +
            "98 km/h (58 and 61 mph), and as such has several adaptations for speed, " +
            "including a light build, long thin legs and a long tail."

    val lionInfo = "The lion is a large felid of the genus Panthera. It has a muscular, " +
            "deep-chested body, short, rounded head, round ears, and a hairy tuft at the " +
            "end of its tail." +
            "mane. With a typical head-to-body length of 184 to 208 cm (72 to 82 in) they " +
            "are larger than females at 160 to 184 cm (63 to 72 in). It is a social " +
            "species, forming groups called prides."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var animal = intent.extras
        if(animal != null) {
            if (animal.get("Animal") == "Cheetah"){
                //Cheetah
                detailsImageView.setImageDrawable(application.getDrawable(R.drawable.cheetah))
                descriptionText.text = cheetahInfo
            }
            else {
                //Lion
                detailsImageView.setImageDrawable(application.getDrawable(R.drawable.lion))
                descriptionText.text = lionInfo
            }
        }
    }
}
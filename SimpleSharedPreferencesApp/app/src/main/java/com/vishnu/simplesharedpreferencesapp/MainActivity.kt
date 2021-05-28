package com.vishnu.simplesharedpreferencesapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val SHARED_PREFS = "myPrefs"
    var myPref: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saveButton.setOnClickListener {
            //Getting shared preferences
            myPref = getSharedPreferences(SHARED_PREFS, 0)

            //Instantiating a shared preferences editor
            //This editor is used to add things into shared preferences
            var editor: SharedPreferences.Editor = (myPref as SharedPreferences)!!.edit()


            if (!TextUtils.isEmpty(editTextId.text.toString())) {
                //If edit text is not empty save it into shared prefs
                var message = editTextId.text.toString()
                editor.putString("Message", message)
                editor.commit()
                Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Edit Text Field is blank!", Toast.LENGTH_SHORT).show()
            }

        }

        displayBtn.setOnClickListener {
            //Retrieving data
            displayName()
        }

        displayName()


    }

    private fun displayName() {
        var databack: SharedPreferences = getSharedPreferences(SHARED_PREFS, 0)

        if (databack.contains("Message")) {
            var retrievedMessage = databack.getString("Message", "Message not found!")

            displayId.text = retrievedMessage
        } else {
            displayId.text = "Not Working"
        }
    }
}
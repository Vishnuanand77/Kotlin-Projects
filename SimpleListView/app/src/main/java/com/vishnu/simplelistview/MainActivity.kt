package com.vishnu.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Listviews need two things : An adapter and a datasource.
        //The adapter works with the ListView widget and populates the ListView with the datasource.

        //For the sake of example, our datasource is going to be an array of strings
        var namesArray: Array<String> = arrayOf("Mercedes", "Aston Martin", "Volvo", "BMW", "Ford",
            "Mazda", "Ferrari", "McLaren", "Mitsubishi", "Honda", "Porche", "Audi", "Tata Motors", "Bentley", "Bugatti", "Lamborghini" )
        var namesAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, namesArray)

        listview.adapter = namesAdapter

        listview.setOnItemClickListener{ parent, view, position, id ->
            var itemName: String = listview.getItemAtPosition(position).toString()
            Toast.makeText(this, "You chose : $itemName ", Toast.LENGTH_SHORT).show()
        }

    }
}
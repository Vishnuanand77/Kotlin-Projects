package com.vishnu.simplerecyclerview.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.vishnu.simplerecyclerview.R
import com.vishnu.simplerecyclerview.model.Person

class PersonListAdapter(private val list: ArrayList<Person>,
                        private val context: Context): RecyclerView.Adapter<PersonListAdapter.ViewHolder>() {
    //Gets Data, Populates the list_row and then binds it to main activity

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        //View is created inside this function by translating the xml file
        //Create view from xml file - list_row.xml
        //Procures xml file and inflates the widgets
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //This function binds the data and the view. Data population into the View
        holder?.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        //Gets a count of items in the array list
        return  list.size
    }

    inner class ViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {
        //Inputs a view

        fun bindItem(person: Person) {
            //Inputs an object of type Person
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var age: TextView = itemView.findViewById(R.id.age) as TextView

            name.text = person.name
            age.text = person.age.toString()

            //Adding an event listener
            itemView.setOnClickListener {
                Toast.makeText(context, "name : ${name.text} , age: ${age.text}", Toast.LENGTH_SHORT).show()
            }
        }



    }


}
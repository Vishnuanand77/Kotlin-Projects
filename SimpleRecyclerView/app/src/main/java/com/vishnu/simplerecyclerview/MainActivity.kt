package com.vishnu.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vishnu.simplerecyclerview.data.PersonListAdapter
import com.vishnu.simplerecyclerview.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Instantiations
    private var adapter: PersonListAdapter? = null
    private var personList: ArrayList<Person>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //RecyclerViews are much more faster and more efficient variant of a ListView
        //RecyclerView allows us to customize the way the lists are presented.
        //RecyclerView only renders those data items that are visible on the screen.
            //The other items are recycled. This is very memory efficient and app becomes lightweight.

        personList = ArrayList()
        layoutManager = LinearLayoutManager(this)
        adapter = PersonListAdapter(personList!!, this)


        //RecyclerView setup
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = adapter

        //Loading dummy data into recycler view
        for (i in 0..20) {
            val person = Person()
            person.name = "Dummy_" + i
            person.age = 20 + i
            personList!!.add(person)
        }
        adapter!!.notifyDataSetChanged()
    }
}
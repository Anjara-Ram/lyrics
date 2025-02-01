package com.example.lyrics

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

import android.text.InputType
import android.view.View
import android.widget.Adapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    private lateinit var searchList: ArrayList<DataClass>
    lateinit var numberList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var coupletList: Array<String>
    private lateinit var myAdapter: AdapterClass
    private lateinit var searchView: SearchView
    private lateinit var noResultsText: TextView

    private var filterByNumber = false // Default to filtering by title

    override fun onCreate(savedInstanceState:   Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        numberList = numberListData
        titleList = titleListData
        coupletList = getHiraStringsArray(this)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.search)
        noResultsText = findViewById(R.id.noResultsText)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf()
        searchList = arrayListOf()
        getData()

        // Buttons
        val btnNumber = findViewById<Button>(R.id.btn_number)
        val btnTitle = findViewById<Button>(R.id.btn_title)

        btnNumber.setOnClickListener {
            filterByNumber = true
            searchView.queryHint = "Rechercher par numero..."
            searchView.inputType = InputType.TYPE_CLASS_NUMBER // Switch to numeric keypad
        }

        btnTitle.setOnClickListener {
            filterByNumber = false
            searchView.queryHint = "Rechercher par titre..."
            searchView.inputType = InputType.TYPE_CLASS_TEXT // Switch to text keyboard
        }

        searchView.clearFocus()
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                searchList.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if (searchText.isNotEmpty()) {
                    if (filterByNumber) {
                        // Filter by Number
                        numberList.forEachIndexed { index, number ->
                            if (number.toString().contains(searchText)) {
                                searchList.add(DataClass(number, titleList[index], coupletList[index]))
                            }
                        }
                    } else {
                        // Filter by Title
                        titleList.forEachIndexed { index, title ->
                            if (title.toLowerCase(Locale.getDefault()).contains(searchText)) {
                                searchList.add(DataClass(numberList[index], title, coupletList[index]))
                            }
                        }
                    }
                    recyclerView.adapter!!.notifyDataSetChanged()
                } else {
                    searchList.addAll(dataList)
                }

                // Updating UI based on search results
                if (searchList.isEmpty()) {
                    recyclerView.visibility = View.GONE
                    noResultsText.visibility = View.VISIBLE
                } else {
                    recyclerView.visibility = View.VISIBLE
                    noResultsText.visibility = View.GONE
                }

                recyclerView.adapter!!.notifyDataSetChanged()
                return false
            }
        })

        myAdapter = AdapterClass(searchList)
        recyclerView.adapter = myAdapter

        myAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("android", it)
            startActivity(intent)

        }

    }

    private fun getData() {
        for (i in numberList.indices) {
            val dataClass = DataClass(numberList[i], titleList[i], coupletList[i])
            dataList.add(dataClass)
        }
        searchList.addAll(dataList)
        recyclerView.adapter = AdapterClass(searchList)
    }

    private fun getHiraStringsArray(context: Context): Array<String> {
        val hiraArray = Array(428) { "" } // Create an array with 428 empty strings
        for (i in 1..428) {
            val resId = context.resources.getIdentifier("hira$i", "string", context.packageName)
            if (resId != 0) {  // Ensure the resource exists
                hiraArray[i - 1] = context.getString(resId) // Fill the array
            }
        }
        return hiraArray
    }


}
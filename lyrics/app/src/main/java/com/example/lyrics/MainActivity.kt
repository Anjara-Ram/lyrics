package com.example.lyrics

import android.os.Bundle
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

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    private lateinit var searchList: ArrayList<DataClass>
    private lateinit var numberList: Array<Int>
    private lateinit var titleList: Array<String>
    private lateinit var searchView: SearchView

    private var filterByNumber = false // Default to filtering by title

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        numberList = numberListData
        titleList = titleListData

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.search)
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
            searchView.queryHint = "Rechercher par titre"
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
                                searchList.add(DataClass(number, titleList[index]))
                            }
                        }
                    } else {
                        // Filter by Title
                        titleList.forEachIndexed { index, title ->
                            if (title.toLowerCase(Locale.getDefault()).contains(searchText)) {
                                searchList.add(DataClass(numberList[index], title))
                            }
                        }
                    }
                    recyclerView.adapter!!.notifyDataSetChanged()
                } else {
                    searchList.clear()
                    searchList.addAll(dataList)
                    recyclerView.adapter!!.notifyDataSetChanged()
                }
                return false
            }
        })
    }

    private fun getData() {
        for (i in numberList.indices) {
            val dataClass = DataClass(numberList[i], titleList[i])
            dataList.add(dataClass)
        }
        searchList.addAll(dataList)
        recyclerView.adapter = AdapterClass(searchList)
    }
}

package com.example.list.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.list.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mylist=findViewById<RecyclerView>(R.id.list)


        mainViewModel.getArticles()

        mainViewModel.data.observe(this) {
            mylist.layoutManager = LinearLayoutManager(this)
            mylist.adapter = MyItemRecyclerViewAdapter(it)

        }


    }




}
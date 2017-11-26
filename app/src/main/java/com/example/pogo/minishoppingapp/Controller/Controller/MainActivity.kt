package com.example.pogo.minishoppingapp.Controller.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.pogo.minishoppingapp.Controller.Adapter.CategoryAdapter
import com.example.pogo.minishoppingapp.Controller.Model.Category
import com.example.pogo.minishoppingapp.Controller.Services.DataService
import com.example.pogo.minishoppingapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

    }
}

package com.example.pogo.minishoppingapp.Controller.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import com.example.pogo.minishoppingapp.Controller.Adapter.CategoryAdapter
import com.example.pogo.minishoppingapp.Controller.Adapter.CategoryRecycleAdapter
import com.example.pogo.minishoppingapp.Controller.Model.Category
import com.example.pogo.minishoppingapp.Controller.Services.DataService
import com.example.pogo.minishoppingapp.Controller.Utilities.EXTRA_CATEGORY
import com.example.pogo.minishoppingapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {
            category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)

        }

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



    }
}

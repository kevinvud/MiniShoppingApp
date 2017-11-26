package com.example.pogo.minishoppingapp.Controller.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.pogo.minishoppingapp.Controller.Utilities.EXTRA_CATEGORY
import com.example.pogo.minishoppingapp.R

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}

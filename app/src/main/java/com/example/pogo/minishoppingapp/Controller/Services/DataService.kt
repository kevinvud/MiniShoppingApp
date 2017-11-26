package com.example.pogo.minishoppingapp.Controller.Services

import com.example.pogo.minishoppingapp.Controller.Model.Category
import com.example.pogo.minishoppingapp.Controller.Model.Product

/**
 * Created by pogo on 11/25/17.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Graphic Beanie", "$18","hat1"),
            Product("Graphic Black", "$19","hat2"),
            Product("Graphic White", "$20","hat3"),
            Product("Graphic Snapback", "$21","hat4")
    )

    val hoodies = listOf(
            Product("Hoodies Gray", "$28","hoodie1"),
            Product("Hoodies Red", "$38","hoodie2"),
            Product("Hoodies Gray", "$48","hoodie3"),
            Product("Hoodies Gray", "$58","hoodie4")
    )

    val shirts = listOf(
            Product("Shirt Black", "$8","shirt1"),
            Product("Shirt Light Gray", "$8","shirt2"),
            Product("Shirt Hustle", "$8","shirt3"),
            Product("Shirt Black", "$8","shirt4"),
            Product("Shirt Studios", "$8","shirt5")

    )


    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        when(category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }


    }


}
package com.example.pogo.minishoppingapp.Controller.Services

import com.example.pogo.minishoppingapp.Controller.Model.Category
import com.example.pogo.minishoppingapp.Controller.Model.Product

/**
 * Created by pogo on 11/25/17.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtImage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Graphic Beanie", "$18","hat01"),
            Product("Graphic Black", "$19","hat02"),
            Product("Graphic White", "$20","hat03"),
            Product("Graphic Snapback", "$21","hat04")
    )

    val hoodies = listOf(
            Product("Hoodies Gray", "$28","hoodie01"),
            Product("Hoodies Red", "$38","hoodie02"),
            Product("Hoodies Gray", "$48","hoodie03"),
            Product("Hoodies Gray", "$58","hoodie04")
    )

    val shirts = listOf(
            Product("Shirt Black", "$8","shirt1"),
            Product("Shirt Light Gray", "$8","shirt2"),
            Product("Shirt Hustle", "$8","shirt3"),
            Product("Shirt Black", "$8","shirt4"),
            Product("Shirt Studios", "$8","shirt5")

    )
}
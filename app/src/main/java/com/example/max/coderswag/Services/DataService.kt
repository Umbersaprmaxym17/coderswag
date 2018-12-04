package com.example.max.coderswag.Services

import com.example.max.coderswag.Model.Category
import com.example.max.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage" ),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Developers Graphic Beanie", "$18","hat01"),
        Product("Developers Hat Black", "$20","hat02"),
        Product("Developers Hat White", "$18","hat03"),
        Product("Developers Hat Snapback", "$22","hat04")
    )
    val hoodies = listOf(
        Product("Developers Hoodie Gray", "$28","hoodie01"),
        Product("Developers Hoodie Rad", "$32","hoodie02"),
        Product("Developers Hoodie Green", "$28","hoodie03"),
        Product("Developers Black Hoodie", "$32","hoodie04")
    )

    val shirts = listOf(
        Product("Developers Shirt Black", "$18","shirt01"),
        Product("Developers BAdhe Light Gray", "$12","shirt02"),
        Product("Developers Logo Shirt Red", "$18","shirt03"),
        Product("Developers Shirt Hustle", "$12","shirt04"),
        Product("Kickflip Studios", "18", "shirt05")
    )



}
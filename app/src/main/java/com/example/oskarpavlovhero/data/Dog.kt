package com.example.oskarpavlovhero.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.oskarpavlovhero.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.burger, R.string.dog_name_1, R.string.dog_description_1, R.string.dog_description_1),
    Dog(R.drawable.corn, R.string.dog_name_2, R.string.dog_description_2, R.string.dog_description_2),
    Dog(R.drawable.nuggets, R.string.dog_name_3, R.string.dog_description_3, R.string.dog_description_3),
    Dog(R.drawable.onion, R.string.dog_name_4, R.string.dog_description_4, R.string.dog_description_4),
    Dog(R.drawable.cheesesticks, R.string.dog_name_5, R.string.dog_description_5, R.string.dog_description_5),
    Dog(R.drawable.chickenwings, R.string.dog_name_6, R.string.dog_description_6, R.string.dog_description_6),
    Dog(R.drawable.chickenstrips, R.string.dog_name_7, R.string.dog_description_7, R.string.dog_description_7),
)

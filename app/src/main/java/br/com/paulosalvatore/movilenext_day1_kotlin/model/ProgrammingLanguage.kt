package br.com.paulosalvatore.movilenext_day1_kotlin.model

import android.support.annotation.DrawableRes

data class ProgrammingLanguage(
    @DrawableRes
    val imageResourceId: Int,
    val title: String,
    val year: Int,
    val description: String
)

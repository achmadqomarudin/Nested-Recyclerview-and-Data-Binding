package com.example.nestedrecyclerview.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book(
    val id: String,
    val title: String,
    val imageRes: Int
) : Parcelable
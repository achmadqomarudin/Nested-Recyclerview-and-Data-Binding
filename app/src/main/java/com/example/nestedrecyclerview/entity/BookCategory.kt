package com.example.nestedrecyclerview.entity

import android.os.Parcelable
import com.example.nestedrecyclerview.entity.Book
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BookCategory(
    val id: String,
    val title: String,
    val books: List<Book>
) : Parcelable
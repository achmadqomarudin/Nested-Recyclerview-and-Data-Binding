package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nestedrecyclerview.adapter.BookCategoryAdapter
import com.example.nestedrecyclerview.entity.Book
import com.example.nestedrecyclerview.entity.BookCategory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookCategoryAdapter = BookCategoryAdapter()
        bookCategoryAdapter.submitList(getData())
        outerRecyclerView.adapter = bookCategoryAdapter
    }
}

fun getData(): ArrayList<BookCategory> {
    val bookCategory = arrayListOf<BookCategory>()
    for (a in 1..5) {
        val bookList = arrayListOf<Book>()
        for(b in 1..5) {
            val book = Book("$b", "Book Title $b", R.drawable.book)
            bookList += book
        }

        bookCategory += BookCategory("$a", "Category title $a", bookList)
    }

    return bookCategory
}

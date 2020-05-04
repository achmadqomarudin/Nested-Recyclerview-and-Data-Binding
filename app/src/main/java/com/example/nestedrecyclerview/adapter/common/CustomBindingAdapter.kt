package com.example.nestedrecyclerview.adapter.common

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.adapter.BookAdapter
import com.example.nestedrecyclerview.entity.Book

@BindingAdapter(value = ["setBooks"])
fun RecyclerView.setRowBook(books: List<Book>?) {
    if (books != null) {
        val bookAdapter = BookAdapter()
        bookAdapter.submitList(books)

        adapter = bookAdapter
    }
}
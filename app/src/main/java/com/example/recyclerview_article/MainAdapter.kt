package com.example.recyclerview_article

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(
    private var context: Context,
    private var books: MutableList<Book>
) : RecyclerView.Adapter<MainAdapter.BookViewHolder>() {
    private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BookViewHolder {
        val view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bookTitle.text = books[position]?.title
        holder.bookAuthor.text = books[position]?.author
        holder.bookPublishedDate.text = books[position]?.datePublished
    }

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var bookTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        var bookAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
        var bookPublishedDate = itemView.findViewById<TextView>(R.id.tvDatePublished)
    }
}


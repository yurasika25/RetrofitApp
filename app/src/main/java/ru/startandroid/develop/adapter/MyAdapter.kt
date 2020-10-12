package ru.startandroid.develop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main.view.*
import ru.startandroid.develop.R
import ru.startandroid.develop.retrofittest.model.Post

class MyAdapter(private val listItems: List<Post>, private val mContext: Context):
        RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_main,parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemList = listItems[position]
        holder.itemView.new_title.text = itemList.title
        holder.itemView.new_title_two.text = itemList.title
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}

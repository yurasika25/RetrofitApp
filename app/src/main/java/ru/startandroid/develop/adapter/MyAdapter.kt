package ru.startandroid.develop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*
import ru.startandroid.develop.R
import ru.startandroid.develop.retrofittest.model.Post

class MyAdapter(private val listItems: List<Post>, private val listener:() -> Unit):
        RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_main,parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemList = listItems[position]
        holder.itemView.view_pen.setOnClickListener{listener()}

        holder.itemView.one_title.text = itemList.title
        holder.itemView.two_title.text = itemList.id
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}

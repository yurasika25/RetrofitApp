package ru.startandroid.develop.catandbird.screens.list

import android.content.Context
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_two_test.view.*
import ru.startandroid.develop.R
import ru.startandroid.develop.main.MainActivity


class MyAdapter(private val listItems: List<TestModel>, private val mContext: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_two_test, parent, false)
        (parent.context as MainActivity).windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels

        return ViewHolder(v)
    }



    var displayMetrics = DisplayMetrics()
    private var screenWidth = 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemPadding = 8

        val itemWidth = (screenWidth - itemPadding).div(2.1)

        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = layoutParams.height
        layoutParams.width = itemWidth.toInt()
        holder.itemView.layoutParams = layoutParams
        val itemList = listItems[position]
        holder.itemView.numbersTV.text = itemList.title
        holder.itemView.titleTV.text = itemList.time
        Glide

            .with(mContext)
            .load(itemList.image)
            .centerCrop()
            .placeholder(R.drawable.square)
            .into(holder.itemView.Bird)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
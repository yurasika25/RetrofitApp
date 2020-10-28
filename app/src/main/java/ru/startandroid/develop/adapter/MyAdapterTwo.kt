package ru.startandroid.develop.adapter

import android.content.Context
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_photo.view.*
import ru.startandroid.develop.R
import ru.startandroid.develop.listphotos.NewModel
import ru.startandroid.develop.main.MainActivity

class MyAdapterTwo(private val listItems: List<NewModel>, private val mContext: Context):
    RecyclerView.Adapter<MyAdapterTwo.ViewHolder>() {

    var displayMetrics = DisplayMetrics()
    private var screenWidth = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_photo, parent, false)
        (parent.context as MainActivity).windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemPadding = 8

        val itemWidth = (screenWidth - itemPadding).div(1.62)
        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = layoutParams.height
        layoutParams.width = itemWidth.toInt()
        holder.itemView.layoutParams = layoutParams
        val itemList = listItems[position]
        holder.itemView.numbersTV.text = itemList.number
        holder.itemView.titleTV.text = itemList.title
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
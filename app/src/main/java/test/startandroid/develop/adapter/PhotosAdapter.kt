package test.startandroid.develop.adapter

import android.content.Context
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_photo.view.*
import test.startandroid.develop.R
import test.startandroid.develop.retrofittest.model.Picture
import test.startandroid.develop.ui.main.MainActivity

private const val ITEM_PADDING = 8
private const val ITEM_DIVIDER = 1.8

class PhotosAdapter(private val listItems: List<Picture>, private val mContext: Context):
    RecyclerView.Adapter<PhotosAdapter.ViewHolder>() {

    var displayMetrics = DisplayMetrics()
    private var screenWidth = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        (parent.context as MainActivity).windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemWidth = (screenWidth - ITEM_PADDING).div(ITEM_DIVIDER)
        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = layoutParams.height
        layoutParams.width = itemWidth.toInt()
        holder.itemView.layoutParams = layoutParams
        val itemList = listItems[position]
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
package test.startandroid.develop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_post.view.*
import test.startandroid.develop.R
import test.startandroid.develop.retrofittest.model.Post
import java.util.ArrayList

class PostsAdapter(
    private var callBack: PostAdapterCallback,
    private var listItems: ArrayList<Post>,
    private val listenerThree: () -> Unit
) :
    RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemList = listItems[position]
        holder.itemView.titleTwo.setOnClickListener { listenerThree() }
        holder.itemView.view_delete.setOnClickListener { callBack.onDeletePost(position) }
        holder.itemView.one_title.text = itemList.userId
        holder.itemView.two_title.text = itemList.id
        holder.itemView.three_title.text = itemList.title
        holder.itemView.four_title.text = itemList.body
    }

    fun removeItem(position: Int) {
        this.listItems.removeAt(position)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    interface PostAdapterCallback {
        fun onDeletePost(id: Int)
    }

}

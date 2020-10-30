package test.startandroid.develop.ui.post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_post.*
import kotlinx.android.synthetic.main.fragment_post.view.*
import test.startandroid.develop.R
import test.startandroid.develop.adapter.PostsAdapter
import test.startandroid.develop.retrofittest.model.Post
import test.startandroid.develop.ui.add.AddPostFragment

class PostsFragment : Fragment(), PostsFragmentView, PostsAdapter.PostAdapterCallback {

    private var presenter: PostsFragmentPresenter? = null

    companion object {
        fun newInstance(): PostsFragment {
            val args = Bundle()
            val fragment = PostsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onPause() {
        super.onPause()
        presenter?.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter?.enterWithView(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_post, container, false)
        presenter = PostsFragmentPresenter()
        view.addPostFAT.setOnClickListener { presenter!!.onFatButtonClicked() }
        return view
    }

    override fun navigateToAddPost() {
        val fragment: Fragment = AddPostFragment.newInstance()
        val fm = requireActivity().supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.mainContainer, fragment)
        ft.addToBackStack(null)
        ft.commit()
    }

    override fun setUpUI(data : List<Post>) {
        postRV.setHasFixedSize(true)
        postRV.layoutManager = LinearLayoutManager(context)
        val adapter =  PostsAdapter(this, ArrayList(data), {presenter?.onFatButtonClicked()})
        postRV.adapter = adapter
    }

    override fun onDeleteSuccess(id: Int) {
        (postRV.adapter as PostsAdapter).removeItem(id)
    }

    override fun onDeletePost(id: Int) {
        presenter!!.onDeletePostClicked(id)
    }
}

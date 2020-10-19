package ru.startandroid.develop.catandbird.screens.list

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.photo_main.*
import ru.startandroid.develop.R
import java.util.*

class FragmentPhoto : Fragment() {
    private var presenter: PhotoPresenter? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.photo_main, container, false)
        presenter = PhotoPresenter()
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        val recyclerView: RecyclerView = view.findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager =
            GridLayoutManager(this.context, 2,  RecyclerView.VERTICAL, false)
        val listItems = ArrayList<TestModel>()



        listItems.add(
            TestModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/9a7adb79dd800aa15c3cc0e482e004c8.jpg"),
                "Just animals",
                "This car is blue in color",
                "1"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://img0.liveinternet.ru/images/foto/c/9/apps/2/295/2295448_morda.jpg"),
                "Just animals",
                "This is a car showroom",
                "2"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "Next title",
                "3"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://walldeco.ua/img/gallery/51/thumbs/thumb_l_42577.jpg"),
                "Just animals",
                "Next title",
                "4"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://static2.gazeta.ua/img2/cache/gallery/929/929736_1_w_570.jpg?v=0"),
                "Just animals",
                "Next title",
                "5"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://www.stb.ua/wp-content/uploads/2016/01/2-zhivotnye.jpg"),
                "Just animals",
                "Next title",
                "6"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://ischool.org.ua/images/doc/top-10-samyh-milyh-i-druzheljubnyh-zhivotnyh-na_2.jpg"),
                "Just animals",
                "Next title",
                "7"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://smishno.com/wp-content/uploads/2017/12/milye-fotografii-detenyshej-zhivotnyx-18.jpg"),
                "Just animals",
                "Next title",
                "8"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Panda.jpg"),
                "Just animals",
                "Next title",
                "9"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://i.pinimg.com/564x/45/7b/d4/457bd419ec8ad8312e2b82b4ba22b854.jpg"),
                "Just animals",
                "Next title",
                "10"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/10177962_628419560545791_3255024961722719726_n.jpg"),
                "Just animals",
                "Next title",
                "11"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "Next title",
                "12"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTVI100QKXDsYdVXd84PV6CSziO41PkqMWorg&usqp=CAU"),
                "Just animals",
                "Next title",
                "13"
            )
        )
        listItems.add(
            TestModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Giraffe1.jpg"),
                "Just animals",
                "Next title",
                "14"
            )
        )

        //Set adapter
        val adapter = MyAdapter(listItems, requireContext())
        recyclerView.setAdapter(adapter)
        return view
    }
    companion object {
        fun newInstance(): FragmentPhoto {
            val args = Bundle()
            val fragment = FragmentPhoto()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onPause() {
        super.onPause()
        presenter!!.exitFromView()
    }

    override fun onResume() {
        super.onResume()
        presenter!!.enterWithView(this)
    }
}

private fun RecyclerView.setAdapter(adapter: MyAdapter) {
}

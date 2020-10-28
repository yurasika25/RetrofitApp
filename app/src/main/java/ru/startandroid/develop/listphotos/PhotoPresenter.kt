package ru.startandroid.develop.listphotos

import android.net.Uri
import ru.startandroid.develop.mvp.BasicPresenter
import java.util.ArrayList

class PhotoPresenter : BasicPresenter<PhotoView>() {

    override fun onEnterScope() {

        val listItems = ArrayList<NewModel>()

        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/9a7adb79dd800aa15c3cc0e482e004c8.jpg"),
                "Just animals",
                "1"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://img0.liveinternet.ru/images/foto/c/9/apps/2/295/2295448_morda.jpg"),
                "Just animals",
                "2"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "3"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://walldeco.ua/img/gallery/51/thumbs/thumb_l_42577.jpg"),
                "Just animals",
                "4"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://static2.gazeta.ua/img2/cache/gallery/929/929736_1_w_570.jpg?v=0"),
                "Just animals",
                "5"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://www.stb.ua/wp-content/uploads/2016/01/2-zhivotnye.jpg"),
                "Just animals",
                "6"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://ischool.org.ua/images/doc/top-10-samyh-milyh-i-druzheljubnyh-zhivotnyh-na_2.jpg"),
                "Just animals",
                "7"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://smishno.com/wp-content/uploads/2017/12/milye-fotografii-detenyshej-zhivotnyx-18.jpg"),
                "Just animals",
                "8"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Panda.jpg"),
                "Just animals",
                "9"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.pinimg.com/564x/45/7b/d4/457bd419ec8ad8312e2b82b4ba22b854.jpg"),
                "Just animals",
                "10"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/10177962_628419560545791_3255024961722719726_n.jpg"),
                "Just animals",
                "11"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "12"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTVI100QKXDsYdVXd84PV6CSziO41PkqMWorg&usqp=CAU"),
                "Just animals",
                "13"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Giraffe1.jpg"),
                "Just animals",
                "14"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/9a7adb79dd800aa15c3cc0e482e004c8.jpg"),
                "Just animals",
                "1"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://img0.liveinternet.ru/images/foto/c/9/apps/2/295/2295448_morda.jpg"),
                "Just animals",
                "2"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "3"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://walldeco.ua/img/gallery/51/thumbs/thumb_l_42577.jpg"),
                "Just animals",
                "4"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://static2.gazeta.ua/img2/cache/gallery/929/929736_1_w_570.jpg?v=0"),
                "Just animals",
                "5"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://www.stb.ua/wp-content/uploads/2016/01/2-zhivotnye.jpg"),
                "Just animals",
                "6"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://ischool.org.ua/images/doc/top-10-samyh-milyh-i-druzheljubnyh-zhivotnyh-na_2.jpg"),
                "Just animals",
                "7"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://smishno.com/wp-content/uploads/2017/12/milye-fotografii-detenyshej-zhivotnyx-18.jpg"),
                "Just animals",
                "8"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Panda.jpg"),
                "Just animals",
                "9"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.pinimg.com/564x/45/7b/d4/457bd419ec8ad8312e2b82b4ba22b854.jpg"),
                "Just animals",
                "10"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/10177962_628419560545791_3255024961722719726_n.jpg"),
                "Just animals",
                "11"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "12"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTVI100QKXDsYdVXd84PV6CSziO41PkqMWorg&usqp=CAU"),
                "Just animals",
                "13"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Giraffe1.jpg"),
                "Just animals",
                "14"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/9a7adb79dd800aa15c3cc0e482e004c8.jpg"),
                "Just animals",
                "1"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://img0.liveinternet.ru/images/foto/c/9/apps/2/295/2295448_morda.jpg"),
                "Just animals",
                "2"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "3"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://walldeco.ua/img/gallery/51/thumbs/thumb_l_42577.jpg"),
                "Just animals",
                "4"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://static2.gazeta.ua/img2/cache/gallery/929/929736_1_w_570.jpg?v=0"),
                "Just animals",
                "5"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://www.stb.ua/wp-content/uploads/2016/01/2-zhivotnye.jpg"),
                "Just animals",
                "6"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://ischool.org.ua/images/doc/top-10-samyh-milyh-i-druzheljubnyh-zhivotnyh-na_2.jpg"),
                "Just animals",
                "7"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://smishno.com/wp-content/uploads/2017/12/milye-fotografii-detenyshej-zhivotnyx-18.jpg"),
                "Just animals",
                "8"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Panda.jpg"),
                "Just animals",
                "9"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.pinimg.com/564x/45/7b/d4/457bd419ec8ad8312e2b82b4ba22b854.jpg"),
                "Just animals",
                "10"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/10177962_628419560545791_3255024961722719726_n.jpg"),
                "Just animals",
                "11"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "12"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTVI100QKXDsYdVXd84PV6CSziO41PkqMWorg&usqp=CAU"),
                "Just animals",
                "13"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Giraffe1.jpg"),
                "Just animals",
                "14"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/9a7adb79dd800aa15c3cc0e482e004c8.jpg"),
                "Just animals",
                "1"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://img0.liveinternet.ru/images/foto/c/9/apps/2/295/2295448_morda.jpg"),
                "Just animals",
                "2"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "3"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://walldeco.ua/img/gallery/51/thumbs/thumb_l_42577.jpg"),
                "Just animals",
                "4"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://static2.gazeta.ua/img2/cache/gallery/929/929736_1_w_570.jpg?v=0"),
                "Just animals",
                "5"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://www.stb.ua/wp-content/uploads/2016/01/2-zhivotnye.jpg"),
                "Just animals",
                "6"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://ischool.org.ua/images/doc/top-10-samyh-milyh-i-druzheljubnyh-zhivotnyh-na_2.jpg"),
                "Just animals",
                "7"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://smishno.com/wp-content/uploads/2017/12/milye-fotografii-detenyshej-zhivotnyx-18.jpg"),
                "Just animals",
                "8"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Panda.jpg"),
                "Just animals",
                "9"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.pinimg.com/564x/45/7b/d4/457bd419ec8ad8312e2b82b4ba22b854.jpg"),
                "Just animals",
                "10"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/10177962_628419560545791_3255024961722719726_n.jpg"),
                "Just animals",
                "11"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "12"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTVI100QKXDsYdVXd84PV6CSziO41PkqMWorg&usqp=CAU"),
                "Just animals",
                "13"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Giraffe1.jpg"),
                "Just animals",
                "14"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/9a7adb79dd800aa15c3cc0e482e004c8.jpg"),
                "Just animals",
                "1"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://img0.liveinternet.ru/images/foto/c/9/apps/2/295/2295448_morda.jpg"),
                "Just animals",
                "2"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "3"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://walldeco.ua/img/gallery/51/thumbs/thumb_l_42577.jpg"),
                "Just animals",
                "4"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://static2.gazeta.ua/img2/cache/gallery/929/929736_1_w_570.jpg?v=0"),
                "Just animals",
                "5"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://www.stb.ua/wp-content/uploads/2016/01/2-zhivotnye.jpg"),
                "Just animals",
                "6"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://ischool.org.ua/images/doc/top-10-samyh-milyh-i-druzheljubnyh-zhivotnyh-na_2.jpg"),
                "Just animals",
                "7"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://smishno.com/wp-content/uploads/2017/12/milye-fotografii-detenyshej-zhivotnyx-18.jpg"),
                "Just animals",
                "8"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Panda.jpg"),
                "Just animals",
                "9"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.pinimg.com/564x/45/7b/d4/457bd419ec8ad8312e2b82b4ba22b854.jpg"),
                "Just animals",
                "10"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/10177962_628419560545791_3255024961722719726_n.jpg"),
                "Just animals",
                "11"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "12"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTVI100QKXDsYdVXd84PV6CSziO41PkqMWorg&usqp=CAU"),
                "Just animals",
                "13"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://deztop.net/wp-content/uploads/2018/08/Baby-Giraffe1.jpg"),
                "Just animals",
                "14"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://pustunchik.ua/uploads/school/cache/old/interesting/animals/Nevozmozhnyje-milashki/184712.jpg"),
                "Just animals",
                "3"
            )
        )
        listItems.add(
            NewModel(
                Uri.parse("https://i.ytimg.com/vi/x-J6jcoYb0M/maxresdefault.jpg"),
                "Just animals",
                "12"
            )
        )

           getView()?.initList(listItems)
    }

    override fun onExitScope() {
    }
}

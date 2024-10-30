package com.example.gmail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    var avatarNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: AvatarNameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        avatarNameList.add("Nguyen Duc Hoang 20215580")
        avatarNameList.add("Tran Van Dao 20215559")
        avatarNameList.add("Bui Quang Dung 20215541")
        avatarNameList.add("Tran Duc Luong 20215612")
        avatarNameList.add("Truong CNTT & TT")

        detailList.add("MSSV: 20215580")
        detailList.add("MSSV: 20215559")
        detailList.add("MSSV: 20215541")
        detailList.add("MSSV: 20215612")
        detailList.add("Xin chào Nguyễn Đức Hoàng...")

        imageList.add(R.drawable.avatar4)
        imageList.add(R.drawable.avatar1)
        imageList.add(R.drawable.avatar2)
        imageList.add(R.drawable.avatar3)
        imageList.add(R.drawable.soict)

        adapter = AvatarNameAdapter(avatarNameList,this@MainActivity,detailList,imageList)

        recyclerView.adapter = adapter


    }
}
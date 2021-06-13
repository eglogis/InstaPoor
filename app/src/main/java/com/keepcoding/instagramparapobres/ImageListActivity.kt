package com.keepcoding.instagramparapobres

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.keepcoding.instagramparapobres.databinding.ActivityImageListBinding

class ImageListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityImageListBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        val myList = intent.getStringArrayExtra("mylist")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        val adapter = ImageRecyclerAdapter()
        adapter.imageList = myList?.toList() ?: listOf()
        binding.imageRecyclerView.adapter = adapter
    }
}
package com.example.myapplicationnn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplicationnn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var imageViewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageUrlList = listOf(
            "https://wallpapers.com/images/featured/mercedes-amg-gt-zn4ue9qmrk69hg4i.jpg",
            "https://machineswithsouls.com/wp-content/uploads/2022/03/DSC_4945-1.jpg",
            "https://medias.fcacanada.ca//sites/brand/jeep/pages/articles/2021-jeep-grand-cherokee-trackhawk/media/images/jeep-grand-cherokee-trackhawk-2021-possibilits-illimites-145_e2f01cc7c9d436f9f9e32eb655d16f5-2048x1364.jpg"
        )

        imageViewPagerAdapter = ViewPagerAdapter(imageUrlList)
        setUpViewPager()

    }

    private fun setUpViewPager() {
        binding.viewPager.adapter = imageViewPagerAdapter

        binding.viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val currentPageIndex = 1
        binding.viewPager.currentItem = currentPageIndex


    }
}
package com.bagicode.petikkopi.home

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bagicode.petikkopi.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragmentCatalog = CatalogFragment()
        val fragmentUmkm = UmkmFragment()
        val fragmentHome = DashboardFragment()

        setFragment(fragmentHome)

        iv_menu1.setOnClickListener {
            setFragment(fragmentHome)

            changeIcon(iv_menu1, R.drawable.ic_home)
            changeIcon(iv_menu2, R.drawable.ic_umkm)
            changeIcon(iv_menu3, R.drawable.ic_katalog)

        }

        iv_menu2.setOnClickListener {
            setFragment(fragmentUmkm)

            changeIcon(iv_menu1, R.drawable.ic_home)
            changeIcon(iv_menu2, R.drawable.ic_umkm)
            changeIcon(iv_menu3, R.drawable.ic_katalog)
        }

        iv_menu3.setOnClickListener {
            setFragment(fragmentCatalog)

            changeIcon(iv_menu1, R.drawable.ic_home)
            changeIcon(iv_menu2, R.drawable.ic_umkm)
            changeIcon(iv_menu3, R.drawable.ic_katalog)

        }


    }

    private fun setFragment(fragment: androidx.fragment.app.Fragment){
        val fragmentManager= supportFragmentManager
        val fragmentTransacion = fragmentManager.beginTransaction()
        fragmentTransacion.replace(R.id.layout_frame, fragment)
        fragmentTransacion.commit()

    }

    private fun changeIcon(imageView: ImageView, int: Int){
        imageView.setImageResource(int)
    }
}



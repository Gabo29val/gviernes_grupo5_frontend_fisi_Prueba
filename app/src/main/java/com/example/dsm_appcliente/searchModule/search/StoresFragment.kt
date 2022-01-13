package com.example.dsm_appcliente.searchModule.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentStoresBinding

class StoresFragment : Fragment(R.layout.fragment_stores) {

    private lateinit var mBinding: FragmentStoresBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentStoresBinding.bind(view)

        setupComponents()
    }

    private fun setupComponents() {
        Glide.with(mBinding.root)
            .load("https://paranahaciaelmundo.com/wp-content/uploads/2020/05/captura-de-pantalla-completa-13052020-125022-bmp.jpg")
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(mBinding.imgMaps)
    }
}
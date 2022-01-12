package com.example.dsm_appcliente.searchModule.productDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentProductDetailsBinding

class ProductDetailsFragment : Fragment(R.layout.fragment_product_details) {

    private lateinit var mBinding: FragmentProductDetailsBinding
    private val arg by navArgs<ProductDetailsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentProductDetailsBinding.bind(view)

        setupData()
    }

    private fun setupData() {
        mBinding.apply {
            tvNameProduct.text = arg.name
            details.tvDescription.text = arg.description
            Glide.with(root)
                .load(arg.photoUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imgPhotoProduct)
        }
    }
}
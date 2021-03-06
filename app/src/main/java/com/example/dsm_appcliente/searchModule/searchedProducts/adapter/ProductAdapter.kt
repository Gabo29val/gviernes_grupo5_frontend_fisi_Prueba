package com.example.dsm_appcliente.searchModule.searchedProducts.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.ItemProductCardAltBinding
import com.example.dsm_appcliente.model.Product

class ProductAdapter(val products: List<Product>, val itemClickListener: OnProductClickListener) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    inner class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemProductCardAltBinding.bind(view)
        fun setData(product: Product) {
            binding.apply {
                tvNameProduct.text = product.name
                tvNameStore.text = product.nameStore
                tvPriceProduct.text = product.price.toString()
                Glide.with(this.root)
                    .load(product.photoUrl)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .centerCrop()
                    .into(imgPhotoProduct)

                root.setOnClickListener {
                    itemClickListener.onProductClick(product)
                }
            }
        }
    }

    interface OnProductClickListener {
        fun onProductClick(product: Product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product_card_alt, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products.get(position)
        holder.setData(product)
    }

    override fun getItemCount(): Int = products.size
}
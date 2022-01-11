package com.example.dsm_appcliente.searchModule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentSearchedProductsBinding
import com.example.dsm_appcliente.model.Product
import com.example.dsm_appcliente.searchModule.adapter.ProductAdapter


class SearchedProductsFragment : Fragment(R.layout.fragment_searched_products) {
    private lateinit var mBinding: FragmentSearchedProductsBinding
    private lateinit var mProductAdapter: ProductAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentSearchedProductsBinding.bind(view)

        mProductAdapter = ProductAdapter(getProducts())


        mBinding.rvProducts.apply {
            adapter = mProductAdapter
            setHasFixedSize(true)
        }
    }

    private fun getProducts(): List<Product> {
        return listOf(
            Product(
                name = "Red label",
                photoUrl = "https://www.blogdelfotografo.com/wp-content/uploads/2020/12/producto_fondo_negro.webp",
                nameStore = "Tottus",
                price = 99.99,
                description = "Dentro de los licores encontramos al Whisky, una bebida alcohólica a base de malta fermentada de cereales como cebada, trigo, centeno y maíz, que se destila y añeja en barriles de madera tradicionalmente de roble blanco. Este último proceso dura por lo menos tres años para que adquiera el color caramelo que lo caracteriza. El Wisky tiene sus orígenes en Irlanda y Escocia y en la actualidad se disfruta en muchos países a nivel mundial.",
                specifications = mapOf(
                    Pair("Presentación", "Botella"),
                    Pair("Composición", "Grano y malta"),
                    Pair("Proceso de añejamiento", "No declarada"),
                    Pair("Volumen neto", "750ml"),
                )
            ),
            Product(
                name = "Red label",
                photoUrl = "https://www.blogdelfotografo.com/wp-content/uploads/2020/12/producto_fondo_negro.webp",
                nameStore = "Tottus",
                price = 99.99,
                description = "Dentro de los licores encontramos al Whisky, una bebida alcohólica a base de malta fermentada de cereales como cebada, trigo, centeno y maíz, que se destila y añeja en barriles de madera tradicionalmente de roble blanco. Este último proceso dura por lo menos tres años para que adquiera el color caramelo que lo caracteriza. El Wisky tiene sus orígenes en Irlanda y Escocia y en la actualidad se disfruta en muchos países a nivel mundial.",
                specifications = mapOf(
                    Pair("Presentación", "Botella"),
                    Pair("Composición", "Grano y malta"),
                    Pair("Proceso de añejamiento", "No declarada"),
                    Pair("Volumen neto", "750ml"),
                )
            ),
            Product(
                name = "Red label",
                photoUrl = "https://www.blogdelfotografo.com/wp-content/uploads/2020/12/producto_fondo_negro.webp",
                nameStore = "Tottus",
                price = 99.99,
                description = "Dentro de los licores encontramos al Whisky, una bebida alcohólica a base de malta fermentada de cereales como cebada, trigo, centeno y maíz, que se destila y añeja en barriles de madera tradicionalmente de roble blanco. Este último proceso dura por lo menos tres años para que adquiera el color caramelo que lo caracteriza. El Wisky tiene sus orígenes en Irlanda y Escocia y en la actualidad se disfruta en muchos países a nivel mundial.",
                specifications = mapOf(
                    Pair("Presentación", "Botella"),
                    Pair("Composición", "Grano y malta"),
                    Pair("Proceso de añejamiento", "No declarada"),
                    Pair("Volumen neto", "750ml"),
                )
            ),
            Product(
                name = "Red label",
                photoUrl = "https://www.blogdelfotografo.com/wp-content/uploads/2020/12/producto_fondo_negro.webp",
                nameStore = "Tottus",
                price = 99.99,
                description = "Dentro de los licores encontramos al Whisky, una bebida alcohólica a base de malta fermentada de cereales como cebada, trigo, centeno y maíz, que se destila y añeja en barriles de madera tradicionalmente de roble blanco. Este último proceso dura por lo menos tres años para que adquiera el color caramelo que lo caracteriza. El Wisky tiene sus orígenes en Irlanda y Escocia y en la actualidad se disfruta en muchos países a nivel mundial.",
                specifications = mapOf(
                    Pair("Presentación", "Botella"),
                    Pair("Composición", "Grano y malta"),
                    Pair("Proceso de añejamiento", "No declarada"),
                    Pair("Volumen neto", "750ml"),
                )
            ),
        )
    }
}
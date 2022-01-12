package com.example.dsm_appcliente.searchModule.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var mBinding: FragmentSearchBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentSearchBinding.bind(view)

        /*mBinding.fabSearch.setOnClickListener {
            findNavController().navigate(R.id.action_searchFragment_to_searchedProductsFragment)
        }*/
    }
}
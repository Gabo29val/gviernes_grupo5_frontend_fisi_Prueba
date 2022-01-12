package com.example.dsm_appcliente.searchModule.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentCategoriesBinding

class CategoriesFragment : Fragment(R.layout.fragment_categories) {
    private lateinit var mBinding: FragmentCategoriesBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentCategoriesBinding.bind(view)

        mBinding.root.setOnClickListener {
            Toast.makeText(mBinding.root.context, "Ahhhh", Toast.LENGTH_SHORT).show()
        }
    }
}
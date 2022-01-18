package com.example.dsm_appcliente.searchModule.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.navigation.fragment.findNavController
import com.example.dsm_appcliente.MainActivity
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentSearchBinding
import com.example.dsm_appcliente.searchModule.search.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var mBinding: FragmentSearchBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentSearchBinding.bind(view)

        setupTabs()
    }

    private fun setupTabs() {
        val adapter = activity?.let { ViewPagerAdapter(it.supportFragmentManager, it.lifecycle) }
        mBinding.viewPager.adapter = adapter

        TabLayoutMediator(mBinding.tabs, mBinding.viewPager){tab, position ->
            when(position){
                0 -> tab.text = "Categorias"
                1 -> tab.text = "Tiendas"
            }
        }.attach()

    }
}
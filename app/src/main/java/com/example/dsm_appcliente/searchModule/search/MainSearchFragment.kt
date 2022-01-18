package com.example.dsm_appcliente.searchModule.search

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentMainSearchBinding
import com.example.dsm_appcliente.databinding.FragmentSearchBinding
import com.example.dsm_appcliente.searchModule.search.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainSearchFragment : Fragment(R.layout.fragment_main_search) {

    private lateinit var mBinding: FragmentMainSearchBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding = FragmentMainSearchBinding.bind(view)

        mBinding.fabSearch.setOnClickListener {
            findNavController().navigate(R.id.action_mainSearchFragment_to_searchedProductsFragment)
        }

        setHasOptionsMenu(true)
        setupTabs()
        setupSearchView()
    }

    private fun setupSearchView() {
        val item = mBinding.toolbar.menu.findItem(R.id.action_search)
        val searchView: SearchView = item.actionView as SearchView
        searchView.setOnSearchClickListener {
            Toast.makeText(mBinding.root.context, "Ahhh", Toast.LENGTH_SHORT).show()
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                findNavController().navigate(R.id.action_mainSearchFragment_to_searchedProductsFragment)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })
    }

    private fun setupTabs() {
        val adapter = activity?.let { ViewPagerAdapter(it.supportFragmentManager, it.lifecycle) }
        mBinding.viewPager.adapter = adapter

        TabLayoutMediator(mBinding.tabs, mBinding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Categorias"
                1 -> tab.text = "Tiendas Cercanas"
            }
        }.attach()
    }
}
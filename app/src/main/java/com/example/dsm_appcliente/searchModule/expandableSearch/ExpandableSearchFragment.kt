package com.example.dsm_appcliente.searchModule.expandableSearch

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.dsm_appcliente.MainActivity
import com.example.dsm_appcliente.R
import com.example.dsm_appcliente.databinding.FragmentExpandableSearchBinding

class ExpandableSearchFragment : Fragment(R.layout.fragment_expandable_search) {

    private lateinit var mBinding: FragmentExpandableSearchBinding
    private var mActivity: MainActivity? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        mBinding = FragmentExpandableSearchBinding.bind(view)
        mActivity = activity as? MainActivity

        setToolbar()
    }

    private fun setToolbar() {
        //val toolbar = mBinding.toolbar as Toolbar
        mActivity?.supportActionBar?.setDisplayHomeAsUpEnabled(true) //back
        //activity.supportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        inflater.inflate(R.menu.menu_search, menu)
        super.onCreateOptionsMenu(menu, inflater)

        val item = menu.findItem(R.id.action_search)
        val searchView = item.actionView as SearchView

        searchView.onActionViewExpanded()
        searchView.requestFocus()

        item.expandActionView()

//        searchView.setIconifiedByDefault(false)
//        item.expandActionView()

        Toast.makeText(context, "Ahh", Toast.LENGTH_SHORT).show()
    }
}
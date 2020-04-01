package com.onebyte.eon.ui.home.fragments

import android.os.Bundle
import android.view.View
import com.onebyte.eon.R
import com.onebyte.eon.databinding.FragmentHomeBinding
import com.onebyte.eon.ui.base.BaseFragment
import com.onebyte.eon.ui.home.HomeViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    override val layoutId: Int get() = R.layout.fragment_home

    val TAG = HomeFragment::class.java.simpleName

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        setListeners()
    }

    private fun setListeners() {
    }

    private fun initViews() {
    }
}

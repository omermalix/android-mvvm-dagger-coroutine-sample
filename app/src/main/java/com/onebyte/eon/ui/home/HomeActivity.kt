package com.onebyte.eon.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.onebyte.eon.R
import com.onebyte.eon.databinding.ActivityHomeBinding
import com.onebyte.eon.ui.base.BaseActivity
import com.onebyte.eon.utils.ProgressHUD
import com.onebyte.eon.ui.home.fragments.HomeFragment
import javax.inject.Inject

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {

    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

    @Inject
    lateinit var progressHUD: ProgressHUD

    @Inject
    lateinit var homeFragment: HomeFragment

    override fun layoutId(): Int = R.layout.activity_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        setListeners()
    }

    private fun loadFragment(fragment: Fragment, tag: String){
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .setCustomAnimations(R.anim.slide_up, R.anim.slide_down)
            .replace(R.id.flHomeContainer, fragment, tag)
            .commit()
    }

    private fun initViews() {
        loadFragment(homeFragment, homeFragment.TAG)
    }

    private fun setListeners() {
    }

    override fun onBackPressed() {
        finish()
    }
}

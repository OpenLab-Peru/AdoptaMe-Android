package com.josemiz.adoptame.activities

import android.os.Bundle
import com.josemiz.adoptame.R
import com.josemiz.adoptame.navigators.LoginNavigator
import com.josemiz.adoptame.core.BaseViewModelActivity
import com.josemiz.adoptame.viewmodels.LoginViewModel

class MainActivity : BaseViewModelActivity<LoginViewModel, LoginNavigator>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

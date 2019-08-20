package com.josemiz.adoptame.activities

import android.os.Bundle
import com.josemiz.adoptame.R
import com.josemiz.adoptame.navigators.LoginNavigator
import com.josemiz.adoptame.core.BaseViewModelActivity
import com.josemiz.adoptame.viewmodels.LoginViewModel

class LoginActivity : BaseViewModelActivity<LoginViewModel>(), LoginNavigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setupObservers() {
        viewModel.saveUserSuccessfully.observe(this, Observer<Event<Unit>> {
            loginSuccessfully()
        })
        viewModel.setError.observe(this,Observer<Event<String>> {
            showErrorMessage(it.getContentIfNotHandled()?:"")
        })
    }

    override fun loginSuccessfully() {

    }

}

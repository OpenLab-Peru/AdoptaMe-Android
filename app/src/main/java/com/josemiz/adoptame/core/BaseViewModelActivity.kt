package com.josemiz.adoptame.core

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.josemiz.adoptame.core.extensions.obtainViewModel

abstract class BaseViewModelActivity<V : ViewModel,T> : BaseActivity() {
    lateinit var viewModel : V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = obtainViewModel(viewModel::class.java)
        setupObservers()
    }
    
    abstract fun setupObservers()
}

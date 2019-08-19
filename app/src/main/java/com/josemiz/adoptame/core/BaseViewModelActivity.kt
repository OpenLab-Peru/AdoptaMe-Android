package com.josemiz.adoptame.core

import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.josemiz.adoptame.core.extensions.obtainViewModel

abstract class BaseViewModelActivity<V : ViewModel,T> : BaseActivity() {
    private lateinit var viewModel : V
    private val navigator: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = obtainViewModel(viewModel::class.java)
    }
    
    abstract fun setupObservers()
}

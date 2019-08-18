package com.josemiz.adoptame.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josemiz.adoptame.core.Event

class LoginViewModel : ViewModel() {
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val phone = MutableLiveData<String>()

    private val saveUser = MutableLiveData<com.josemiz.adoptame.core.Event<Unit>>()
}
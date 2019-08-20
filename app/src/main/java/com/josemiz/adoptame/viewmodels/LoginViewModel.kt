package com.josemiz.adoptame.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.josemiz.adoptame.core.Event

class LoginViewModel : ViewModel() {
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val phone = MutableLiveData<String>()

    val setError = MutableLiveData<Event<String>>()
    val saveUserSuccessfully = MutableLiveData<Event<Unit>>()

    fun validateUser(){
        when{
            firstName.value.isNullOrBlank()->{
                setError.value = Event("First name can not be empty")
            }
            lastName.value.isNullOrBlank()->{
                setError.value = Event("First name can not be empty")
            }
            email.value.isNullOrBlank()->{
                setError.value = Event("First name can not be empty")
            }
            phone.value.isNullOrBlank()->{
                setError.value = Event("First name can not be empty")
            }
            else -> saveUserSuccessfully.value = Event(Unit)
        }
    }
}

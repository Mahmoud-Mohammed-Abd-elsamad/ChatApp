package com.example.chatapp.Register

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel:ViewModel() {

    val firstName = ObservableField<String>()
    var errorFirstName = ObservableField<String>()
    var lastName= ObservableField<String>()
    var errorlastName= ObservableField<String>()
    var userName= ObservableField<String>()
    var errorUserName= ObservableField<String>()
    var email= ObservableField<String>()
    var errorEmail= ObservableField<String>()
    var password= ObservableField<String>()
    var errorPassword= ObservableField<String>()


    fun createAccouent(){
        validate()
    }

    private fun validate() {
        if (firstName.get().toString().isNullOrBlank()){
            errorFirstName.set("please enter the first name")
        }
        if (lastName.get().toString().isNullOrBlank()){
            errorlastName.set("please enter the last name")
        }
        if (userName.get().toString().isNullOrBlank()){
            errorUserName.set(".please enter the user name")
        }
        if (email.get().toString().isNullOrBlank()){
            errorEmail.set("please enter the first name")
        }
        if (password.get().toString().isNullOrBlank()){
            errorPassword.set("please enter the first name")
        }
    }


}
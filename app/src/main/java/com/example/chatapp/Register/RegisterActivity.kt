package com.example.chatapp.Register

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.chatapp.R
import com.example.chatapp.base.BaseActiviyt
import com.example.chatapp.databinding.ActivityRegisterBinding

class RegisterActivity : BaseActiviyt<RegisterViewModel,ActivityRegisterBinding>(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding.vm = viewModel

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_register
    }

    override fun initilizeViewModel(): RegisterViewModel {
        return ViewModelProvider(this)[RegisterViewModel::class.java]
    }
}
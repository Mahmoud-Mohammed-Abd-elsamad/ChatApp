package com.example.chatapp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.chatapp.R
import com.example.chatapp.Register.RegisterViewModel

abstract  class BaseActiviyt<VM:ViewModel,DB:ViewDataBinding>:AppCompatActivity() {
    lateinit var viewModel:VM
    lateinit var viewBinding:DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, getLayoutId())
        viewModel = initilizeViewModel()

    }
        abstract fun getLayoutId():Int
        abstract fun initilizeViewModel():VM






}
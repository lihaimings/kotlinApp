package com.haiming.usercenter.presenter

import com.haiming.baselibrary.ext.execture
import com.haiming.baselibrary.presenter.view.BasePresenter
import com.haiming.baselibrary.rx.BaseSubscriber
import com.haiming.usercenter.presenter.view.RegisterView
import com.haiming.usercenter.service.impl.UserServiceImpl

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String, pwd: String) {
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .execture(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })

    }

    fun login(mobile: String, pwd: String) {
        val userService = UserServiceImpl()
        userService.register(mobile, "", pwd)
            .execture(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })
    }
}
package com.haiming.usercenter.service.impl

import io.reactivex.rxjava3.core.Observable

class UserServiceImpl:UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String)
            : Observable<Boolean> {

        return Observable.just(true)
    }
}
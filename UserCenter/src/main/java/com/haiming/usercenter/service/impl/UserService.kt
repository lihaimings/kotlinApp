package com.haiming.usercenter.service.impl

import io.reactivex.rxjava3.core.Observable
import java.util.*

interface UserService {
    fun register(mobile:String,verifyCode:String,pwd:String):Observable<Boolean>
}
package com.haiming.baselibrary.presenter.view

open class BasePresenter<T : BaseView> {
    lateinit var mView:T
}
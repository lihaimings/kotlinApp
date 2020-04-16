package com.haiming.baselibrary.UI.actvity

import com.haiming.baselibrary.presenter.view.BasePresenter
import com.haiming.baselibrary.presenter.view.BaseView

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T
}
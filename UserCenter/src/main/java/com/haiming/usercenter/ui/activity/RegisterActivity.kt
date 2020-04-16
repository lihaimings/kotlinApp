package com.haiming.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Toast
import com.haiming.baselibrary.UI.actvity.BaseMvpActivity
import com.haiming.usercenter.R
import com.haiming.usercenter.presenter.RegisterPresenter
import com.haiming.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mLoginBtn.setOnClickListener {
            mPresenter.login("", "")
        }
        mRegisterBtn.setOnClickListener {
            mPresenter.register("", "", "")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

}

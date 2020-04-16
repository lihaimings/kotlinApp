package com.haiming.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haiming.usercenter.R
import org.jetbrains.anko.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
//        verticalLayout {
//            padding = 30
//            editText {
//                hint = "Name"
//                textSize = 24f
//            }
//            editText {
//                hint = "Pwd"
//                textSize = 24f
//            }
//            button{
//                text = "Test"
//                onClick {
//                    toast("${intent.getIntExtra("id", -1)}")
//                }
//            }
//        }

    }
}

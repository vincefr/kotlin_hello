package com.capturemoi.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Hello : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        relativeLayout {
            padding = dp(32)
            id = R.id.login_main_container

            imageView(R.drawable.ic_logo).lparams {
                centerHorizontally()
            }
        }

        setupPresenter()
    }
}

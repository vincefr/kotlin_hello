package com.capturemoi.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Hello : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginUI.setContentView(this)

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

class LoginUI: AnkoComponent<LoginActivity>{
    override fun creativeView(ui: AnkoContext<LoginActivity>)= with(ui){
        relativeLayout {
            padding=dip(32)
            id=R.id.login_main_container
            backgroundColor=ContextCompat.getColor(ctx, R.color.colorRed)

            imageView(R.drawable.ic_logo).lparams {
                centerHorizontally()
            }
        }
    }
}
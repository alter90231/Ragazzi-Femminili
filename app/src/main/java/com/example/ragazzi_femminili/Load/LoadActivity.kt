package com.example.ragazzi_femminili.Load

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ragazzi_femminili.MainActivity
import com.example.ragazzi_femminili.R

class LoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)

        val imgLogo = findViewById<ImageView>(R.id.imgLogo)
        val txtBienvenido = findViewById<TextView>(R.id.txtBienvenido)

        val animacion = AnimationUtils.loadAnimation(this, R.anim.aparicion)

        txtBienvenido.startAnimation(animacion)
        imgLogo.startAnimation(animacion)

        Handler(Looper.getMainLooper()).postDelayed({
            iniciarAnimacion()
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        }, 2000)

    }

    private fun iniciarAnimacion(){
        val imgLogo = findViewById<ImageView>(R.id.imgLogo)

        val agrandado = AnimationUtils.loadAnimation(this, R.anim.agrandado)
        imgLogo.startAnimation(agrandado)
    }
}
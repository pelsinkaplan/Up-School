package com.pelsinkaplan.androidtweenanimationsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.pelsinkaplan.androidtweenanimationsampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            alpha.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.alpha)
                imageView.startAnimation(anim)
            }
            translate.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.translate)
                imageView.startAnimation(anim)
            }
            scale.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.scale)
                imageView.startAnimation(anim)
            }
            rotate.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
                imageView.startAnimation(anim)
            }
            custom.setOnClickListener {
                val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.all_anim)
                imageView.startAnimation(anim)
            }
        }
    }
}
package com.pelsinkaplan.layoutexerciseproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale
import com.pelsinkaplan.layoutexerciseproject.databinding.ActivityPremiumBinding

class PremiumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPremiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPremiumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val monthlySpannableString = SpannableStringBuilder()
            .bold {
                scale(1.5f) { color(Color.parseColor("#2C2B47")) { append("$11.99\n\n") } }
                color(Color.parseColor("#87869E")) { append("$11.99") }
                color(Color.parseColor("#B9B8C6")) { append(" per month\n\n") }
                color(Color.parseColor("#87869E")) { append("$143.99") }
                color(Color.parseColor("#B9B8C6")) { append(" per year") }
            }
        binding.premiumLeftRectangleTextview.text = monthlySpannableString

        val yearlySpannableString = SpannableStringBuilder()
            .bold {
                scale(1.5f) { color(Color.parseColor("#2C2B47")) { append("$4.99\n\n") } }
                color(Color.parseColor("#87869E")) { append("$4.99") }
                color(Color.parseColor("#B9B8C6")) { append(" per month\n\n") }
                color(Color.parseColor("#87869E")) { append("$59.99") }
                color(Color.parseColor("#B9B8C6")) { append(" per year") }
            }
        binding.premiumRightRectangleTextview.text = yearlySpannableString

    }
}
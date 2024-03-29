package com.bagicode.petikkopi.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagicode.petikkopi.R
import com.bagicode.petikkopi.home.HomeActivity
import kotlinx.android.synthetic.main.activity_onboarding_two.*

class OnboardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        btn_home.setOnClickListener {
            startActivity(Intent(this@OnboardingTwoActivity, OnboardingTreeActivity::class.java))
        }

        btn_skip.setOnClickListener {
            startActivity(Intent(this@OnboardingTwoActivity, HomeActivity::class.java))
        }
    }
}
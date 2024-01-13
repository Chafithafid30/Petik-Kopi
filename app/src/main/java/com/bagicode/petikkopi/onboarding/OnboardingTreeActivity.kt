package com.bagicode.petikkopi.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagicode.petikkopi.R
import com.bagicode.petikkopi.home.HomeActivity
import kotlinx.android.synthetic.main.activity_onboarding_tree.*

class OnboardingTreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_tree)

        btn_home.setOnClickListener {
            startActivity(Intent(this@OnboardingTreeActivity, HomeActivity::class.java))
        }
    }
}
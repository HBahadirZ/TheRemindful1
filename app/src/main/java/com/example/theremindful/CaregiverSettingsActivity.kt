package com.example.theremindful

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CaregiverSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caregiver_settings)

        // Enable the action bar back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        // Handles the action when the back button is pressed
        onBackPressed()
        return true
    }
}

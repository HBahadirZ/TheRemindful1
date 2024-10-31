package com.example.theremindful

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to the parent ViewPager2 for horizontal swiping between themes
        val parentViewPager = findViewById<ViewPager2>(R.id.parentViewPager)

        // Set the adapter for the parent ViewPager2
        parentViewPager.adapter = ParentAdapter(this)

        // Set the orientation for horizontal swiping
        parentViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // Reference to the Floating Action Button to open Caregiver Settings
        val fabSettings = findViewById<FloatingActionButton>(R.id.fabSettings)

        // Handle click on the Floating Action Button to open Caregiver Settings Activity
        fabSettings.setOnClickListener {
            val intent = Intent(this, CaregiverSettingsActivity::class.java)
            startActivity(intent)
        }
    }
}

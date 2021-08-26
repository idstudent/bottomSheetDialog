package com.example.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val bottomDialogFragment = BottomDialogFragment {
                when (it) {
                    0 -> Toast.makeText(this, "추천순", Toast.LENGTH_SHORT).show()
                    1 -> Toast.makeText(this, "리뷰순", Toast.LENGTH_SHORT).show()
                }
            }

            bottomDialogFragment.show(supportFragmentManager, bottomDialogFragment.tag)
        }
    }
}
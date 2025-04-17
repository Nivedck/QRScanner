package com.nivedck.qrscanner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nivedck.qrscanner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGenerate.setOnClickListener {
            startActivity(Intent(this, QRGeneratorActivity::class.java))
        }

        binding.btnScan.setOnClickListener {
            startActivity(Intent(this, QRScannerActivity::class.java))
        }
    }
}
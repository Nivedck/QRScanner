// File: app/src/main/java/com/nivedck/qrscanner/QRGeneratorActivity.kt

package com.nivedck.qrscanner

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.journeyapps.barcodescanner.BarcodeEncoder
import com.google.zxing.BarcodeFormat

class QRGeneratorActivity : AppCompatActivity() {

    private lateinit var etQRCodeInput: EditText
    private lateinit var btnGenerateQRCode: Button
    private lateinit var ivQRCode: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_generator)

        etQRCodeInput = findViewById(R.id.etQRCodeInput)
        btnGenerateQRCode = findViewById(R.id.btnGenerateQRCode)
        ivQRCode = findViewById(R.id.ivQRCode)

        btnGenerateQRCode.setOnClickListener {
            val inputText = etQRCodeInput.text.toString()
            if (inputText.isNotEmpty()) {
                generateQRCode(inputText)
            } else {
                Toast.makeText(this, "Please enter text to generate QR code", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun generateQRCode(text: String) {
        try {
            val barcodeEncoder = BarcodeEncoder()
            val bitmap: Bitmap = barcodeEncoder.encodeBitmap(text, BarcodeFormat.QR_CODE, 800, 800)
            ivQRCode.setImageBitmap(bitmap)
        } catch (e: Exception) {
            Toast.makeText(this, "Error generating QR code", Toast.LENGTH_SHORT).show()
        }
    }
}

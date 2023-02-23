package edu.temple.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class textSizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_size)

        val textSizes = intent.getFloatExtra(key, 22F)

        with (findViewById<TextView>(R.id.changeTextSize)) {
            text = textSizes.toString()
            textSize = textSizes
        }
    }
}
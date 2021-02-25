package se.ifmo.pepe

import android.os.Bundle
import android.view.Window
import androidx.annotation.ContentView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
    }
}
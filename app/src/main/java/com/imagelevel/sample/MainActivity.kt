package com.imagelevel.sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.iv_display)
    }

    var level = 0;
    fun click(view: View) {
        if(level >= 8){
            level = 0;
        }
        imageView.setImageLevel(level);
        level++
    }

    fun toBackgroundActivity(view: View) { startActivity(Intent(this,BackgroundActivity::class.java))}
}
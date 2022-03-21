package com.imagelevel.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BackgroundActivity extends AppCompatActivity {
    private View display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);
        display = findViewById(R.id.v_display);
    }
    int level = 0;
    public void click(View view) {
        if(level >= 8){
            level = 0;
        }
        display.getBackground().setLevel(++level);
    }
}
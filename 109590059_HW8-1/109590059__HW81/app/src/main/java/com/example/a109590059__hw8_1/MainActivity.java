package com.example.a109590059__hw8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView battery;
    int level = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.battery);
    }
    public void lightUp(View view){
        if(level < 8 ){
            level += 1;
        }
        battery.setImageLevel(level);
    }

    public void lightDown(View view){
        if(level > 1){
            level -= 1;
        }
        battery.setImageLevel(level);
    }
}
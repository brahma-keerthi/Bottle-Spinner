package com.example.bottlespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void spin( View v ){
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.animate().rotation((float) (Math.random() * 100000000.0f * Math.random() * 1000000000.0f));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
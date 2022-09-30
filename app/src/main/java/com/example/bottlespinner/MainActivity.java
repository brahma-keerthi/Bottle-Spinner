package com.example.bottlespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void spin( View v ){
        ImageView image = (ImageView) findViewById(R.id.imageView);

        Random random = new Random();
        image.animate().rotation((float) (random.nextInt(100000)  * 1000000000.0f)).setDuration(3000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
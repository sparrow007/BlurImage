package com.jackandphantom.blurimageproject;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageblur);
        //Bitmap bitmap = BlurImage.with(getApplicationContext()).load(R.drawable.ankit).intensity(15).getImageBlur();
        //imageView.setImageBitmap(bitmap);

        //BlurImage.with(getApplicationContext()).load(R.drawable.ankit).intensity(15).Async(false).into(imageView);
    }
}

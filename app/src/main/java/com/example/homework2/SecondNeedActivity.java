package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondNeedActivity extends AppCompatActivity {

       Button bntOpen, bntCamera, bntGallery;
       
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_need);
        bntOpen = findViewById(R.id.chrome_bnt);
        bntCamera = findViewById(R.id.camera_bnt);
        bntGallery =  findViewById(R.id.gallery_bnt);


        bntOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                   startActivity(intent);
            }
        });

        bntCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent camera = new Intent(Intent.ACTION_CAMERA_BUTTON);
                    startActivity(camera);
            }
        });

           bntGallery.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent gallery = new Intent(Intent.CATEGORY_APP_GALLERY);
                   startActivity(gallery);
               }
           });



    }
}
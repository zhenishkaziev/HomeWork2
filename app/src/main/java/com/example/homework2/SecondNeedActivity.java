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
    ImageView imPhoto;
    Button bntOpen, bntCamera, bntGallery;
    int RECUECT = 1;
    Uri photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_need);
        bntOpen = findViewById(R.id.chrome_bnt);
        bntCamera = findViewById(R.id.camera_bnt);
        bntGallery = findViewById(R.id.gallery_bnt);


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
                Intent camera = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(camera);
            }
        });

        bntGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivity(gallery);
            }
        });
//         imPhoto.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//
//                 Intent imageGetter = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                 startActivityForResult(imageGetter, RECUECT);
//             }
//         });
//        }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data)
//    {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == RECUECT && resultCode == RESULT_OK && null != data);
//          photo =  data.getData();
//          imPhoto.setImageURI(photo);
//       }
//    }


    }
}
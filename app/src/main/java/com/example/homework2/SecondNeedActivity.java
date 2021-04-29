package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStream;
import java.io.InputStream;import java.io.InputStream;

public class SecondNeedActivity extends AppCompatActivity {
    Button bntOpen, bntCamera, bntGallery;
     final int RECUST = 1;
    ImageView imPhoto;
    Uri uri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_need);
        bntOpen = findViewById(R.id.chrome_bnt);
        bntCamera = findViewById(R.id.camera_bnt);
        bntGallery = findViewById(R.id.gallery_bnt);
        imPhoto = findViewById(R.id.photo_im);


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
                Intent gallery = new Intent(Intent.ACTION_PICK);
                gallery.setType("image/*");
                startActivityForResult(gallery, RECUST);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        switch (requestCode){
            case RECUST:
        if ( resultCode == RESULT_OK){
            try {
                final Uri imageUri = imageReturnedIntent.getData();
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                imPhoto.setImageBitmap(selectedImage);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        }}}



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



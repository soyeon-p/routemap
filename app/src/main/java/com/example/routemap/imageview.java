package com.example.routemap;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imageview extends AppCompatActivity {
   //Bitmap bitmap;
   //ImageView imageView;
    private Button btn_image;
    private Button next3;
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_imageview);
      btn_image = findViewById(R.id.btn_image);
      btn_image.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(imageview.this, make_marker.class);
              startActivity(intent);
          }
      });
  }}
  //}
   //public void showCameraBtn(View view)
   //{
     //   Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    //   activityResultPicture.launch(intent);
   //}

  // ActivityResultLauncher<Intent> activityResultPicture = registerForActivityResult(
         //   new ActivityResultContracts.StartActivityForResult(),
       //    new ActivityResultCallback<ActivityResult>() {
               //@Override
             // public void onActivityResult(ActivityResult result) {
                 //   if(result.getResultCode() == RESULT_OK && result.getData() !=null){
                //        Bundle extras = result.getData().getExtras();
              //         bitmap = (Bitmap)extras.get("data");
            //            imageView.setImageBitmap(bitmap);
          //          }
        //        }
      //     }
    //);

   // protected void onCreate(Bundle savedInstanceState) {
     //   super.onCreate(savedInstanceState);
    //setContentView(R.layout.activity_imageview);

      //  imageView = (ImageView) findViewById(R.id.imageView);
       // useimage = findViewById(R.id.useimage);
        //useimage.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View view) {
           //     Intent intent = new Intent(imageview.this,make_marker.class);
            //    startActivity(intent);
           // }
        //});



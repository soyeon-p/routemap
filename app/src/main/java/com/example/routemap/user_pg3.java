package com.example.routemap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class user_pg3 extends AppCompatActivity {
    private Button like_btn;
    private TextView tv_count;
    private int count = 0;
    private Button next2; //코멘트 창 띄우기
    Dialog user_pg4;  //코멘트 다이얼로그

    public void onCustomToggleClick(View view){
        Toast.makeText(this,"like",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_pg3);

        user_pg4 = new Dialog(user_pg3.this);
        user_pg4.setContentView(R.layout.activity_user_pg4);

        findViewById(R.id.next2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showcoment();
            }
        });
    }
    public void showcoment(){ //dialog design 함수
        user_pg4.show(); //dialog 띄우기


    Button done = user_pg4.findViewById(R.id.done); // x 버튼
    done.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            user_pg4.dismiss();
        }
    });


        }}









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
    private Button like;
    private TextView tv_count;
    private int count = 0;

    private Button next2; //코멘트 창 띄우기
    Dialog user_pg4;  //코멘트 다이얼로그



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_pg3);

        user_pg4 = new Dialog(user_pg3.this);
        user_pg4.setContentView(R.layout.activity_user_pg4);
// 팝업창 띄우는 버튼 next2
        findViewById(R.id.next2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showcoment(); //아래 showcomment 함수호출
            }
        });
    }


    public void showcoment(){ //dialog design 함수


        user_pg4.show(); //dialog 띄우기
        //tv_count = findViewById(R.id.tv_count);
       // tv_count.setText(count+"");

        Button like = user_pg4.findViewById(R.id.like);
    like.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           Toast.makeText(user_pg3.this,"like",Toast.LENGTH_SHORT).show();
           //if(count == 0)
           //{count++;
            //tv_count.setText(count+"");}
            //else if(count == 1)
            //{count--;
            //tv_count.setText(count+"");}
        }
    });

    Button done = user_pg4.findViewById(R.id.done); // x 버튼
    done.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            user_pg4.dismiss();
        }
    });


        }}









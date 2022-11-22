package com.example.routemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button c_route;
    private Button u_route;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        u_route = findViewById(R.id.u_route);
        u_route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this,user_pg2.class);  //home 에서 main으로
                startActivity(intent); //액티비티 이동
            }


        }
        );
        c_route = findViewById(R.id.c_route);
        c_route.setOnClickListener(new View.OnClickListener() { //사진찍는곳으로 이동
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, imageview.class);
                startActivity(intent);
            }
        });




}

;



}


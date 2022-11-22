package com.example.routemap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class makeroute extends AppCompatActivity {
    private Button makeroute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeroute);

        makeroute = findViewById(R.id.makeroute);
        makeroute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(makeroute.this,coment.class); //코멘트 달기로 넘어감
                startActivity(intent);
            }
        });
    }
}
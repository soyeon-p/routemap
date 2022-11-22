package com.example.routemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class make_marker extends AppCompatActivity {
    private Button route_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_marker);
        route_view = findViewById(R.id.route_view);
        route_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(make_marker.this, coment.class);
                startActivity(intent);
            }
        });

    }
}
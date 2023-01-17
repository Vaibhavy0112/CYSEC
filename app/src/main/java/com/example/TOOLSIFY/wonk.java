package com.example.TOOLSIFY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class wonk extends AppCompatActivity {
    Button goth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonk);
        Objects.requireNonNull(getSupportActionBar()).setTitle("FWonk");
        goth = findViewById(R.id.goth);
        goth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wonk.this, wonkWV.class);
                startActivity(intent);
            }
        });
    }
}
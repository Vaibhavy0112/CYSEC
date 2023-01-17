package com.example.TOOLSIFY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizdash extends AppCompatActivity {

    Button quiz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizdash);

        quiz1 = findViewById(R.id.test1);

        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quizdash.this, quiz1.class);
                startActivity(intent);
            }
        });
    }
}
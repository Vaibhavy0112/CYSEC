package com.example.TOOLSIFY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Shodan extends AppCompatActivity {
    Button goth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shodan);
        getSupportActionBar().setTitle("Shodan");
        goth = findViewById(R.id.goth);
        goth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Shodan.this, ShodanWV.class);
                startActivity(intent);
            }
        });
//        goth.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://www.shodan.io/";
//                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(i);
//            }
//        });
    }
}
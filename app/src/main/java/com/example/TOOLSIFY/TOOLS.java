package com.example.TOOLSIFY;

import static com.example.TOOLSIFY.LoginActivity.shared_pref;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class TOOLS extends AppCompatActivity {
    CardView Thumb, shodan, pku, netcraft, wonk, logout;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        getSupportActionBar().setTitle("Tools");
        Thumb = findViewById(R.id.thumb);
        shodan = findViewById(R.id.shodan);
        pku = findViewById(R.id.pku);
        netcraft = findViewById(R.id.netcraft);
        wonk = findViewById(R.id.wonk);
        logout = findViewById(R.id.logout);
        Thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TOOLS.this, webv.class);
                startActivity(intent);
            }
        });
        shodan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TOOLS.this, Shodan.class);
                startActivity(intent);
            }
        });
        pku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TOOLS.this, Pku.class);
                startActivity(intent);
            }
        });
        netcraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TOOLS.this, netcraft.class);
                startActivity(intent);
            }
        });
        wonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TOOLS.this, wonk.class);
                startActivity(intent);
            }
        });
    }
}
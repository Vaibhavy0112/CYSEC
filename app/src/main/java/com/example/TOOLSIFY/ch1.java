package com.example.TOOLSIFY;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ch1 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1);
        getSupportActionBar().setTitle("CHAPTER : 01");

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("SDN_IOT REPORT.pdf").load();
        pdfView.fromAsset("SDN_IOT REPORT.pdf").pageSnap(true);
        pdfView.useBestQuality(true);
        pdfView.fitToWidth(0);
        pdfView.setMinZoom(60);
        pdfView.setMidZoom(80);
        pdfView.setMaxZoom(100);




    }
}
package com.stonybrook.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void openVideoList (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openFileList (View v){
        Intent intent = new Intent(this, FileViewer.class);
        startActivity(intent);
    }
}
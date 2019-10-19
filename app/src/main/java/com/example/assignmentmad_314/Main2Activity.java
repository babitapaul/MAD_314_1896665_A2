package com.example.assignmentmad_314;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView view = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

    }
}

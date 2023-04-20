package com.example.mylogintask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class loginpage2 extends AppCompatActivity {
    TextView alreadyhaveaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage2);
        alreadyhaveaccount = findViewById(R.id.alreadyhaveaccount);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        alreadyhaveaccount.setOnClickListener(view -> {
            Intent in = new Intent(loginpage2.this, loginpage2.class);
            startActivity(in);

        });
    }
}
package com.example.mylogintask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    EditText mail,password;
    TextView createnewAccount;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createnewAccount = findViewById(R.id.createnewaccount);
        mail = findViewById(R.id.editmail);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = editmail.getText().toString();
            }
        });
       createnewAccount.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, loginpage2.class);
            startActivity(in);

        });
    }
}
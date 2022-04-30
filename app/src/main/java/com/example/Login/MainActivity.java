package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    boolean is_number = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Username = findViewById(R.id.editTextTextEmailAddress);
        TextView Password = findViewById(R.id.editTextTextPassword);
        Button Login = findViewById(R.id.button);
        Button MobileNumber =  findViewById(R.id.button2);
        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                boolean isAuthenticated = Login(Username, Password);
            }
        });
        MobileNumber.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!is_number){
                    MobileNumber.setText("Use Email");
                    Username.setHint("Mobile Number");
                    is_number = true;
                    return;
                }
                MobileNumber.setText("Use Mobile Number");
                Username.setHint("Email");
                is_number = false;
            }
        });
    }
    public boolean Login(TextView user, TextView password){
        user.setText(null);
        password.setText(null);
        return false;
    }

}
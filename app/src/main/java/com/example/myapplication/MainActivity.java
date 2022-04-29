package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Username = findViewById(R.id.editTextTextEmailAddress);
        TextView Password = findViewById(R.id.editTextTextPassword);
        Button Login = findViewById(R.id.button);
        Button MobileNumber =  findViewById(R.id.button2);

    }
    

}
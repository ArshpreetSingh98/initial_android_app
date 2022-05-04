package com.example.birthadywishingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.editTextTextPersonName);
        next=findViewById(R.id.button);
        password=findViewById(R.id.editTextTextPassword);

        next.setOnClickListener(view -> {
            if(password.getText().toString().equals("bestie")){
                Intent my = new Intent(MainActivity.this,MainActivity2.class);
                my.putExtra("Name",name.getText().toString());
                startActivity(my);
                finish();
            }else{
                Toast.makeText(MainActivity.this, "Please try again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
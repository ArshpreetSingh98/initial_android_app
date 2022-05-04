package com.example.birthadywishingapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    MediaPlayer m;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text=findViewById(R.id.textView2);

        text.setSelected(true);

    Intent h = getIntent();
    String name2 = h.getStringExtra("Name");
    text.setText("Happy birthday " + name2 + " may god bless you !!!!!!!.....");

    Toast.makeText(this, "Happy birthday " + name2, Toast.LENGTH_LONG).show();

    m = new MediaPlayer();
    m = MediaPlayer.create(this, R.raw.happybirthdaysong);
    m.start();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        m.stop();
        m = null;
    }
}
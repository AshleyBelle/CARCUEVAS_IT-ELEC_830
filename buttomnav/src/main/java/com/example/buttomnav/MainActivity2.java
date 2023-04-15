package com.example.buttomnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.buttomnav.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        String fromMain = intent.getStringExtra("PASS_ME");

        textView.setText(fromMain);
    }
}
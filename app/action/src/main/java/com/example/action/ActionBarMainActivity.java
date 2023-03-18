package com.example.action;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;

public class ActionBarMainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_main);

        ActionBar actionBar = getActionBar();

        actionBar.setTitle(" Gfg | ActionBar");

        actionBar.setSubtitle("This is an action bar");

        actionBar.setSubtitle(R.drawable.ic_launcher_background);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    //@Override
    //public boolean onOptionsItemSelected(Menu menu)

}
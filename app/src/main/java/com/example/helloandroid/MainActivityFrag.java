package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;

import android.app.Fragment;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivityFrag extends AppCompatActivity {

    Button firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frag);
        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);

        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FragmentA());
            }
        });
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FragmentB());
            }
        });
    }
    private void loadFragment(Fragment fragment){
        FragmentManager fn = getFragmentManager();
        FragmentTransaction fragmentTransaction = fn.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();

    }
}
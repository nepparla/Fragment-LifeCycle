package com.dev.fragmentlife;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    String TAG = "FragMent-LIfeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fragButton1, fragButton2;
        fragButton1 = findViewById(R.id.frament1Btn);
        fragButton2 = findViewById(R.id.frament2Btn);
        fragButton1.setOnClickListener(this::selectFragment);
        fragButton2.setOnClickListener(this::selectFragment);

    }

    void selectFragment(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.frament1Btn:
                Log.d(TAG, "selectFragment: frag1");
                fragment = new Fragment1();
                break;
            case R.id.frament2Btn:
                Log.d(TAG, "selectFragment: frag2");
                fragment = null;
                fragment = new Fragment2();
                break;
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmemt_initial, fragment);
        fragmentTransaction.commit();

    }
}
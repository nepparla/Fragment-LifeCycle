package com.dev.fragmentlife;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void selectFragment(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.frament1Btn:
                fragment = new Fragment1();
            case R.id.frament2Btn:
                fragment = new Fragment2();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmemt_initial, fragment);
        fragmentTransaction.commit();

    }
}
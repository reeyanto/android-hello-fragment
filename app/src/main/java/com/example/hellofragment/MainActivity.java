package com.example.hellofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilHomeFragment();

        navView = findViewById(R.id.nav_bottom_nav_view);
        navView.setOnItemSelectedListener(view -> {
            switch (view.getItemId()) {
                case R.id.menu_home:
                    tampilHomeFragment();
                    break;

                case R.id.menu_setting:
                    tampilSettingFragment();
                    break;
            }
            return true;
        });

    }

    private void tampilHomeFragment() {
        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.fl_frame_layout, new HomeFragment())
            .commit();
    }

    private void tampilSettingFragment() {
        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.fl_frame_layout, new SettingFragment())
            .commit();
    }
}
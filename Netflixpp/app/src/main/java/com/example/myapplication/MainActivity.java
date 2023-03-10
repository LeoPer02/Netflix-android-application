package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Bundle bundle = new Bundle();
    FragmentHome fragmentHome = new FragmentHome();
    FragmentUser fragmentUser = new FragmentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.Theme_Main);
        Intent intent = getIntent();
        bundle.putString("user", intent.getStringExtra("user"));
        bundle.putString("pass", intent.getStringExtra("pass"));
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.footer_home);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.footer_home:
                fragmentHome.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragmentHome).commit();
                return true;

            case R.id.footer_user:
                fragmentUser.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, fragmentUser).commit();
                return true;
        }
        return false;
    }
}
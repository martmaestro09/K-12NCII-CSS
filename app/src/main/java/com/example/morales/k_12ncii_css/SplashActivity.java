package com.example.morales.k_12ncii_css;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent splashIntent = new Intent(this, MainActivity.class);
        startActivity(splashIntent);
        finish();
    }
}

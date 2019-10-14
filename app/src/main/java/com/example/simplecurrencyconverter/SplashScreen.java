package com.example.simplecurrencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.os.*;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // Intent intent = new Intent(this, MainActivity.class);
       // startActivity(intent);
       // finish();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the MainActivity. */
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);
    }


}
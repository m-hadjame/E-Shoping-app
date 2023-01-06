package com.example.e_shoping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, PhoneMagazin.class));
                finish();
            }
        });
    }
}

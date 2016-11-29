package com.hongri.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import phone.hongri.com.myjar.Logger;
import phone.hongri.com.myliberay.LibraryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.d("哈哈");
        Intent intent = new Intent(this, LibraryActivity.class);
        startActivity(intent);
    }
}

package com.gswi.gitlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("This is second commit");
        System.out.println("This is 4 commit");

        System.out.println("Next commit");
        System.out.println("test commit");
    }
}
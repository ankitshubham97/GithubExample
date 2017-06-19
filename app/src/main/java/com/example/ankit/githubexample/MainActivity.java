package com.example.ankit.githubexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //first change:
        Toast.makeText(MainActivity.this,"Hello world!",Toast.LENGTH_SHORT).show();
        //second change:
        Toast.makeText(MainActivity.this,"Hello world again!",Toast.LENGTH_SHORT).show();
        //third change:
        Toast.makeText(MainActivity.this,"Hello world again 3!",Toast.LENGTH_SHORT).show();
    }
}

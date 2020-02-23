package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button mtruebutton;
         Button mfalsebutton;

        mtruebutton = (Button)findViewById(R.id.mtruebutton);
        mtruebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.Incorrect_toast,Toast.LENGTH_SHORT).show();
            }
        });
        mfalsebutton = (Button)findViewById(R.id.mfalsebutton);
        mfalsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.Correct_toast,Toast.LENGTH_SHORT).show();
            }
        });

    }

}

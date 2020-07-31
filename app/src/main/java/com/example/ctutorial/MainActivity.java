package com.example.ctutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.view;
public class MainActivity extends AppCompatActivity {

    public void axx(view view){
      Log.i(tag:"this",msg:"axx:this is a message");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
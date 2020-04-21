package com.example.lesson4c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.text1);
    }

    public void saveInfo(View view) {

        SharedPreferences.Editor editor = getSharedPreferences("MyPreference", MODE_PRIVATE).edit();

        editor.putString("info", "new info");
        editor.apply();
        editor.commit();
        Log.d("savedInfo","Was saved");
    }

    public void showInfo(View view) {

        SharedPreferences prefs = getSharedPreferences("MyPreference", MODE_PRIVATE);

        String savedInfo =  prefs.getString("info", "Blank info");

        Log.d("savedInfo",savedInfo);

    }



}

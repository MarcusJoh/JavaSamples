package com.example.lesson4a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callActivity(View view) {
        Intent i = new Intent(getApplicationContext(), BActivity.class);
        i.putExtra("Value1", "tex");
        i.putExtra("Value2", "tex");

        startActivity(i);

    }
}

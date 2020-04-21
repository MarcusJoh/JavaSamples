package com.example.lesson4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BActivity4R extends AppCompatActivity {
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_activity4_r);
        editText1=(EditText)findViewById(R.id.editText);
    }

    public void callActivity(View view) {

        String message=editText1.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("MESSAGE",message);
        setResult(2,intent);
        finish();//finishing activity


    }
}

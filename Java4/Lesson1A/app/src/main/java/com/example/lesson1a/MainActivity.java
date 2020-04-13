package com.example.lesson1a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       addListenerOnButton();


    }

    public void addListenerOnButton() {

        buttonHi = (Button) findViewById(R.id.buttonHi);

        buttonHi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String text="text";
                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG).show();

                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
                } else {
                    //deprecated in API 26
                    v.vibrate(500);
                }

            }
        }
        );
    }
}

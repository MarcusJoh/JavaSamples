package com.example.lesson3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked "+getApplication());


        setContentView(R.layout.activity_main);
        cb1=(CheckBox)findViewById(R.id.checkBox3);
         button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb=new StringBuilder("");

                if(cb1.isChecked()){
                    String s1=cb1.getText().toString();
                    sb.append(s1);
                }

                if(cb2.isChecked()){
                    String s2=cb2.getText().toString();
                    sb.append("\n"+s2);

                }
                if(sb!=null && !sb.toString().equals("")){
                    Toast.makeText(getApplicationContext(), sb, Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Nothing Selected", Toast.LENGTH_LONG).show();
                }

            }

        });








    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked "+getApplication());

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked "+getApplication());
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked "+getApplication());
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked "+getApplication());
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked "+getApplication());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked "+getApplication());
    }
}

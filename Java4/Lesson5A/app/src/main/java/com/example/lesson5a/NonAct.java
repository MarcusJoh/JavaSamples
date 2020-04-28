package com.example.lesson5a;

import android.content.Context;
import android.util.Log;

public class NonAct {
 Context locContext;

    public NonAct(Context context) {

        locContext= context;




    }

     public void aMethod(){

         String AString= locContext.getResources().getString(R.string.app_name);
         Log.d(" nam",AString);

    }
}



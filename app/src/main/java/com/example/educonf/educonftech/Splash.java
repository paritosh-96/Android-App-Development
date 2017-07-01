package com.example.educonf.educonftech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(5000);
                    Intent i=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);

                }catch (Exception e)
                {
                    //do nothing
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();

    }

}

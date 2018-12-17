package com.example.arip.amalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final int welcomeScreenDisplay = 3000;
        Thread welcomeThread = new Thread(){

            int wait = 2000;
            @Override
            public void run (){
                try {
                    super.run();
                    while (wait < welcomeScreenDisplay){
                        sleep(100);
                        wait += 100;
                    }
                } catch (Exception e){
                    System.out.println("EXc=" + e);
                } finally {
                    Intent intent = new Intent(SplashActivity.this,HomeActivity.class);
                    finish();
                    startActivity(intent);
                }
            }
        };
        welcomeThread.start();
    }
}

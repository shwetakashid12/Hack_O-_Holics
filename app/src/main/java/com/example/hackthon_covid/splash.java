package com.example.hackthon_covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
Thread object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      splash();
    }
    private  void splash()
    {
        try{
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.trans);
            animation.reset();
            ImageView i = findViewById(R.id.imageView);
            TextView t1 = findViewById(R.id.textView3);
            i.clearAnimation();
            t1.clearAnimation();
            i.startAnimation(animation);
            t1.startAnimation(animation);
            object = new Thread()

            {
                @Override
                public void run() {
                    int pause =0;
                    while(pause<6000)
                    {
                        try {
                            sleep(100);
                        }catch (Exception e)
                        {
                        }
                        pause = pause +100;
                    }
                    Intent i = new Intent(splash.this,login.class);
                    startActivity(i);
                    splash.this.finish();
                }

            };
            object.start();

        }catch (Exception e){

        }
    }
}

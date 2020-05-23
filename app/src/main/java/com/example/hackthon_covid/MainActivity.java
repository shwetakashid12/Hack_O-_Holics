package com.example.hackthon_covid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button b1, back;
    ViewFlipper v_flip;

  ImageView b2,b4;
  ImageView one;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v_flip = findViewById(R.id.a);




        one=findViewById(R.id.count);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,count_start.class);
                startActivity(intent);
            }
        });
        back=findViewById(R.id.btn_bk);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,fire_mainscreen.class);
                startActivity(intent);
            }
        });





        int img1[] = {R.drawable.mask, R.drawable.sanitize, R.drawable.soap, R.drawable.wash_hands, R.drawable.handshake, R.drawable.social_distancing};

        for (int image : img1) {
            Slideimgs(image);
        }

        b4 = findViewById(R.id.Helpline);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HelpLine_No.class);
                startActivity(intent);
            }
        });
    }


    public void Slideimgs(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flip.addView(imageView);
        v_flip.setFlipInterval(3000);
        v_flip.setAutoStart(true);
    }
    public void new_act(View view){
        b2 = findViewById(R.id.News);
        Intent intent1 = new Intent(MainActivity.this, TRENDING_RUMORS_ABOUT_CORONA.class);
        startActivity(intent1);
    }
}

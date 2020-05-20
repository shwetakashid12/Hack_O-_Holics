package com.example.activitycycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    AlertDialog.Builder builder;
    AlertDialog alertDialog;
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        {

        }
        Log.i("OnCreate", "Activity created");

        b1=findViewById(R.id.button1);
        builder=new AlertDialog.Builder(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setTitle("Alert BOX");
                builder.setMessage("Do U want to delete");

                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"Presing OK !!!!",Toast.LENGTH_LONG).show();

                        finish();
                        System.exit(0);
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"Pressed No",Toast.LENGTH_LONG).show();
                    }
                });

                alertDialog=builder.create();

                alertDialog.show();





            }


        });







    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("OnResume","Activity Resumed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("OnStart","Activity Stopprd");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart","Activity Started");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("OnPause","Activity Resumed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("OnDestroy","Activity Destroyed");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.item3:
                AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setIcon(R.drawable.ic_launcher_background);
                ab.setTitle("Exit Alert !!!");
                ab.setMessage("Are you sure to exit?");
                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
                ab.setNeutralButton("can't say", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog ad =ab.create();
                ad.show();
//                finish();
//                System.exit(0);
                break;
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Edited",Toast.LENGTH_LONG).show();

                break;

        }
        return super.onOptionsItemSelected(item);
    }
}

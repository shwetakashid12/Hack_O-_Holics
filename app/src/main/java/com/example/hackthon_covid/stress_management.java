package com.example.hackthon_covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class stress_management extends AppCompatActivity {
    private static final int req_id = 1;
    Button b1;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress_management);
        b1=findViewById(R.id.b1);
        textView=findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Intent.ACTION_CALL);
                i1.setData(Uri.parse("tel:18009855990"));
                if(ContextCompat.checkSelfPermission(stress_management.this,
                        Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(stress_management.this,new String[]{Manifest.permission.CALL_PHONE},req_id);

                }else{
                    startActivity(i1);

                }
            }
        });
    }
}

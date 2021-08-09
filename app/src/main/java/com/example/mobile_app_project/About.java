package com.example.mobile_app_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity implements View.OnClickListener {
    TextView location,phone;
    Intent i=null;
    Intent chooser=null;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        location=(TextView) findViewById(R.id.location);
        phone=(TextView) findViewById(R.id.phoneno);
        location.setOnClickListener(this);
        phone.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.location:
                i=new Intent(i.ACTION_VIEW);
                i.setData(Uri.parse("geo:9.002050,38.807788"));
                chooser=Intent.createChooser(i,"launch Maps");
                startActivity(chooser);
                break;
            case R.id.phoneno:
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0937804361"));
                startActivity(intent);
                break;

        }
    }
}

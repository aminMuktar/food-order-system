package com.example.mobile_app_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Toolbar toolbar;
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
public static int counter=0;
public static int price=0;

public static int []price_val={30,25,18,64,43,21,87,110};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbarmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.cart:
                startActivity(new Intent(MainActivity.this, Cart.class));
                    break;
            case R.id.setting:
                startActivity(new Intent(MainActivity.this,Setting.class));
                    break;
            case R.id.about:
                startActivity(new Intent(MainActivity.this, About.class));
                    break;
            case R.id.exit:
                MainActivity.super.onBackPressed();
                    break;
            case R.id.logout:
                startActivity(new Intent(MainActivity.this, Login.class));
                    break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                counter++;
                price+=price_val[0];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                counter++;
                price+=price_val[1];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                counter++;
                price+=price_val[2];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                counter++;
                price+=price_val[3];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                counter++;
                price+=price_val[4];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                counter++;
                price+=price_val[5];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn7:
                counter++;
                price+=price_val[6];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn8:
                counter++;
                price+=price_val[7];
                Toast.makeText(this, "added to cart", Toast.LENGTH_SHORT).show();
                break;

        }
    }

}
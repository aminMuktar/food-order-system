package com.example.mobile_app_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private TextView dha;

    final String my_mail="unity@gmail.com";
    final String my_pass="amin";
    @Override
    protected void onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        email=(EditText) findViewById(R.id.email_id);
        password=(EditText) findViewById(R.id.password_id);
        login=(Button) findViewById(R.id.submit_btn);
        dha=(TextView) findViewById(R.id.dha);
        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,SignUp.class));
            }
        });
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(email.getText().toString().equals(my_mail) && password.getText().toString().equals(my_pass)){
                        startActivity(new Intent(Login.this,MainActivity.class));
                    }
                    else{
                        Toast.makeText(Login.this, "your email or password is incorrect", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}

package com.example.mobile_app_project;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class Cart extends AppCompatActivity {
TextView noprod,price;
Button finish;
MainActivity count;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_cart);
        noprod=(TextView) findViewById(R.id.noprod);
        finish=(Button) findViewById(R.id.finish);
        price=(TextView) findViewById(R.id.price);
        noprod.setText("you added "+count.counter+" product");
        price.setText("your total price is "+count.price);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("My notification","My notification",NotificationManager.IMPORTANCE_DEFAULT );
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder=new NotificationCompat.Builder(Cart.this,"My notification");
                builder.setContentTitle("total product "+count.counter);
                builder.setContentText("total price "+ count.price+" birr");
                builder.setSmallIcon(R.drawable.notify);
                builder.setAutoCancel(true);
                NotificationManagerCompat managerCompat=NotificationManagerCompat.from(Cart.this);
                managerCompat.notify(1,builder.build());
            }
        });
    }
}

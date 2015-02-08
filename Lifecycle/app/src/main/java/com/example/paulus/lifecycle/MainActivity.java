package com.example.paulus.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends TracerActivity {


    public void onClick(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}

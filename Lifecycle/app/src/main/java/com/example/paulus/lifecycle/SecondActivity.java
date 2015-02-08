package com.example.paulus.lifecycle;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Paulus on 08/02/2015.
 */
public class SecondActivity extends TracerActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }
}

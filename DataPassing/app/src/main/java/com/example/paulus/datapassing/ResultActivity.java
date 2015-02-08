package com.example.paulus.datapassing;

/**
 * Created by Paulus on 08/02/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("lalala");
        TextView temp = (TextView) findViewById(R.id.displayintentextra);
        temp.setText(value1);
    }

}



package com.cnon.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.cnon.deneme.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cclas ccl = new cclas();
        ccl.setValue(5);
        int yu = ccl.getValue();

        Log.e("Output",yu+"");
        ppca ppca = new ppca();

        ppca.uyt="rtyu";



    }
}
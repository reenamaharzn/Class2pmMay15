package com.example.reena.class2pmmay15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    Helper help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginform);
        int value = add(2, 5);
        help = new Helper();
        int val = help.add(2, 6);
    }

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public int add(int a, int b, int d) {
        int c = a + b;
        return c;
    }


    public void concept(int value) {
        if (value > 0) {
            Log.i("value", "value is positive");
        } else if (value == 0) {
            Log.i("value", "value is 0");
        } else
            Log.i("value", "value is negative");
        switch (value) {
            case 0:
                break;

            case 1:
                break;

            case 2:
                break;
            default:
                break;
        }
        for (int i=0;i<=10;i++){
            Log.i("value","count:"+i);
        }
    }


}

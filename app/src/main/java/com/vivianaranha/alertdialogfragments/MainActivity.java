package com.vivianaranha.alertdialogfragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {

        MyAlert myAlert = new MyAlert();
        myAlert.show(getFragmentManager(), "MyAlert");
    }
}

package com.example.dell.mediu;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyHealth extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_health);
    }
    public void home(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);    }

    public void history(View view) {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);    }
    public void documents(View view) {
        Intent intent = new Intent(this, Documents.class);
        startActivity(intent);    }
    public void labtest(View view) {
        Intent intent = new Intent(this, LabTest.class);
        startActivity(intent);    }
}

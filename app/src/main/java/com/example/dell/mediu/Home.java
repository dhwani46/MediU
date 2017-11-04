package com.example.dell.mediu;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;


public class Home extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
}

    public void appointments(View view) {
        Intent intent = new Intent(this, Appointments.class);
        startActivity(intent);    }

    public void healthfeed(View view) {
        Intent intent = new Intent(this, HealthFeed.class);
        startActivity(intent);    }

    public void myhealth(View view) {
        Intent intent = new Intent(this, MyHealth.class);
        startActivity(intent);    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_chat:
                //Code to run when the Create Order item is clicked
                Intent intent = new Intent(this, Chat.class);
                startActivity(intent);
                return true;
                  case R.id.action_profile:
                // Code to run when the settings item is clicked
                return true;
                default:
                 return super.onOptionsItemSelected(item);
                  }
                 }

}


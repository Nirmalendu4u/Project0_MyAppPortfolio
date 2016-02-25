package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void initProject1(View view){
        message = "This button will launch my Spotify Streamer App!";
        showToastMessage(message);
    }

    public void initProject2(View view){
        message = "This button will launch my Scores App!";
        showToastMessage(message);
    }

    public void initProject3(View view){
        message = "This button will launch my Library App!";
        showToastMessage(message);
    }

    public void initProject4(View view){
        message = "This button will launch my Build It Bigger App!";
        showToastMessage(message);
    }

    public void initProject5(View view){
        message = "This button will launch my XYZ Reader App!";
        showToastMessage(message);
    }

    public void initProject6(View view){
        message = "This button will launch my Capstone App!";
        showToastMessage(message);
    }

    private void showToastMessage(String message) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}

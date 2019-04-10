package com.example.katirebe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/*
NDUHUURA NORMAN
2017/BIT/120/PS
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.kidepo:
                this.startActivity(new Intent(this, Kidepo.class));
                return true;
            case R.id.murch:
                this.startActivity(new Intent(this, Murchison_falls.class));
                return true;
            case R.id.bwin:
                this.startActivity(new Intent(this, Bwindi.class));
                return true;
            case R.id.list:
                this.startActivity(new Intent(this, Main2Activity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

}
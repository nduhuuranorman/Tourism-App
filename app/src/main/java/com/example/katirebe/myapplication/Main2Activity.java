package com.example.katirebe.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction t=manager.beginTransaction();
        Fragment1 m1=new Fragment1();
        t.add(R.id.frame1,m1);
        t.commit();
    }

    public void f1(String s) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction t1=manager.beginTransaction();
        Fragment2 mm1=new Fragment2();
        Bundle b2= new Bundle();
        b2.putString("s",s);
        mm1.setArguments(b2);
        t1.replace(R.id.frame1,mm1);
        t1.commit();
    }
}

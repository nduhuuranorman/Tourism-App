package com.example.katirebe.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
ListView lv;
ArrayList<String> a1;
ArrayAdapter<String> aa;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_one, container, false);
        lv= v.findViewById(R.id.list1);
        a1= new ArrayList<String>();
        aa= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1,a1);
        lv.setAdapter(aa);
        a1.add("About Us");
        a1.add("Contacts");
        a1.add("More");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int Position, long  id) {
                String s=a1.get(Position);
                Main2Activity mn1= (Main2Activity) getActivity();
                mn1.f1(s);
            }});
        return v;


}}

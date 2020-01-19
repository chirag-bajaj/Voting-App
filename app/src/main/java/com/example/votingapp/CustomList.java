package com.example.votingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CustomList extends AppCompatActivity {
    ListView simpleList;
    String candidateList[] = {"Modiji","Rahulji"};
    int flags[] = {R.drawable.b_logo,R.drawable.c_logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        simpleList = (ListView)findViewById(R.id.mycustomlist);
        MyAdapter customAdapter = new MyAdapter(getApplicationContext(),candidateList,flags);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position+1==1) {
                    Intent in3 = new Intent(CustomList.this, MainActivity.class);
                    startActivity(in3);
                }
                else if(position+1==2){
                    Intent in3 = new Intent(CustomList.this, SecondActivity.class );
                    startActivity(in3);
                }
            }
        });
    }
}

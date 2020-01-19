package com.example.votingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    String candidateList[];
    int flags[];
    LayoutInflater inflater;

    public MyAdapter(Context applicationContext, String[] candidateList, int[] flags) {
        this.context = context;
        this.candidateList = candidateList;
        this.flags = flags;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return candidateList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.customlist,null);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        ImageView img = (ImageView) convertView.findViewById(R.id.imageView1);
        name.setText(candidateList[position]);
        img.setImageResource(flags[position]);
        return convertView;
    }

}

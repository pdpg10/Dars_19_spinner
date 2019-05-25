package com.example.dars_19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.appcompat.widget.AppCompatTextView;

public class StateAdapter extends BaseAdapter {
    private String[] states;
    private LayoutInflater inflater;

    public StateAdapter(Context context,
                        String[] states) {
        this.states = states;
        inflater = LayoutInflater.from(context);
    }

    @Override

    public int getCount() {
        return states.length;
    }

    @Override
    public String getItem(int position) {
        return states[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position,
                        View convertView,
                        ViewGroup parent) {
        View view = inflater.inflate(R.layout.state_item, parent, false);
        AppCompatTextView tv = view.findViewById(R.id.tv);
        String state = getItem(position);
        tv.setText(state);
        return view;
    }
}

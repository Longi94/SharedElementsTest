package com.tlongdev.sharedelementstest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {

    private static final int SIZE = 50;

    private final LayoutInflater mInflater;
    private Context mContext;

    public GridViewAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return SIZE;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final View v = mInflater.inflate(R.layout.grid_item, null);

        ((TextView)v.findViewById(R.id.text)).setText("" + position);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(new Intent(mContext, DialogActivity.class));
                i.putExtra("position", position);

                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation((Activity) mContext, v, "transition");
                mContext.startActivity(i, options.toBundle());
            }
        });

        return v;
    }
}

package com.example.sridevi.customgridview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sridevi.customgridview.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by Sridevi on 2/13/2017.
 */

public class GridAdapter extends BaseAdapter {

    private int images[];

    private Context context;

    public GridAdapter(Context context,int images[]){

        this.context = context;
        this.images=images;


    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            ImageView images = (ImageView)gridView.findViewById(R.id.images);
            images.setImageResource(images);
            return gridView;

        }

        return null;
    }
}

package com.ambat.sivaraj.project1v1;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import com.ambat.sivaraj.project1v1.Model.Movie;

import java.util.List;

/**
 * Created by admin on 27/12/15.
 */
public class ImageAdapter extends ArrayAdapter<String> {

    private LayoutInflater layoutInflater;
    private Context context;
    private int layoutId;
    private int imageViewId;

    public ImageAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, 0, objects);
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.layoutId = resource;
        this.imageViewId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View v = convertView;
        String url;
        if (v == null) {
            v = layoutInflater.inflate(layoutId, parent, false);
        }
        ImageView imageView = (ImageView) v.findViewById(imageViewId);
        url = getItem(position);
        Picasso.with(context).load(url).into(imageView);
        return v;
    }
}

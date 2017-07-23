package com.example.android.quakereport;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>
{
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes)
    {
        super (context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null)
        {
         listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        //Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        //Find the textView with the view ID magnitude
        TextView magnitudeView = (TextView)listItemView.findViewById(R.id.magnitude);

        //Display the magnitude of the current earthquake
        magnitudeView.setText(currentEarthquake.getMagnitude());

        //Find the textView with the view ID location
        TextView locationView = (TextView)listItemView.findViewById(R.id.location);

        //Display the location of the current earthquake
        locationView.setText(currentEarthquake.getLocation());

        //Find the textView with the view ID date
        TextView dateView = (TextView)listItemView.findViewById(R.id.date);

        //Display the date of the current earthquake
        dateView.setText(currentEarthquake.getDate());

        return listItemView;
    }
}

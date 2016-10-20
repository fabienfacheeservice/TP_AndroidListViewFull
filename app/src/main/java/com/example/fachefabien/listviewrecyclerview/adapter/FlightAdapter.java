package com.example.fachefabien.listviewrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.List;

/**
 * Created by fachefabien on 09/10/2016.
 */

public class FlightAdapter extends ArrayAdapter<Flight> {


    public FlightAdapter(Context context, List<Flight> flights) {
        /* notre resource id par defaut sera 0 */
        super(context, 0 , flights);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /* Ici on va spécifier dans quel layout on va insérer notre élément */
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_flight,parent, false);
        }
        /* on initialise notre viewHolder */
        FlightViewHolder viewHolder = (FlightViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new FlightViewHolder();
            viewHolder.flightNumber = (TextView) convertView.findViewById(R.id.flightNumber);
            convertView.setTag(viewHolder);
        }
        /* On recupère notre élément de la liste et on utilise le viewHolder */
        Flight flight = getItem(position);
        viewHolder.flightNumber.setText(flight.getFlightNumber());
        return convertView;
    }

    private class FlightViewHolder{
        /* pour cette exemple je n'ai pris qu'un seul champ */
        public TextView flightNumber;
    }
}

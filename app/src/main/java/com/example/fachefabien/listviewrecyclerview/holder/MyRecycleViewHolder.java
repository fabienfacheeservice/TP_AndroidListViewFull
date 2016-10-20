package com.example.fachefabien.listviewrecyclerview.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

/**
 * Created by fachefabien on 18/10/2016.
 */

public class MyRecycleViewHolder extends RecyclerView.ViewHolder{

    private TextView textView;

    //itemView est la vue correspondante à un élément de la liste
    public MyRecycleViewHolder(View itemView) {
        super(itemView);

        //Ici on vient chercher la textView que l'on veut remplir

        textView = (TextView) itemView.findViewById(R.id.flightNumber);
    }

    //On ajoute une fonction de liaison pour remplir la vue  d'un vol
    public void bind(Flight flight){
        textView.setText(flight.getFlightNumber());
    }
}

package com.example.fachefabien.listviewrecyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.holder.MyRecycleViewHolder;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.List;

/**
 * Created by fachefabien on 18/10/2016.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecycleViewHolder> {


    List<Flight> list;

    //Constructeur prenant en entrée une liste de vols
    public MyRecyclerViewAdapter(List<Flight> list) {
        this.list = list;
    }

    //cette fonction permet de créer les viewHolder
    //et par la même indiquer la vue à inflater (à partir des layout xml)
    @Override
    public MyRecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        /* On réutilise le même xml que pour ListView */
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_flight_recycler,viewGroup,false);
        return new MyRecycleViewHolder(view);
    }

    //Ici nous allons remplir notre vue d'un élément vol
    @Override
    public void onBindViewHolder(MyRecycleViewHolder myViewHolder, int position) {
        Flight flight = list.get(position);
        myViewHolder.bind(flight);
    }

    // On spécifie la taille de notre liste
    @Override
    public int getItemCount() {
        return list.size();
    }

}
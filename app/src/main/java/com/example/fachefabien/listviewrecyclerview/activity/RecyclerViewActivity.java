package com.example.fachefabien.listviewrecyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.adapter.MyRecyclerViewAdapter;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        List<Flight> flights = createAllFlight();
        adapter = new MyRecyclerViewAdapter(flights);
        /* Il faut imperativement définir un LinearLayout manager */
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);
    }

    private List<Flight> createAllFlight() {
        List<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));
        flights.add(new Flight("QR42", "Paris", "Doha", "22/08/2017", "22/08/2017", "10:30", "17:55"));
        flights.add(new Flight("TG931", "Paris", "Bangkok", "22/08/2017", "23/08/2017", "13:40", "05:55"));
        flights.add(new Flight("EY12", "Londres", "Sydney", "19/08/2017", "20/08/2017", "09:35", "17:55"));
        flights.add(new Flight("BA15", "Bruxelles", "Rio De Janero", "26/08/2017", "26/08/2017", "07:55", "17:15"));
        flights.add(new Flight("FR1134", "Berlin", "Barcelone", "02/09/2017", "02/09/2017", "21:00", "23:35"));
        flights.add(new Flight("FR134", "New York", "Paris", "02/07/2017", "03/07/2017", "20:00", "23:35"));
        flights.add(new Flight("IB334", "Madrid", "Tokyo", "09/07/2017", "10/09/2017", "15:15", "17:45"));

        return flights;
    }
}

package com.example.fachefabien.listviewrecyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

public class FlightDetailActivity extends AppCompatActivity {

    public static Flight flight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_detail);
        Intent intent = getIntent();
        Bundle flightBundle = intent.getExtras();
        flight = flightBundle.getParcelable("FLIGHT_DETAIL");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView numVol = (TextView) findViewById(R.id.textViewFlightNumber);
        TextView depCityVol = (TextView) findViewById(R.id.textViewCityDep);
        TextView arrCityVol = (TextView) findViewById(R.id.textViewCityArr);
        TextView depDateVol = (TextView) findViewById(R.id.textViewDepDate);
        TextView arrDateVol = (TextView) findViewById(R.id.textViewArrDate);
        TextView depHourVol = (TextView) findViewById(R.id.textViewDepHour);
        TextView arrHourVol = (TextView) findViewById(R.id.textViewArrHour);
        numVol.setText(flight.getFlightNumber());
        depCityVol.setText(flight.getFlightOrigin());
        arrCityVol.setText(flight.getFlightDestination());
        depDateVol.setText(flight.getFlightDepartureDate());
        arrDateVol.setText(flight.getFlightArrivalDate());
        depHourVol.setText(flight.getFlightDepartureHour());
        arrHourVol.setText(flight.getFlightArrivalHour());
    }
}

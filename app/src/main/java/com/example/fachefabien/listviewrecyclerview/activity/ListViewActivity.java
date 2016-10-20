package com.example.fachefabien.listviewrecyclerview.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


import com.example.fachefabien.listviewrecyclerview.R;
import com.example.fachefabien.listviewrecyclerview.adapter.FlightAdapter;
import com.example.fachefabien.listviewrecyclerview.model.Flight;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    /* on déclare ici la listeView afin de la manipuler dans toutes les méthodes de l'activité */
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView = (ListView) findViewById(R.id.listView);
        /* On génére notres liste de vol */
        List<Flight> flights = createAllFlight();
        /* On utilise notre adapter en spécifiant la liste à utiliser*/
        FlightAdapter adapter = new FlightAdapter(ListViewActivity.this, flights);
        /* Enfin on associe cette adapter à notre listView */
        mListView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        myElementDetail();
        deleteMyElement();
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


        return flights;
    }


    private void myElementDetail(){

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(final AdapterView<?> parent, View view, int position, long id) {
                /* on récupère le vol à la position dans la vue */
                Flight flight = (Flight) parent.getAdapter().getItem(position);
                /* On créer un bundle que l'on attache à notre intent afin d'ajouter notre vol*/
                Bundle bundle = new Bundle();
                bundle.putParcelable("FLIGHT_DETAIL", flight);
                Intent intent = new Intent(ListViewActivity.this, FlightDetailActivity.class);
                intent.putExtras(bundle);
                /* On démarre notre activity simplement car on ne fera aucune modification*/
                startActivity(intent);
            }
        });
    }

    private void deleteMyElement(){
        /* on va créer un une dialogue box avec possibilité d'annuler l'action */
        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(final AdapterView<?> parent, View view, final int position, long id) {
                /* On va utiliser le AlertDialogue.Builder on va spécifier les messages dans les deux cas */
                AlertDialog.Builder alert = new AlertDialog.Builder(ListViewActivity.this);
                alert.setMessage("Voulez vous supprimer l'enregistrement?");
                /* il n'y aura pas de croix pour fermer la dialogue */
                alert.setCancelable(false);
                alert.setPositiveButton("Oui", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        /* On récupère notre vol */
                        FlightAdapter flightAdapter = (FlightAdapter) parent.getAdapter();
                        Flight flight = ((FlightAdapter) parent.getAdapter()).getItem(position);
                        /* on le supprime (la méthode est implementer dans la classe mère*/
                        flightAdapter.remove(flight);
                        /* On notifie le changement à notre adapter afin de rafraichir la vue*/
                        flightAdapter.notifyDataSetChanged();
                    }
                });
                /* on préférera annuler sur un bouton */
                alert.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        /* la dialogue va se refermer sans action */
                        dialog.cancel();

                    }
                });
                /* on lance la créatiion de la fenêtre de dialogue */
                alert.create().show();
                return true;
            }
        });

    }
}

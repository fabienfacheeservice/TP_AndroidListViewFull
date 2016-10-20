package com.example.fachefabien.listviewrecyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fachefabien on 09/10/2016.
 */

public class Flight implements Parcelable {

    private String flightNumber;
    private String flightOrigin;
    private String flightDestination;
    private String flightDepartureDate;
    private String flightArrivalDate;
    private String flightDepartureHour;
    private String flightArrivalHour;

    public Flight(String flightNumber, String flightOrigin, String flightDestination, String flightDepartureDate, String flightArrivalDate, String flightDepartureHour, String flightArrivalHour) {
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
        this.flightDepartureDate = flightDepartureDate;
        this.flightArrivalDate = flightArrivalDate;
        this.flightDepartureHour = flightDepartureHour;
        this.flightArrivalHour = flightArrivalHour;
    }

    public Flight() {

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public void setFlightOrigin(String flightOrigin) {
        this.flightOrigin = flightOrigin;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getFlightDepartureDate() {
        return flightDepartureDate;
    }

    public void setFlightDepartureDate(String flightDepartureDate) {
        this.flightDepartureDate = flightDepartureDate;
    }

    public String getFlightArrivalDate() {
        return flightArrivalDate;
    }

    public void setFlightArrivalDate(String flightArrivalDate) {
        this.flightArrivalDate = flightArrivalDate;
    }

    public String getFlightDepartureHour() {
        return flightDepartureHour;
    }

    public void setFlightDepartureHour(String flightDepartureHour) {
        this.flightDepartureHour = flightDepartureHour;
    }

    public String getFlightArrivalHour() {
        return flightArrivalHour;
    }

    public void setFlightArrivalHour(String flightArrivalHour) {
        this.flightArrivalHour = flightArrivalHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!flightOrigin.equals(flight.flightOrigin)) return false;
        if (!flightDestination.equals(flight.flightDestination)) return false;
        if (!flightDepartureDate.equals(flight.flightDepartureDate)) return false;
        if (!flightArrivalDate.equals(flight.flightArrivalDate)) return false;
        if (!flightDepartureHour.equals(flight.flightDepartureHour)) return false;
        return flightArrivalHour.equals(flight.flightArrivalHour);

    }

    @Override
    public int hashCode() {
        int result = flightNumber.hashCode();
        result = 31 * result + flightOrigin.hashCode();
        result = 31 * result + flightDestination.hashCode();
        result = 31 * result + flightDepartureDate.hashCode();
        result = 31 * result + flightArrivalDate.hashCode();
        result = 31 * result + flightDepartureHour.hashCode();
        result = 31 * result + flightArrivalHour.hashCode();
        return result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(flightNumber);
        out.writeString(flightOrigin);
        out.writeString(flightDestination);
        out.writeString(flightDepartureDate);
        out.writeString(flightArrivalDate);
        out.writeString(flightDepartureHour);
        out.writeString(flightArrivalHour);
    }

    private Flight(Parcel in) {
        this.flightNumber = in.readString();
        this.flightOrigin = in.readString();
        this.flightDestination = in.readString();
        this.flightDepartureDate = in.readString();
        this.flightArrivalDate = in.readString();
        this.flightDepartureHour = in.readString();
        this.flightArrivalHour = in.readString();
    }

    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public Flight createFromParcel(Parcel in) {
                    return new Flight(in);
                }

                public Flight[] newArray(int size) {
                    return new Flight[size];
                }
            };
}

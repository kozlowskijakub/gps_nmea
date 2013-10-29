package com.example.gps_nmea;

import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: jakub
 * Date: 10/29/13
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Observer implements LocationListener {

    //    @Override
    public GpsStatus getGpsStatus(GpsStatus status) {
        System.out.println("vaule");
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onProviderEnabled(String provider) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onProviderDisabled(String provider) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

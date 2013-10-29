package com.example.gps_nmea;

import android.app.Activity;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Bundle;

import java.util.ArrayList;

public class MyActivity extends Activity implements GpsStatus.Listener {

    LocationManager locationManager;
    ArrayList<GpsSatellite> satellites ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//                          this.satellites =

//         this.locationManager =

    }

    @Override
    public void onGpsStatusChanged(int event) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

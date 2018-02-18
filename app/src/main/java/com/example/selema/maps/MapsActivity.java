package com.example.selema.maps;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements View.OnClickListener {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        findViewById(R.id.btn_simple).setOnClickListener(this);
        findViewById(R.id.btn_transit).setOnClickListener(this);
        findViewById(R.id.btn_alternative).setOnClickListener(this);
        findViewById(R.id.btn_waypoints).setOnClickListener(this);
        }

@Override
public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_simple) {
        goToSimpleDirection();
        } else if (id == R.id.btn_transit) {
        goToTransitDirection();
        } else if (id == R.id.btn_alternative) {
        goToAlternativeDirection();
        } else if (id == R.id.btn_waypoints) {
        goToWaypointsDirection();
        }
        }

public void goToSimpleDirection() {
        openActivity(SimpleDirectionActivity.class);
        }

public void goToTransitDirection() {
        openActivity(TransitDirectionActivity.class);
        }

public void goToAlternativeDirection() {
        openActivity(AlternativeDirectionActivity.class);
        }

public void goToWaypointsDirection() {
        openActivity(WaypointsDirectionActivity.class);
        }

public void openActivity(Class<?> cs) {
        startActivity(new Intent(this, cs));
        }
        }

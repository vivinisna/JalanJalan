package com.pratamawijaya.panggilpeta.model;

import io.realm.RealmObject;

/**
 * Created by pratama on 2/18/15.
 */
public class LatLngModel extends RealmObject {
    private double lat;
    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}

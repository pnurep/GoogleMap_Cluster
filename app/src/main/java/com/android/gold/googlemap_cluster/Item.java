package com.android.gold.googlemap_cluster;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by Gold on 2017. 5. 10..
 */

public class Item implements ClusterItem {

    private LatLng coord;

    public Item(double lat, double lng) {
        coord = new LatLng(lat, lng);
    }

    @Override
    public LatLng getPosition() {
        return coord;
    }
}

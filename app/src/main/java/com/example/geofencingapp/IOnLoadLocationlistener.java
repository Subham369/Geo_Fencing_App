package com.example.geofencingapp;

import java.util.List;

public interface IOnLoadLocationlistener {

    void onLoadLocationSuccess(List<MyLatLang> latLngs);
    void onLoadLocationFailed(String message);
}

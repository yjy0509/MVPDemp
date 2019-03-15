package com.example.mvpdemp.p;

import com.example.mvpdemp.m.Module;
import com.example.mvpdemp.m.ModuleInterface;
import com.example.mvpdemp.v.MapView;

import java.util.List;

public class Presenter implements ModuleInterface {

    Module module = new Module(this);

    MapView mapView;

    public Presenter(MapView mapView){
        this.mapView = mapView;
    }

    public void getData(){
        module.getData();
    }

    @Override
    public void onSuccess(List<String> strings) {
        mapView.onSuccess(strings);
    }

    @Override
    public void onError(String string) {
        mapView.onError(string);
    }
}

package com.example.mvpdemo2.presenter;

import com.example.mvpdemo2.Bean.MenuBean;
import com.example.mvpdemo2.module.ModuleClass;
import com.example.mvpdemo2.module.ModuleInterface;
import com.example.mvpdemo2.view.MapView;

public class MenuPresenter extends Presenter implements ModuleInterface {

    ModuleClass moduleClass = new ModuleClass(this);

    private MapView mapView;

    public MenuPresenter(MapView mapView){
        this.mapView = mapView;
    }

    public void getData(String baseUrl,String path){
        moduleClass.getData(baseUrl,path);
    }

    @Override
    public void onSuccess(MenuBean menuBeans) {
        mapView.onSuccess(menuBeans);
    }

    @Override
    public void onError(String string) {
        mapView.onError(string);
    }
}

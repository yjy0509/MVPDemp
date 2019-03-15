package com.example.mvpdemo2.view;

import com.example.mvpdemo2.Bean.MenuBean;

public interface MapView extends View{

    void onSuccess(MenuBean menuBeans);
    void onError(String string);
}

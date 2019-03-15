package com.example.mvpdemo2.module;

import com.example.mvpdemo2.Bean.MenuBean;

public interface ModuleInterface {
    void onSuccess(MenuBean menuBeans);
    void onError(String string);
}

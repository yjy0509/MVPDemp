package com.example.mvpdemo2.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mvpdemo2.Bean.MenuBean;
import com.example.mvpdemo2.R;
import com.example.mvpdemo2.presenter.MenuPresenter;

public class MainActivity extends AppCompatActivity implements MapView{

    String path = "http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=20&page=1";
    private MenuPresenter menuPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuPresenter = new MenuPresenter(this);
        menuPresenter.getData("http://www.qubaobei.com/ios/cf/",path);
    }

    @Override
    public void onSuccess(MenuBean menuBeans) {
        Log.v("yjy",menuBeans.getData().size()+"");
    }

    @Override
    public void onError(String string) {
        Log.v("yjy",string);
    }

}

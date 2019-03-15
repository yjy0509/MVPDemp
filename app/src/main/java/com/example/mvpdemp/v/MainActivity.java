package com.example.mvpdemp.v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mvpdemp.R;
import com.example.mvpdemp.p.Presenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MapView{

    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
        presenter.getData();
    }

    @Override
    public void onSuccess(List<String> strings) {
        Log.v("data",strings.size()+"");
    }

    @Override
    public void onError(String string) {

    }
}

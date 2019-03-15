package com.example.mvpdemo2.module;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    private String baseUrl;
    private Retrofit retrofit;
    private static RetrofitHelper instance = null;

    private RetrofitHelper(String baseUrl){
        this.baseUrl = baseUrl;
        init();
    }

    private void init() {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public RetrofitService getService(){
        return retrofit.create(RetrofitService.class);
    }

    public static synchronized RetrofitHelper getInstance(String baseUrl){
        if (instance == null){
            instance = new RetrofitHelper(baseUrl);
        }
        return instance;
    }
}

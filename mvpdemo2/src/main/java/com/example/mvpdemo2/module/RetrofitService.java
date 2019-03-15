package com.example.mvpdemo2.module;


import com.example.mvpdemo2.Bean.MenuBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitService {
    @GET
    Observable<MenuBean> getData(@Url String path);
}

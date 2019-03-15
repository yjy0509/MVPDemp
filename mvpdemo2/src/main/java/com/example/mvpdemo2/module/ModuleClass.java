package com.example.mvpdemo2.module;

import com.example.mvpdemo2.Bean.MenuBean;
import com.example.mvpdemo2.presenter.MenuPresenter;
import com.example.mvpdemo2.presenter.Presenter;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ModuleClass {

    private Presenter presenter;
    private RetrofitService retrofitService;

    public ModuleClass(Presenter presenter){
        this.presenter = presenter;
    }

    public void getData(String baseUrl,String url){
        retrofitService = RetrofitHelper.getInstance(baseUrl).getService();

        retrofitService.getData(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MenuBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MenuBean menuBean) {
                        ((MenuPresenter)presenter).onSuccess(menuBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        ((MenuPresenter)presenter).onError("获取数据错误");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

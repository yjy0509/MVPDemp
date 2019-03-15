package com.example.mvpdemp.m;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Module {
    List<String> list = new ArrayList<>();

    ModuleInterface moduleInterface;

    public Module(ModuleInterface moduleInterface){
        this.moduleInterface = moduleInterface;
    }

    public void getData(){
        Observable.create(new ObservableOnSubscribe<List<String>>() {
            @Override
            public void subscribe(ObservableEmitter<List<String>> e) throws Exception {
                for (int i = 0; i < 100; i++) {
                    list.add("第"+(i+1)+"个item");
                }
                e.onNext(list);
            }
        }).subscribe(new Observer<List<String>>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(List<String> strings) {
                moduleInterface.onSuccess(strings);
            }

            @Override
            public void onError(Throwable e) {
                moduleInterface.onError("数据获取错误");
            }

            @Override
            public void onComplete() {

            }
        });
    }
}

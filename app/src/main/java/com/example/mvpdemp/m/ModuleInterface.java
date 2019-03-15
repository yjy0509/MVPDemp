package com.example.mvpdemp.m;

import java.util.List;

public interface ModuleInterface {
    void onSuccess(List<String> strings);
    void onError(String string);
}

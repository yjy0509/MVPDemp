package com.example.mvpdemp.v;

import java.util.List;

public interface MapView {
    void onSuccess(List<String> strings);
    void onError(String string);
}

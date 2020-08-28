package com.example.kotlinsample.javaSample.dsl;

public interface VideoListener {
    void onVideoStart();

    void onVideoEnd();

    void onVideoRepeat();

    void onVideoCancel();
}

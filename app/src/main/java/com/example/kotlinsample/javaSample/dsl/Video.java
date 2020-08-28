package com.example.kotlinsample.javaSample.dsl;

public class Video {
    private VideoListener videoListener;

    public void addVideoListener(VideoListener videoListener) {
        this.videoListener = videoListener;
    }

    public void test() {
        final Video video = new Video();
        video.addVideoListener(new VideoListener() {
            @Override
            public void onVideoStart() {

            }

            @Override
            public void onVideoEnd() {

            }

            @Override
            public void onVideoRepeat() {

            }

            @Override
            public void onVideoCancel() {

            }
        });
    }
}

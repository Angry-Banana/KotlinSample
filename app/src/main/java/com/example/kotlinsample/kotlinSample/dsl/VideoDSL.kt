package com.example.kotlinsample.kotlinSample.dsl

import com.example.kotlinsample.javaSample.dsl.Video
import com.example.kotlinsample.javaSample.dsl.VideoListener

class VideoDSL(video: Video) {

    var video: Video? = video
    var onRepeat: (() -> Unit)? = null
    var onEnd: (() -> Unit)? = null
    var onCancel: (() -> Unit)? = null
    var onStart: (() -> Unit)? = null

    init {
        addListener()
    }

    fun addListener() {
        video?.addVideoListener(object : VideoListener {
            override fun onVideoStart() {
                onStart?.invoke()
            }

            override fun onVideoEnd() {
                onEnd?.invoke()
            }

            override fun onVideoRepeat() {
                onRepeat?.invoke()
            }

            override fun onVideoCancel() {
                onCancel?.invoke()
            }
        })
    }

    fun test() {
        Video().apply {
            onStart = {

            }
        }
    }



}
package com.example.khaing.unb;

public class OngoingVideos {
    String videoUrl;
    public OngoingVideos(){}
    public OngoingVideos(String url){
        this.videoUrl=url;
    }
    public String getVideoUrl()
    {
        return videoUrl;
    }
    public void setVideoUrl(String url){
        this.videoUrl=url;
    }
}

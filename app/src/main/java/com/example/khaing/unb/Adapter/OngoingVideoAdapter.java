package com.example.khaing.unb.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.khaing.unb.OngoingVideos;
import com.example.khaing.unb.R;

import java.util.List;

public class OngoingVideoAdapter extends RecyclerView.Adapter<OngoingVideoAdapter.VideoViewHolder> {
    List <OngoingVideos> ongoingVideosList;

    public OngoingVideoAdapter(){}

    public OngoingVideoAdapter(List<OngoingVideos> ongoingVideosList){
        this.ongoingVideosList=ongoingVideosList;
    }
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ongoing_item,parent,false);


        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.videoweb.loadData(ongoingVideosList.get(position).getVideoUrl(),"text/html","utf-8 ");
    }

    @Override
    public int getItemCount() {
        return ongoingVideosList.size();
    }





    public class VideoViewHolder extends RecyclerView.ViewHolder {
        WebView videoweb;

        public VideoViewHolder(View itemView) {
            super(itemView);
            videoweb=(WebView)itemView.findViewById(R.id.ongoingList);
            videoweb.getSettings().setJavaScriptEnabled(true);
            videoweb.setWebChromeClient(new WebChromeClient(){

            });
        }
    }
}

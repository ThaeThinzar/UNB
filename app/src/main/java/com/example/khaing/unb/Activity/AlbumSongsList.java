package com.example.khaing.unb.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.khaing.unb.Adapter.AlbmSongListAdapter;
import com.example.khaing.unb.R;

public class AlbumSongsList extends BaseActivity {

    RecyclerView rcViewAlbumList;
    AlbmSongListAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_song_list);
        rcViewAlbumList=(RecyclerView)findViewById(R.id.rcViewAlbumSong);

        Intent intent=getIntent();
        String songName=intent.getStringExtra("name");
        Toast.makeText(getApplicationContext(),"You clicked"+songName,Toast.LENGTH_LONG).show();

        rcViewAlbumList.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        adapter=new AlbmSongListAdapter(this,songName);
        rcViewAlbumList.setAdapter(adapter);


    }
}

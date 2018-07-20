package com.example.khaing.unb.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.khaing.unb.ModelData.BaseModel;
import com.example.khaing.unb.R;
import com.example.khaing.unb.ViewHolder.AlbumSongListViewHolder;

import butterknife.BindView;

public class AlbmSongListAdapter extends BaseRecyclerAdapter<AlbumSongListViewHolder,BaseModel> {
    @BindView(R.id.tvMemName)
    TextView textView;
    String songName;

    String [] BoyHood={"Feeling","Only one","Rebooting","Ride with me","Only one Inst.","Feeling Inst."};
    String [] Blackheart={"Black Heart","Moon Light","After the rain","Dancing with devil","Black heart Inst."};

    public AlbmSongListAdapter(Context context,String songName) {
        super(context);
        this.songName=songName;
    }

    @NonNull
    @Override
    public AlbumSongListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mLayoutInflator.inflate(R.layout.adapter_member,parent,false);
        return new AlbumSongListViewHolder(view,songName);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumSongListViewHolder holder, int position) {
        holder.setData(null);
        holder.setSongNames(position,BoyHood,Blackheart);


    }

    @Override
    public int getItemCount() {
        int count = 0;
      if(songName.equals("BoyHood")){
        count=BoyHood.length;
      }else if(songName.equals("Black Heart")){
          count= Blackheart.length;
      }
      else {
          count=count+1;
      }
       return count;
    }
}

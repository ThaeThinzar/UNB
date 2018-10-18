package com.example.khaing.unb.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.khaing.unb.R;

import butterknife.BindView;

public class AlbumSongListViewHolder extends BaseViewHolder {

    @BindView(R.id.tvMemName)
    TextView songName;
    @BindView(R.id.tvPosition)
    TextView artist;
    @BindView(R.id.imgProfile)
    ImageView albumImg;
//    String [] BoyHood={"Feeling","Only one","Rebooting","Ride with me","Only one Inst.","Feeling Inst."};
//    String [] Blackheart={"Black Heart","Moon Light","After the rain","Dancing with devil","After the rain Inst.","Black heart Inst."};
    String sName;
    String [] squareOne={"Whistle","Bombayah"};
    String [] squareTwo={"Player with fire","Stay"};
    String [] singleAlbum={"As if it's your last"};
    String [] squareUP={"Duu-du Duu-du","Forever Young","Really","See U later"};

    public AlbumSongListViewHolder(View view,String songName) {
        super(view);
        this.sName=songName;
    }

    @Override
    public void setData(Object data) {

    }

    public void setSongNames(int position,String [] SquareOne,String [] SquareTwo,String[] Youlast,String[] SquareUp){
        if(sName.equals("Square One")){
            for(int i=0;i<squareOne.length;i++){
                if(position==i){
                    songName.setText(squareOne[i].toString());
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("data:image/png;base64,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").into(albumImg);
                }
            }
        }
        else if(sName.equals("Square Two")){
            for(int i=0;i<squareTwo.length;i++){
                if(position==i){
                    songName.setText(squareTwo[i].toString());
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("data:image/jpeg;base64,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").into(albumImg);
                }
            }
        }
        else if(sName.equals("Square Up")){
            for(int i=0;i<squareUP.length;i++){
                if(position==i){
                    songName.setText(squareUP[i].toString());
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("https://en.wikipedia.org/wiki/As_If_It%27s_Your_Last#/media/File:BLACK_PINK_-_As_If_It%27s_Your_Last.jpg").into(albumImg);
                }
            }
        }
        else {

                    songName.setText("As if it's your last");
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("https://upload.wikimedia.org/wikipedia/en/2/26/Black_Pink_-_Square_Up_artwork.png").into(albumImg);
                }

     }

}

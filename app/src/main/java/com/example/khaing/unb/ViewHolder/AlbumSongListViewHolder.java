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

    public AlbumSongListViewHolder(View view,String songName) {
        super(view);
        this.sName=songName;
    }

    @Override
    public void setData(Object data) {

    }

    public void setSongNames(int position,String [] SquareOne,String [] SquareTwo,String[] Youlast,String[] SquareUp){
        if(sName.equals("Square One")){
            for(int i=0;i<SquareOne.length;i++){
                if(position==i){
                    songName.setText(SquareOne[i].toString());
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("https://i0.wp.com/www.kpopscene.com/wp-content/uploads/2018/04/unb-boyhood-1st-mini-album.jpg?w=720").into(albumImg);
                }
            }
        }
        else if(sName.equals("Square Two")){
            for(int i=0;i<SquareTwo.length;i++){
                if(position==i){
                    songName.setText(SquareTwo[i].toString());
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("https://www.allkpop.com/upload/2018/07/af_org/04153857/unb.jpg").into(albumImg);
                }
            }
        }
        else if(sName.equals("As if it's your last")){
            for(int i=0;i<Youlast.length;i++){
                if(position==i){
                    songName.setText(Youlast[i].toString());
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("https://www.allkpop.com/upload/2018/07/af_org/04153857/unb.jpg").into(albumImg);
                }
            }
        }
        else {

                    songName.setText("All Day");
                    artist.setText("BlackPink");
                    Glide.with(itemView).load("https://i0.wp.com/www.kpopscene.com/wp-content/uploads/2018/04/unb-boyhood-1st-mini-album.jpg?w=720").into(albumImg);
                }

     }

}

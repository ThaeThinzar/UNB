package com.example.khaing.unb.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.khaing.unb.R;
import com.example.khaing.unb.controller.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CardViewHolder extends BaseViewHolder{

    @BindView(R.id.bgImage)
    public ImageView bgImage;

    @BindView(R.id.header)
    public TextView header;

    @BindView(R.id.time)
    public TextView time;

    ItemClickListener itemClickListener;
    String songName;

    public CardViewHolder(View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        songName=header.getText().toString();
        super.onClick(view);
        itemClickListener.onCategoryItemClick(songName);
    }

    @Override
    public void setData(Object data) {
    }

    public void setAlbumData(int position){
        if(position==0){
            bgImage.setImageResource(R.drawable.boyhood);
            header.setText("BoyHood");
            time.setText("6 items");
        }else  if(position==1){
            bgImage.setImageResource(R.drawable.unb_group);
            header.setText("All Day");
            time.setText("1 items");
        }
        else {
            bgImage.setImageResource(R.drawable.blackheart);
            header.setText("Black Heart");
            time.setText("6 items");
        }

    }

}

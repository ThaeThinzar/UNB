package com.example.khaing.unb.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.khaing.unb.R;

/**
 * Created by Khaing on 6/29/2018.
 */

public class TopicViewHolder extends BaseViewHolder {

    public ImageView imageView;
    public TextView title;
    public TextView content;
    public TopicViewHolder(View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageView);
        title=itemView.findViewById(R.id.title);
        content=itemView.findViewById(R.id.content);
    }

    @Override
    public void setData(Object data) {
        title.setText("TopicAdapter");
    }
}

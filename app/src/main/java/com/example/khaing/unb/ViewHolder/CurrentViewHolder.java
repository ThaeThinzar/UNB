package com.example.khaing.unb.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.khaing.unb.R;
import com.example.khaing.unb.controller.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khaing on 6/29/2018.
 */

public class CurrentViewHolder extends BaseViewHolder {
    @BindView(R.id.backgroundCurrent)
    ImageView background;

    @BindView(R.id.titleCurrent)
    TextView title;

    @BindView(R.id.durationCurrent)
    TextView duration;
    ItemClickListener itemClickListener;

    public CurrentViewHolder(View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        itemClickListener.onCurrentItemClick();
    }

    @Override
    public void setData(Object data) {
        title.setText("BLink");
        duration.setText("");
    }


}

package com.example.khaing.unb.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.khaing.unb.ModelData.BaseModel;
import com.example.khaing.unb.R;
import com.example.khaing.unb.VO.BaseVO;
import com.example.khaing.unb.ViewHolder.BaseViewHolder;
import com.example.khaing.unb.ViewHolder.CategoryViewHolder;
import com.example.khaing.unb.ViewHolder.CurrentViewHolder;
import com.example.khaing.unb.ViewHolder.TopicViewHolder;
import com.example.khaing.unb.controller.ItemClickListener;

/**
 * Created by Khaing on 6/29/2018.
 */

public class SeriesAdapter extends BaseRecyclerAdapter<BaseViewHolder,BaseVO>{
    private  final int CURRENT_VIEW = 0;
    private final int CATE_VIEW = 1;
    private final int TOPIC_VIEW = 2;

    ItemClickListener itemClickListener;

    public SeriesAdapter(Context context,ItemClickListener itemClickListener) {
        super(context);
        this.itemClickListener=itemClickListener;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        BaseViewHolder bHolder = null;
        if(viewType==CURRENT_VIEW){
            View v= mLayoutInflator.inflate(R.layout.view_holder_current,parent,false);
            bHolder= new CurrentViewHolder(v,itemClickListener);
        }else if(viewType==CATE_VIEW){
            View v=mLayoutInflator.inflate(R.layout.view_holder_category,parent,false);
            bHolder= new CategoryViewHolder(v,itemClickListener);
        }else if(viewType==TOPIC_VIEW){
            View v=mLayoutInflator.inflate(R.layout.view_holder_topic,parent,false);
            bHolder= new TopicViewHolder(v);
        }
        return bHolder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(null);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
        return CURRENT_VIEW;
    } else if (position == 1) {
        return CATE_VIEW;
    } else if (position == 2) {
        return TOPIC_VIEW;
    }
    return CURRENT_VIEW;
    }
}

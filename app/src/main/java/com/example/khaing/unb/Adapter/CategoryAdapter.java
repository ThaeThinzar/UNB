package com.example.khaing.unb.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.khaing.unb.ModelData.BaseModel;
import com.example.khaing.unb.R;
import com.example.khaing.unb.ViewHolder.BaseViewHolder;
import com.example.khaing.unb.ViewHolder.CardViewHolder;
import com.example.khaing.unb.ViewHolder.CategoryViewHolder;
import com.example.khaing.unb.controller.ItemClickListener;

/**
 * Created by Khaing on 6/30/2018.
 */

public class CategoryAdapter extends BaseRecyclerAdapter<CardViewHolder,BaseModel> {
    ItemClickListener itemClickListener;

    public CategoryAdapter(Context context,ItemClickListener itemClickListener) {
        super(context);
        this.itemClickListener=itemClickListener;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mLayoutInflator.inflate(R.layout.view_holder_category_item,parent,false);
        return new CardViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.setData(null);
        holder.setAlbumData(position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }



}

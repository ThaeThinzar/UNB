package com.example.khaing.unb.ViewHolder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.khaing.unb.Adapter.CategoryAdapter;
import com.example.khaing.unb.R;
import com.example.khaing.unb.controller.ItemClickListener;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khaing on 6/29/2018.
 */

public class CategoryViewHolder extends BaseViewHolder {


    @BindView(R.id.rcViewCategory)
    RecyclerView rcCate;

    @BindView(R.id.headerCategory)
    TextView header;


    CategoryAdapter adapter;
    ItemClickListener itemClickListener;

    public CategoryViewHolder(View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        this.itemClickListener=itemClickListener;

        rcCate.setLayoutManager(new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapter = new CategoryAdapter(itemView.getContext(),itemClickListener);
        rcCate.setAdapter(adapter);
        rcCate.setNestedScrollingEnabled(false);
    }

    @Override
    public void setData(Object data) {
        header.setText("Albums");
    }


}

package com.example.khaing.unb.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.khaing.unb.ModelData.BaseModel;
import com.example.khaing.unb.R;
import com.example.khaing.unb.ViewHolder.BaseViewHolder;
import com.example.khaing.unb.ViewHolder.MemberViewHolder;
import com.example.khaing.unb.controller.ItemClickListener;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by Khaing on 6/30/2018.
 */

public class MemberRCAdapter extends BaseRecyclerAdapter<MemberViewHolder,BaseModel> {
    @BindView(R.id.tvMemName)
            TextView tvMemName;

    public MemberRCAdapter(Context context) {
        super(context);
    }


    @NonNull
    @Override
    public MemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=mLayoutInflator.inflate(R.layout.adapter_member,parent,false);
        return new MemberViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        holder.setData(null);
        holder.setMemName(position);
        //holder.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

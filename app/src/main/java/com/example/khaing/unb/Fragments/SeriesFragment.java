package com.example.khaing.unb.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khaing.unb.Adapter.SeriesAdapter;
import com.example.khaing.unb.R;
import com.example.khaing.unb.controller.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khaing on 6/29/2018.
 */

public class SeriesFragment extends Fragment {
    @BindView(R.id.rcViewSeries)
    RecyclerView rcViewSeries;
    SeriesAdapter adapter;

    ItemClickListener itemClickListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemClickListener=(ItemClickListener)getContext();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_series,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUp();
    }

    private void setUp() {
        rcViewSeries.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        adapter = new SeriesAdapter(getContext(),itemClickListener);
        rcViewSeries.setAdapter(adapter);
    }
}

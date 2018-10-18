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

import com.example.khaing.unb.Adapter.MemberRCAdapter;
import com.example.khaing.unb.Adapter.OngoingVideoAdapter;
import com.example.khaing.unb.OngoingVideos;
import com.example.khaing.unb.R;

import java.util.Vector;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Khaing on 6/29/2018.
 */

public class FragmentOnGoing extends Fragment {
    @BindView(R.id.rcOngoing)
    RecyclerView rcOngoing;
    OngoingVideoAdapter adapter;
    Vector<OngoingVideos> ongoingVideos=new Vector<>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ongoing,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUp();
    }

    private void setUp() {
        rcOngoing.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        ongoingVideos.add(new OngoingVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XfCxy8vUKHs\" frameborder=\"0\" allowfullscreen></iframe>"));
        ongoingVideos.add(new OngoingVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WBdQnhwO4gQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        ongoingVideos.add(new OngoingVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/5hwepTxNKtE\" frameborder=\"0\" allowfullscreen></iframe>"));
        ongoingVideos.add(new OngoingVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/89kTb73csYg\" frameborder=\"0\" allowfullscreen></iframe>"));
        ongoingVideos.add(new OngoingVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s5nn7R33AMg\" frameborder=\"0\" allowfullscreen></iframe>"));
        OngoingVideoAdapter adapter=new OngoingVideoAdapter(ongoingVideos);
        rcOngoing.setAdapter(adapter);
    }
}

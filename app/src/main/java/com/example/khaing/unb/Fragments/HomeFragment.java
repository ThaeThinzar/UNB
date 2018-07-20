package com.example.khaing.unb.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khaing.unb.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khaing on 6/29/2018.
 */

public class HomeFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        viewPager=view.findViewById(R.id.viewPager);
        tabLayout=view.findViewById(R.id.tab);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewpager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    private void setUpViewpager(ViewPager viewPager) {
        MyViewPagerAdapter adapter=new MyViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new FragmentOnGoing(),"Update");
        adapter.addFragment(new SeriesFragment(),"Series");
        adapter.addFragment(new MemberFragment(),"Member");
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(1);

    }

    private class MyViewPagerAdapter extends FragmentPagerAdapter{
        List<Fragment> fragmentList=new ArrayList<>();
        List<String> fragmentTitle=new ArrayList<>();

        public MyViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
        public void addFragment(Fragment fragment,String title){
            fragmentList.add(fragment);
            fragmentTitle.add(title);
        }
    }
}

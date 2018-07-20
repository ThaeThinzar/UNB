package com.example.khaing.unb.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.khaing.unb.Fragments.HomeFragment;
import com.example.khaing.unb.Fragments.MoreFragment;
import com.example.khaing.unb.Fragments.ProfileFragment;
import com.example.khaing.unb.R;
import com.example.khaing.unb.controller.ItemClickListener;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    CoordinatorLayout fragment_holder;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment_holder=findViewById(R.id.fragment_holder);
        navigationView=findViewById(R.id.navigation_view);

        navigationView.setOnNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("Home");
        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment!=null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder,fragment).commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment=null;
        switch (item.getItemId()){
            case R.id.navigation_meditate:
                fragment=new HomeFragment();
                getSupportActionBar().setTitle("Home");
                break;

            case R.id.navigation_more:
                fragment=new MoreFragment();
                getSupportActionBar().setTitle("More");
                break;


            case R.id.navigation_me:
                fragment=new ProfileFragment();
                getSupportActionBar().setTitle("Profile");
                break;

        }
        return loadFragment(fragment);
    }


    @Override
    public void onCurrentItemClick() {
        Toast.makeText(getApplicationContext(),"You Clicked on Current...",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onCategoryItemClick(String songName) {
        Intent intent=new Intent(MainActivity.this,AlbumSongsList.class);
        intent.putExtra("name",songName);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"You clicked on Album :"+songName,Toast.LENGTH_LONG).show();

    }
}


package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity {


    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.fragmentPrincipal);

        FragmentManager fm = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fm));
        viewPager.setCurrentItem((1));
    }
}

class MeuFragmentAdapter extends FragmentStatePagerAdapter {

    MeuFragmentAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        Fragment fragment = null;

        if (position == 0){
            fragment = new fragment_engasganco();
        }

        if (position == 1){
            fragment = new fragment_principal();
        }

        if (position == 2){
            fragment = new fragment_sbv();
        }
/*
        if (position == 3){
            fragment = new fragment_principal();
        }

        if (position == 6){
            fragment = new fragment_engasganco();
        }

        if (position == 4){
            fragment = new fragment_panc();
        }

        if (position == 5){
            fragment = new fragment_panc_bebes();
        }*/

        return fragment;
    }

    @Override
    public int getCount(){
        return 3;
    }
}
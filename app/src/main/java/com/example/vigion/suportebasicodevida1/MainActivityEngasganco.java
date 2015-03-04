package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivityEngasganco extends ActionBarActivity {


    //ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*viewPager = (ViewPager) findViewById(R.id.fragmentPrincipal);

        FragmentManager fm = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fm));
        viewPager.setCurrentItem((3));*/
    }

    public void btnManHeiOnClick(View b)
    {
        Intent intent = new Intent(b.getContext(), MainActivityManobraDeArmas.class);
        startActivityForResult(intent, 0);
    }

    public void btnPancadasOnClick(View e)
    {
        Intent intent = new Intent(e.getContext(), MainActivityPancadas.class);
        startActivityForResult(intent, 0);
    }

    public void btnInicioOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivity.class);
        startActivityForResult(intent, 0);
    }
}



/*class MeuFragmentAdapter extends FragmentStatePagerAdapter {

    MeuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        Fragment fragment = null;

        if (position == 0){
            fragment = new fragment_mda3();
        }

        if (position == 1){
            fragment = new fragment_mda2();
        }

        if (position == 2){
            fragment = new fragment_mda();
        }

        if (position == 3){
            fragment = new fragment_engasganco();
        }

        if (position == 4){
            fragment = new fragment_panc();
        }

        if (position == 5){
            fragment = new fragment_panc_bebes();
        }

        return fragment;
    }

    @Override
    public int getCount(){
        return 6;
    }
}*/
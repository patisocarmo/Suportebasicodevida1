package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by a48991 on 03-03-2015.
 */
public class fragment_principal extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_principal, container, false);
    }

    public void btnSBVOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivitySBV.class);
        startActivityForResult(intent, 0);
    }

    public void btnEngasgancoOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivityEngasganco.class);
        startActivityForResult(intent, 0);
    }
}

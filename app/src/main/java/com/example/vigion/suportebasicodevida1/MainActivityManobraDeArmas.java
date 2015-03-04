package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivityManobraDeArmas extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_manobra_de_armas);
    }


    public void btnInicioOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivity.class);
        startActivityForResult(intent, 0);
    }

    public void btnPasso2MAOnClick(View p)
    {
        Intent intent = new Intent(p.getContext(), MainActivityManobraDeArmas2.class);
        startActivityForResult(intent, 0);
    }


}

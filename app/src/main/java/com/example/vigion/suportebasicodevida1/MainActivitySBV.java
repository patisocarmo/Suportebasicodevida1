package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivitySBV extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sbv);
    }

    public void btnIrConscienteOnClick(View b)
    {
        Intent intent = new Intent(b.getContext(), MainActivityConsciente.class);
        startActivityForResult(intent, 0);
    }

    public void btnIrInconscienteOnClick(View e)
    {
        Intent intent = new Intent(e.getContext(), MainActivityInconsciente.class);
        startActivityForResult(intent, 0);
    }

    public void btnInicioOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivity.class);
        startActivityForResult(intent, 0);
    }
}

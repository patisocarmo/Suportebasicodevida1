package com.example.vigion.suportebasicodevida1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivityInconsciente2 extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_inconsciente2);
    }

    public void btnInicioOnClick(View i)
    {
        Intent intent = new Intent(i.getContext(), MainActivity.class);
        startActivityForResult(intent, 0);
    }

    public void buttonPassoTresOnClick(View c)
    {
        Intent intent = new Intent(c.getContext(), MainActivityInconsciente3.class);
        startActivityForResult(intent, 0);
    }
}

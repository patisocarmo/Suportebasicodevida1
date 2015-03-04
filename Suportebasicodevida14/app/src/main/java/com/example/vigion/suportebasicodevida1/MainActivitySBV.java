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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_sbv, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

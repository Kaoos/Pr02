package com.example.ruben.pr02;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class inicio extends Activity  implements ReciveDatosFrag {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        if (savedInstanceState !=null) {
            return;
        }

        getFragmentManager()
                .beginTransaction()
                .add(R.id.containerGaleria, new galeria())
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.containerMiniaturas, new miniaturas())
                .commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
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

    @Override
    public void cambiaIMG(String msg) {
        TextView t = (TextView) findViewById(R.id.hello_world);
        t.setText(msg);
    }
}

package com.example.ruben.pr02;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
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
    public void cambiaIMG(Integer idBotton) {
        ImageView img = (ImageView) findViewById(R.id.imagenGaleria);
        TextView t = (TextView) findViewById(R.id.txtDesc);




        switch(idBotton) {

            case R.id.imageButton1:
                img.setBackgroundResource(R.drawable.img01);
                t.setText("La firma de Wolfsburgo continúa fiel a la idea "+
                        "de diseñar prototipos con alma de coupé sin importar "+
                        "el número de puertas ni el segmento al que pertenece. "+
                        "El Sport Coupé GTE es uno de sus ejercicios mejor logrados; "+
                        "la silueta se encuentra bien definida gracias a la luneta "+
                        "trasera cuya inclinación permite fusionarla con la caída prolongada "+
                        "del techo para conseguir una apariencia atlética y de fuerte sabor deportivo.");
                break;
            case R.id.imageButton2:
               img.setBackgroundResource(R.drawable.img02);
               t.setText("Como buen modelo de la gama GTE, el prototipo alemán recurre " +
                         "a un esquema híbrido enchufable como fuente de propulsión." +
                         "El sistema está compuesto por un V6 de 3.0 litros TSI que desarrolla " +
                         "299 CV y 500 Nm de par, y por dos motores eléctricos " +
                         "con potencias de 53 CV al frente y 114 CV atrás, todo esto " +
                         "asociado a un cambio DSG de 6 velocidades.");
                break;

            case R.id.imageButton3:
                img.setBackgroundResource(R.drawable.img03);
                t.setText("El resultado es una entrega total de 380 CV, " +
                            "con los que el prototipo puede acelerar de 0 a 100 km/h en 5,0 segundos, " +
                            "llegar hasta 250 km/h y homologar consumos de hasta 2.0 l/100 km. " +
                            "La conducción en modo 100% eléctrico se mantiene como opción, " +
                            "con una autonomía de 50 kilómetros; en total, con un tanque lleno, " +
                             "es de hasta 1.200 km");

                break;
        }



    }
}

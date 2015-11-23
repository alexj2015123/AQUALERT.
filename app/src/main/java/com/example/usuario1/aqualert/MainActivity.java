package com.example.usuario1.aqualert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.calcular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                final EditText peso = (EditText) findViewById(R.id.peso);

                final TextView resultado = (TextView) findViewById(R.id.respuesta);
                final TextView respuesta2 = (TextView) findViewById(R.id.respuesta2);

                Button calcular = (Button) findViewById(R.id.calcular);
                Button limpiar = (Button) findViewById(R.id.limpiar);

                final Double resul= 0.0;
                final Double resp = 0.0;

                limpiar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        peso.setText("");


                    }
                });


                calcular.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Entrada
                        double val = Double.parseDouble(peso.getText().toString());

                        //Proceso
                        Double resul = val /2;
                        Double resp= resul/8;

                        //Salida
                        resultado.setText(resul.toString() + "Onz  de  agua");
                        respuesta2.setText(resp.toString() + "Vasos de agua al dia");





                    }
                });







            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

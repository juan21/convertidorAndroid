package com.example.jonathan.practica1juan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText txtpeso ;
    private EditText txtdolar;
    private EditText txtcambio;
    private CheckBox dolares;
    private CheckBox pesos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtpeso= (EditText)findViewById(R.id.txtpeso);
        this.txtdolar=(EditText)findViewById(R.id.txtdolar);
        this.txtcambio=(EditText)findViewById(R.id.txtcambio);
        this.dolares=(CheckBox)findViewById(R.id.dolares);
        this.pesos=(CheckBox)findViewById(R.id.pesos);


    }

    public void OnClickpesos(View v){
        Double pesos,dolares, cambio;

        pesos = Double.parseDouble(txtpeso.getText().toString());
        cambio = Double.parseDouble(txtcambio.getText().toString());
        dolares = pesos / cambio;
        txtdolar.setText(Double.toString(dolares));
    }
    public void OnClickdolares(View a){

        Double pesos,dolares, cambio;

        dolares = Double.parseDouble(txtdolar.getText().toString());
        cambio = Double.parseDouble(txtcambio.getText().toString());
        pesos = dolares * cambio;
        txtpeso.setText(Double.toString(pesos));




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

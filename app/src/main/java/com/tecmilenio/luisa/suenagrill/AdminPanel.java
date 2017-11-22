package com.tecmilenio.luisa.suenagrill;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by luisa on 22/11/17.
 */

public class AdminPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panel_admin);

        Context contxt = getApplicationContext();
        CharSequence text =  "Bienvenido";
        Toast toast = Toast.makeText(contxt, text, Toast.LENGTH_LONG);
        toast.show();
    }

    public void empleados(View view){

        Intent intent = new Intent(getApplicationContext(),PanelEmpleados.class);
        startActivity(intent);

    }

}

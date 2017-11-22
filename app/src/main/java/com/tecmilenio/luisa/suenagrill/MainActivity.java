package com.tecmilenio.luisa.suenagrill;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               admin();
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


    public void entrada(View view) {
    }

    public void salida(View view) {
    }

    public void admin() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater linf = LayoutInflater.from(this);
        final View inflater = linf.inflate(R.layout.admin_dialog, null);

        final EditText name = (EditText) inflater.findViewById(R.id.username);
        final EditText pass = (EditText) inflater.findViewById(R.id.password);

        builder.setView(inflater);

        final AlertDialog.Builder builder1 = builder.setPositiveButton("Entrar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                Context contxt = getApplicationContext();

                String nombre = name.getText().toString();
                String clave = pass.getText().toString();
                if(nombre.equals("admin") && clave.equals("123456")){

                    Intent adminPanel = new Intent(contxt,AdminPanel.class);
                    startActivity(adminPanel);

                }

                    else{
                    CharSequence text =  "Usuario y/o contraseña incorrecta";
                    Toast toast = Toast.makeText(contxt, text, Toast.LENGTH_LONG);
                    toast.show();}

                dialog.cancel();


            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }



}

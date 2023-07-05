package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuDeOpciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_de_opciones);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus_de_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.menu_contextual){
            Toast.makeText(getApplicationContext(), "Presionaste Menu Contextual", Toast.LENGTH_SHORT).show();
            Intent menuContextual = new Intent(this, MenuContextual.class);
            startActivity(menuContextual);
        }
        else if (id==R.id.menu_popup) {
            Toast.makeText(getApplicationContext(), "Presionaste Menu Pop Up", Toast.LENGTH_SHORT).show();
            Intent menuPopUp = new Intent(this, MenuPopUp.class);
            startActivity(menuPopUp);
        }
        else if (id==R.id.pantalla_principal){
            Toast.makeText(getApplicationContext(), "Presionaste el Menu Principal", Toast.LENGTH_SHORT).show();
            Intent PantallaPrin = new Intent(this, MainActivity.class);
            startActivity(PantallaPrin);
        }
        else if (id==R.id.salir_app){
            Toast.makeText(getApplicationContext(), "Saliste de la Aplicacion", Toast.LENGTH_SHORT).show();
            finishAffinity();
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }
}
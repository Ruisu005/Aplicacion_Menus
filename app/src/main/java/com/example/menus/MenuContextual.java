package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class MenuContextual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_contextual);

        Button buttonMenuContextual = (Button) findViewById(R.id.btnMenuContextual);
        registerForContextMenu(buttonMenuContextual);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus_contextual, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.menu_opciones){
            Toast.makeText(getApplicationContext(), "Presionaste Menu de Opciones", Toast.LENGTH_SHORT).show();
            Intent menuOpciones = new Intent(this, MenuDeOpciones.class);
            startActivity(menuOpciones);
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

        return super.onContextItemSelected(item);
    }

}
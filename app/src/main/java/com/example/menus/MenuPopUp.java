package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuPopUp extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pop_up);
    }

    public void buttonMenuPopUp(View view){
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menus_popup);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        int id =menuItem.getItemId();
        if (id==R.id.menu_contextual){
            Toast.makeText(getApplicationContext(), "Presionaste Menu Contextual", Toast.LENGTH_SHORT).show();
            Intent menuContextual = new Intent(this, MenuContextual.class);
            startActivity(menuContextual);
        }
        else if (id==R.id.menu_opciones) {
            Toast.makeText(getApplicationContext(), "Presionaste Menu de Opciones", Toast.LENGTH_SHORT).show();
            Intent menuOpciones = new Intent(this, MenuDeOpciones.class);
            startActivity(menuOpciones);
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

        return false;
    }
}
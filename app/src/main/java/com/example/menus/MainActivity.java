package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuActionBar(View view) {
        Intent intent = new Intent(this, MenuDeOpciones.class);
        startActivity(intent);
    }
    public void menuContextual(View view) {
        Intent intent = new Intent(this, MenuContextual.class);
        startActivity(intent);
    }
    public void menuPopUp(View view) {
        Intent intent = new Intent(this, MenuPopUp.class);
        startActivity(intent);
    }
}
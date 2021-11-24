package com.example.ataulfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }

    public void map (View view)
    {
        Intent i= new Intent(this,MapsActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
}
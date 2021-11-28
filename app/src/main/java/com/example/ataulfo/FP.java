package com.example.ataulfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fp);
    }

    public void cocina (View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a la web";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/category/ensenanzas/formacion-profesional/cocina-y-restauracion/"));
        startActivity(intentNavegador);
    }
    public void smr (View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a la web";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesataulfoargenta.es/ciclosinformatica/sistemas-microinformaticos-y-redes/sistemas-microinformaticos-y-redes/"));
        startActivity(intentNavegador);
    }
    public void dam (View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a la web";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesataulfoargenta.es/ciclosinformatica/desarrollo-de-aplicaciones-multiplataforma/desarrollo-de-aplicaciones-multiplataforma/"));
        startActivity(intentNavegador);
    }
    public void daw (View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a la web";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesataulfoargenta.es/ciclosinformatica/desarrollo-de-aplicaciones-web/desarrollo-de-aplicaciones-web/"));
        startActivity(intentNavegador);
    }
}
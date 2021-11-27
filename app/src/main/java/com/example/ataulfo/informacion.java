package com.example.ataulfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }

    public void map (View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a Google map";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Intent i= new Intent(this,MapsActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
    public void url (View view){
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a la web";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intentNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iesataulfoargenta.es/wp/"));
        startActivity(intentNavegador);
    }

    public void onClickLlamada(View v) {
        Context context = getApplicationContext();
        CharSequence text = "Accediendo a marcador";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel: 942860637"));
        startActivity(callIntent);
    }

   /** public void onClickLlamada2(View v) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }**/


}
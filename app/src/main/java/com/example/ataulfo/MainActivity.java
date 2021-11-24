package com.example.ataulfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Añado animación de desplazamiento a la imagen del ScreenSplash
        Animation animacion1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        ImageView splash = findViewById(R.id.imgSplash);
        splash.setAnimation(animacion1);

        //ScreenSplash
        new Handler() .postDelayed (new Runnable() {
            @Override
            public void run(){
                Intent intent=new Intent (MainActivity.this,inicio.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}
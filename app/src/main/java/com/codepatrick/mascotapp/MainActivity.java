package com.codepatrick.mascotapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaDeMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(toolbar);

        listaDeMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaDeMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();
        this.capturoBoton();
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Jymy", 4, R.drawable.icons8_dog_96));
        mascotas.add(new Mascota("Mary", 5, R.drawable.icons8_dog_200));
        mascotas.add(new Mascota("Roy", 3, R.drawable.icons8_dog_heart_64));
        mascotas.add(new Mascota("Carl", 4, R.drawable.icons8_guide_dog_96));
        mascotas.add(new Mascota("Fred", 3, R.drawable.icons8_papillon_dog_96));
        mascotas.add(new Mascota("Rey", 4, R.drawable.icons8_poodle_64));
        mascotas.add(new Mascota("Guil", 4, R.drawable.icons8_pug_96));
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaDeMascotas.setAdapter(adaptador);
    }


    private void capturoBoton() {
        ImageView btn = findViewById(R.id.estrella);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ranking.class);
                startActivity(intent);
               // finish();
            }
        });

    }
}
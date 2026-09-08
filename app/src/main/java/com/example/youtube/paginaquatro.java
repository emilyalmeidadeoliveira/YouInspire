package com.example.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class paginaquatro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_paginaquatro);

        TextView paisLocalizacao = findViewById(R.id.paisLocalizacao);

        paisLocalizacao.setOnClickListener(v -> {
            Intent intent = new Intent(paginaquatro.this, paginacinco.class);
            startActivity(intent);
        });
    }
}
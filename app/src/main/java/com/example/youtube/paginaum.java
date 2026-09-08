package com.example.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class paginaum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_paginaum);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main),
                (v, insets) -> {
                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                    );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );

        // VIDEO 2
        ImageView video2 = findViewById(R.id.imageView16);

        video2.setOnClickListener(v -> {
            Intent intent = new Intent(paginaum.this, paginadois.class);
            startActivity(intent);
        });

        // PERFIL DO TOPO
        ImageView perfilTopo = findViewById(R.id.imageView6);

        perfilTopo.setOnClickListener(v -> {
            Intent intent = new Intent(paginaum.this, paginaquatro.class);
            startActivity(intent);
        });

        // PERFIL DA BARRA INFERIOR
        ImageView perfilBaixo = findViewById(R.id.imageView10);

        perfilBaixo.setOnClickListener(v -> {
            Intent intent = new Intent(paginaum.this, paginaquatro.class);
            startActivity(intent);
        });

    }
}
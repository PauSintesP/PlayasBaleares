package com.example.cercahabitatge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle InstanciaGuardada) {
        super.onCreate(InstanciaGuardada);
        setContentView(R.layout.activity_2);

        TextView NomMunicipi = findViewById(R.id.textInputMunicipi);
        String municipi = getIntent().getStringExtra("municipi");
        NomMunicipi.setText("Municipi: " + municipi);

        Button botoHome = findViewById(R.id.botoHome);
        botoHome.setOnClickListener(v -> {
            Intent intent = new Intent(Activity2.this, MainActivity.class);
            startActivity(intent);
        });

        Button botoDetall = findViewById(R.id.botoDetall);
        botoDetall.setOnClickListener(v -> {
            Intent intent = new Intent(Activity2.this, Activity3.class);
            intent.putExtra("municipi", municipi);
            startActivity(intent);
        });

        Button BotoSortir = findViewById(R.id.BotoSortir);
        BotoSortir.setOnClickListener(v -> finishAffinity());
    }
}
